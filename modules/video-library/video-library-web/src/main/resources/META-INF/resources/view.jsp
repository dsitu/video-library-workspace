<%@ include file="/init.jsp" %>

<portlet:renderURL var="addVideoURL">
	<portlet:param name="mvcRenderCommandName"
				   value="/video-library/video/edit" />
	<portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>

<c:if test="${hasAddVideoPermission}">
	<liferay-frontend:add-menu>
		<liferay-frontend:add-menu-item title="Video"
			url="${addVideoURL}" />
	</liferay-frontend:add-menu>
</c:if>

<p>Paginated videos</p>