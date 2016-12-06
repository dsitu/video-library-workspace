/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package video.library.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VideoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VideoLocalService
 * @generated
 */
@ProviderType
public class VideoLocalServiceWrapper implements VideoLocalService,
	ServiceWrapper<VideoLocalService> {
	public VideoLocalServiceWrapper(VideoLocalService videoLocalService) {
		_videoLocalService = videoLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _videoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _videoLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _videoLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _videoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of videos.
	*
	* @return the number of videos
	*/
	@Override
	public int getVideosCount() {
		return _videoLocalService.getVideosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _videoLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _videoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link video.library.model.impl.VideoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _videoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link video.library.model.impl.VideoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _videoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the videos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link video.library.model.impl.VideoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videos
	* @param end the upper bound of the range of videos (not inclusive)
	* @return the range of videos
	*/
	@Override
	public java.util.List<video.library.model.Video> getVideos(int start,
		int end) {
		return _videoLocalService.getVideos(start, end);
	}

	/**
	* Returns all the videos matching the UUID and company.
	*
	* @param uuid the UUID of the videos
	* @param companyId the primary key of the company
	* @return the matching videos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<video.library.model.Video> getVideosByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _videoLocalService.getVideosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of videos matching the UUID and company.
	*
	* @param uuid the UUID of the videos
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of videos
	* @param end the upper bound of the range of videos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching videos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<video.library.model.Video> getVideosByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<video.library.model.Video> orderByComparator) {
		return _videoLocalService.getVideosByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _videoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _videoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the video to the database. Also notifies the appropriate model listeners.
	*
	* @param video the video
	* @return the video that was added
	*/
	@Override
	public video.library.model.Video addVideo(video.library.model.Video video) {
		return _videoLocalService.addVideo(video);
	}

	/**
	* Creates a new video with the primary key. Does not add the video to the database.
	*
	* @param videoId the primary key for the new video
	* @return the new video
	*/
	@Override
	public video.library.model.Video createVideo(long videoId) {
		return _videoLocalService.createVideo(videoId);
	}

	/**
	* Deletes the video with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param videoId the primary key of the video
	* @return the video that was removed
	* @throws PortalException if a video with the primary key could not be found
	*/
	@Override
	public video.library.model.Video deleteVideo(long videoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videoLocalService.deleteVideo(videoId);
	}

	/**
	* Deletes the video from the database. Also notifies the appropriate model listeners.
	*
	* @param video the video
	* @return the video that was removed
	*/
	@Override
	public video.library.model.Video deleteVideo(
		video.library.model.Video video) {
		return _videoLocalService.deleteVideo(video);
	}

	@Override
	public video.library.model.Video fetchVideo(long videoId) {
		return _videoLocalService.fetchVideo(videoId);
	}

	/**
	* Returns the video matching the UUID and group.
	*
	* @param uuid the video's UUID
	* @param groupId the primary key of the group
	* @return the matching video, or <code>null</code> if a matching video could not be found
	*/
	@Override
	public video.library.model.Video fetchVideoByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _videoLocalService.fetchVideoByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the video with the primary key.
	*
	* @param videoId the primary key of the video
	* @return the video
	* @throws PortalException if a video with the primary key could not be found
	*/
	@Override
	public video.library.model.Video getVideo(long videoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videoLocalService.getVideo(videoId);
	}

	/**
	* Returns the video matching the UUID and group.
	*
	* @param uuid the video's UUID
	* @param groupId the primary key of the group
	* @return the matching video
	* @throws PortalException if a matching video could not be found
	*/
	@Override
	public video.library.model.Video getVideoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videoLocalService.getVideoByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the video in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param video the video
	* @return the video that was updated
	*/
	@Override
	public video.library.model.Video updateVideo(
		video.library.model.Video video) {
		return _videoLocalService.updateVideo(video);
	}

	@Override
	public VideoLocalService getWrappedService() {
		return _videoLocalService;
	}

	@Override
	public void setWrappedService(VideoLocalService videoLocalService) {
		_videoLocalService = videoLocalService;
	}

	private VideoLocalService _videoLocalService;
}