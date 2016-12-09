package com.liferay.transcoder.api

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import java.io.File

@ImplementationClassName("com.liferay.trancoder.service.TranscoderServiceImpl")
@ProviderType
interface TranscoderService {
    fun transcodeVideo(inputFile: File, outputFile: File): Unit
}