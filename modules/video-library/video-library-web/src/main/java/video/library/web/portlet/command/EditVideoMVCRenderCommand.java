package video.library.web.portlet.command;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

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
	service = MVCRenderCommand.class)
public class EditVideoMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse)
			throws PortletException {

		return "/video/edit_video.jsp";
	}

}