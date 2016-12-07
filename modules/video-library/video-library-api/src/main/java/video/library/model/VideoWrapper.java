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

package video.library.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Video}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Video
 * @generated
 */
@ProviderType
public class VideoWrapper implements Video, ModelWrapper<Video> {
	public VideoWrapper(Video video) {
		_video = video;
	}

	@Override
	public Class<?> getModelClass() {
		return Video.class;
	}

	@Override
	public String getModelClassName() {
		return Video.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("videoId", getVideoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("description", getDescription());
		attributes.put("title", getTitle());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long videoId = (Long)attributes.get("videoId");

		if (videoId != null) {
			setVideoId(videoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _video.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _video.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _video.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _video.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<video.library.model.Video> toCacheModel() {
		return _video.toCacheModel();
	}

	@Override
	public int compareTo(video.library.model.Video video) {
		return _video.compareTo(video);
	}

	@Override
	public int hashCode() {
		return _video.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _video.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VideoWrapper((Video)_video.clone());
	}

	/**
	* Returns the description of this video.
	*
	* @return the description of this video
	*/
	@Override
	public java.lang.String getDescription() {
		return _video.getDescription();
	}

	/**
	* Returns the title of this video.
	*
	* @return the title of this video
	*/
	@Override
	public java.lang.String getTitle() {
		return _video.getTitle();
	}

	/**
	* Returns the user name of this video.
	*
	* @return the user name of this video
	*/
	@Override
	public java.lang.String getUserName() {
		return _video.getUserName();
	}

	/**
	* Returns the user uuid of this video.
	*
	* @return the user uuid of this video
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _video.getUserUuid();
	}

	/**
	* Returns the uuid of this video.
	*
	* @return the uuid of this video
	*/
	@Override
	public java.lang.String getUuid() {
		return _video.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _video.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _video.toXmlString();
	}

	/**
	* Returns the create date of this video.
	*
	* @return the create date of this video
	*/
	@Override
	public Date getCreateDate() {
		return _video.getCreateDate();
	}

	/**
	* Returns the modified date of this video.
	*
	* @return the modified date of this video
	*/
	@Override
	public Date getModifiedDate() {
		return _video.getModifiedDate();
	}

	/**
	* Returns the company ID of this video.
	*
	* @return the company ID of this video
	*/
	@Override
	public long getCompanyId() {
		return _video.getCompanyId();
	}

	/**
	* Returns the group ID of this video.
	*
	* @return the group ID of this video
	*/
	@Override
	public long getGroupId() {
		return _video.getGroupId();
	}

	/**
	* Returns the primary key of this video.
	*
	* @return the primary key of this video
	*/
	@Override
	public long getPrimaryKey() {
		return _video.getPrimaryKey();
	}

	/**
	* Returns the user ID of this video.
	*
	* @return the user ID of this video
	*/
	@Override
	public long getUserId() {
		return _video.getUserId();
	}

	/**
	* Returns the video ID of this video.
	*
	* @return the video ID of this video
	*/
	@Override
	public long getVideoId() {
		return _video.getVideoId();
	}

	@Override
	public video.library.model.Video toEscapedModel() {
		return new VideoWrapper(_video.toEscapedModel());
	}

	@Override
	public video.library.model.Video toUnescapedModel() {
		return new VideoWrapper(_video.toUnescapedModel());
	}

	@Override
	public void persist() {
		_video.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_video.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this video.
	*
	* @param companyId the company ID of this video
	*/
	@Override
	public void setCompanyId(long companyId) {
		_video.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this video.
	*
	* @param createDate the create date of this video
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_video.setCreateDate(createDate);
	}

	/**
	* Sets the description of this video.
	*
	* @param description the description of this video
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_video.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_video.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_video.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_video.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this video.
	*
	* @param groupId the group ID of this video
	*/
	@Override
	public void setGroupId(long groupId) {
		_video.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this video.
	*
	* @param modifiedDate the modified date of this video
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_video.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_video.setNew(n);
	}

	/**
	* Sets the primary key of this video.
	*
	* @param primaryKey the primary key of this video
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_video.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_video.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this video.
	*
	* @param title the title of this video
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_video.setTitle(title);
	}

	/**
	* Sets the user ID of this video.
	*
	* @param userId the user ID of this video
	*/
	@Override
	public void setUserId(long userId) {
		_video.setUserId(userId);
	}

	/**
	* Sets the user name of this video.
	*
	* @param userName the user name of this video
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_video.setUserName(userName);
	}

	/**
	* Sets the user uuid of this video.
	*
	* @param userUuid the user uuid of this video
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_video.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this video.
	*
	* @param uuid the uuid of this video
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_video.setUuid(uuid);
	}

	/**
	* Sets the video ID of this video.
	*
	* @param videoId the video ID of this video
	*/
	@Override
	public void setVideoId(long videoId) {
		_video.setVideoId(videoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VideoWrapper)) {
			return false;
		}

		VideoWrapper videoWrapper = (VideoWrapper)obj;

		if (Objects.equals(_video, videoWrapper._video)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _video.getStagedModelType();
	}

	@Override
	public Video getWrappedModel() {
		return _video;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _video.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _video.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_video.resetOriginalValues();
	}

	private final Video _video;
}