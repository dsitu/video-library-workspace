package video.library.web.portlet.command;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import video.library.model.Video;
import video.library.web.portlet.VideoLibraryPortletKeys;
import video.library.web.portlet.VideoLibraryPortletUtil;
import video.library.service.VideoLocalService;
import video.library.service.VideoService;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + VideoLibraryPortletKeys.PORTLET_NAME,
		"mvc.command.name=/video-library/video/edit"
	},
	service = MVCActionCommand.class)
public class AddVideoMVCActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse) 
	throws Exception {
		Video video = _videoLocalService.createVideo(0);

		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(actionRequest);

		VideoLibraryPortletUtil.assembleVideo(actionRequest, video);
	}

	@Reference
	protected VideoService _videoService;
	
	@Reference
	protected VideoLocalService _videoLocalService;

}