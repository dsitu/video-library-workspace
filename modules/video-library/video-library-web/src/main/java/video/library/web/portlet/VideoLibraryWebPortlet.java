package video.library.web.portlet;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import video.library.service.VideoLocalService;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Video Library Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"com.liferay.portlet.add-default-resource=true",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class VideoLibraryWebPortlet extends MVCPortlet {
	@Override
	public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
            throws IOException, PortletException {

        ThemeDisplay themeDisplay =
                (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        long groupId = themeDisplay.getScopeGroupId();

//		renderRequest.setAttribute(
//                 "Videos",
//                 _videoLocalService.getVideos(-1, -1));
//		renderRequest.setAttribute(
//                 "VideosCount",
//                 _videoLocalService.getVideosCount());

        super.doView(renderRequest, renderResponse);
    }

    @Reference(cardinality=ReferenceCardinality.MANDATORY)
    protected VideoLocalService _videoLocalService;
}