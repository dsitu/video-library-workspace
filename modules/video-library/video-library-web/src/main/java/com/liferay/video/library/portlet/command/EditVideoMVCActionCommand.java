package com.liferay.video.library.portlet.command;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.video.library.model.Video;
import com.liferay.video.library.portlet.VideoLibraryPortletKeys;
import com.liferay.video.library.portlet.VideoLibraryPortletUtil;
import com.liferay.video.library.service.VideoService;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + VideoLibraryPortletKeys.PORTLET_NAME,
		"mvc.command.name=/video-library/video/edit"
	},
	service = MVCActionCommand.class)
public class EditVideoMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

//		long videoId = ParamUtil.getLong(actionRequest, "videoId");
//
//		Video video = _videoService.getVideo(videoId);
//
//		VideoLibraryPortletKeys.assembleVideo(actionRequest, video);
//
//		List<String> errors = new ArrayList<>();
//
//		if (VideoValidator.isVideoValid(video, errors)) {
//
//			_videoService.updateVideo(video);
//
//			SessionMessages.add(actionRequest, "video-updated");
//
//			sendRedirect(actionRequest, actionResponse);
//		} else {
//			throw new Exception("Invalid form data");
//		}
	}

	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	protected VideoService _videoService;
}
