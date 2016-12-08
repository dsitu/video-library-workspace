<%@ include file="/init.jsp"%>

<%
	Video video =
		(Video) request.getAttribute("video");
	String redirect = request.getParameter("redirect");
	String title = (String) request.getAttribute("title");
		String description = "";
	
	if (video != null) {
		description = video.getDescription();
	}

	renderResponse.setTitle(title);
	portletDisplay.setShowBackIcon(true);
	portletDisplay.setURLBack(redirect);
%>

<p>Edit Video Page</p>


<c:choose>
	<c:when test="${not empty video}">
		<portlet:actionURL var="videoActionURL"
			name="/video-library/video/edit">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>
	</c:when>
	<c:otherwise>
		<portlet:actionURL var="videoActionURL"
			name="/video-library/video/add">
			<portlet:param name="redirect" value="${param.redirect}" />
		</portlet:actionURL>
	</c:otherwise>
</c:choose>
<liferay-ui:error key="video-error" message="video-general-error" />
<liferay-ui:error key="video-id" message="video-id-error" />
<liferay-ui:error key="video-title" message="video-title-error" />
<liferay-ui:error key="video-description" message="video-description-error" />
<liferay-ui:error key="video-date" message="video-date-error" />


<div class="container-fluid-1280">

	<aui:model-context bean="<%=video%>" model="<%=Video.class%>" />

	<aui:form name="fm" action="${videoActionURL}" 
			onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "savePage();" %>' >

		<aui:input name="videoId" field="videoId" type="hidden" />
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset>
				<aui:input name="title">
					<aui:validator errorMessage="video-title-format-error" name="custom">
					function(val, fieldNode, ruleValue) {
						var wordExpression = 
							new RegExp("^[^\\[\\]\\^$<>]*$");
						
						return wordExpression.test(val);
					}
					</aui:validator>
					<aui:validator name="required" />
				</aui:input>

				<label for="description"><liferay-ui:message key="description" /></label>	
				<div class="entry-description">
					<liferay-ui:input-editor contents="${video.description}"
					 editorName='alloyeditor'
					 name="descriptionEditor" placeholder="description" />
				</div>
				<aui:input name="description" type="hidden" />

				<aui:input name="dueDate">
					<aui:validator name="required" />
				</aui:input>
			</aui:fieldset>
		</aui:fieldset-group>
		<aui:button cssClass="btn-lg" type="submit" />
	</aui:form>

</div>

<aui:script>
	function <portlet:namespace />savePage() {
		var form = AUI.$(document.<portlet:namespace />fm);

		var descriptionEditor = window.<portlet:namespace />descriptionEditor;

		form.fm('description').val(descriptionEditor.getHTML());

		submitForm(form);
	}
</aui:script>
