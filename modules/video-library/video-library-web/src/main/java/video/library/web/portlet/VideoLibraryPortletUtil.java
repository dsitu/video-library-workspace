package video.library.web.portlet;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import video.library.model.Video;

public class VideoLibraryPortletUtil {

	public static void assembleVideo(
		ActionRequest request, Video video)
			throws PortalException {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		video.setCompanyId(themeDisplay.getCompanyId());
		video.setGroupId(themeDisplay.getScopeGroupId());
		video.setUserId(themeDisplay.getUserId());
		video.setCreateDate(DateUtil.newDate());
		video.setModifiedDate(DateUtil.newDate());
	}
}
