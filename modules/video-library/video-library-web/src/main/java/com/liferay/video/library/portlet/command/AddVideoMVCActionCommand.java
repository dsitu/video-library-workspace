package com.liferay.video.library.portlet.command;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.transcoder.api.TranscoderService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.video.library.model.Video;
import com.liferay.video.library.portlet.VideoLibraryPortletKeys;
import com.liferay.video.library.portlet.VideoLibraryPortletUtil;
import com.liferay.video.library.service.VideoLocalService;
import com.liferay.video.library.service.VideoService;

import java.io.File;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + VideoLibraryPortletKeys.PORTLET_NAME,
		"mvc.command.name=/video-library/video/add"
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

		File inputFile = new File(
			"/Users/vishalreddy/Movies/ga1-patch-install-tutorial.mp4");

		File outputFile = new File(
			"/Users/vishalreddy/Movies/ga1-patch-install-tutorial-out.mp4");

		_transcoderService.transcodeVideo(inputFile, outputFile);
	}

	@Reference
	protected VideoService _videoService;
	
	@Reference
	protected VideoLocalService _videoLocalService;

	@Reference
	protected TranscoderService _transcoderService;

}