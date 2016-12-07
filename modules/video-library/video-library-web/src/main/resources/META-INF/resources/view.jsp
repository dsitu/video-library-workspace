<%@ include file="/init.jsp" %>

<portlet:renderURL var="addVideoURL">
	<portlet:param name="mvcRenderCommandName"
				   value="/video-library/video/edit" />
	<portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>

<liferay-frontend:add-menu>
	<liferay-frontend:add-menu-item title="Video"
		url="${addVideoURL}" />
</liferay-frontend:add-menu>

<a href="${addVideoURL}"><p>Add Video</p></a>

<p>Paginated videos</p>