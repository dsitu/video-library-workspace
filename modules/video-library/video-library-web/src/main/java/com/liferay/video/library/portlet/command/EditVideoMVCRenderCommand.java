package com.liferay.video.library.portlet.command;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.video.library.portlet.VideoLibraryPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import com.liferay.video.library.model.Video;
import com.liferay.video.library.service.VideoLocalService;

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
System.out.println("ASL:FKJFGL:SKFJSL:KDFJ");
		Video video = null;

		long videoId = ParamUtil.getLong(
			renderRequest, "videoId", 0);

		String title = "Create Video";

		if (videoId > 0) {
			try {
				video =
					_videoLocalService.getVideo(videoId);

				title = "Edit Video";
			}
			catch (PortalException e) {
				e.printStackTrace();
			}
		}

		return "/video/edit_video.jsp";
	}

	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	private VideoLocalService _videoLocalService;

}