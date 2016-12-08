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
	<liferay-frontend:add-menu-item title="Video"
		url="${addVideoURL}" />

<p>View Page</p>

<a href="${addVideoURL}"><p>Edit Page</p></a>

<liferay-ui:success key="video-added" message="video-added-successfully" />
<liferay-ui:success key="video-deleted" message="video-deleted-successfully" />
<liferay-ui:success key="video-updated" message="video-updated-successfully" />

<div class="container-fluid-1280">
	<div class="flex-container">

		<liferay-ui:search-container emptyResultsMessage="There are no videos uploaded.">
			<liferay-ui:search-container-results results="${Videos}" />
			<liferay-ui:search-container-row
				className="com.liferay.video.library.model.Video"
				modelVar="video">

				<portlet:renderURL var="viewSubmissionsURL">
					<portlet:param name="mvcRenderCommandName"
						value="/video-library/submissions/view" />
					<portlet:param name="redirect" value="${currentURL}" />
					<portlet:param name="videoId"
						value="${video.getAssignmentId()}" />
				</portlet:renderURL>

				<liferay-frontend:icon-vertical-card icon="cards2"
					title="${video.getTitle()}"
					actionJsp="/video/card_actions.jsp"
					cssClass="col-md-3 flex-item-break-xs card-row-padded"
					actionJspServletContext="<%= application %>" resultRow="<%=row %>"
					url="${viewSubmissionsURL}">

					<liferay-frontend:vertical-card-footer>
						<p class="truncate-text flex-item-center">${video.getDescription()}</p>
					</liferay-frontend:vertical-card-footer>
				</liferay-frontend:icon-vertical-card>

			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator markupView="lexicon" />
		</liferay-ui:search-container>
	</div>
</div>