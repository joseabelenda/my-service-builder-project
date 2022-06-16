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

package com.liferay.h7g5.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.h7g5.service.http.H7G5FolderServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class H7G5FolderSoap implements Serializable {

	public static H7G5FolderSoap toSoapModel(H7G5Folder model) {
		H7G5FolderSoap soapModel = new H7G5FolderSoap();

		soapModel.setH7g5FolderId(model.getH7g5FolderId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDescription(model.getDescription());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static H7G5FolderSoap[] toSoapModels(H7G5Folder[] models) {
		H7G5FolderSoap[] soapModels = new H7G5FolderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static H7G5FolderSoap[][] toSoapModels(H7G5Folder[][] models) {
		H7G5FolderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new H7G5FolderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new H7G5FolderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static H7G5FolderSoap[] toSoapModels(List<H7G5Folder> models) {
		List<H7G5FolderSoap> soapModels = new ArrayList<H7G5FolderSoap>(
			models.size());

		for (H7G5Folder model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new H7G5FolderSoap[soapModels.size()]);
	}

	public H7G5FolderSoap() {
	}

	public long getPrimaryKey() {
		return _h7g5FolderId;
	}

	public void setPrimaryKey(long pk) {
		setH7g5FolderId(pk);
	}

	public long getH7g5FolderId() {
		return _h7g5FolderId;
	}

	public void setH7g5FolderId(long h7g5FolderId) {
		_h7g5FolderId = h7g5FolderId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _h7g5FolderId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _description;
	private String _name;

}