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

package com.liferay.h7g5.web.internal.portlet;

import com.liferay.h7g5.service.H7G5FolderLocalService;
import com.liferay.h7g5.service.H7G5FolderService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author José Abelenda
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"javax.portlet.display-name=H7G5"
	},
	service = Portlet.class
)
public class H7G5Portlet extends GenericPortlet {

	public H7G5Portlet() {
		System.out.println("Constructing H7G5Portlet");
	}

	@Override
	protected void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException {

		System.out.println("Invoking H7G5Portlet#doView");

		PrintWriter printWriter = renderResponse.getWriter();

		printWriter.println("Hello, H7G5!");

		System.out.println(
			"There are " + _h7G5FolderLocalService.getH7G5FoldersCount() +
				" folders.");

		try {
			_h7G5FolderService.addMyCustomH7G5FolderWithPermissionCheck(
				StringUtil.randomString(), StringUtil.randomString());
		}
		catch (PortalException portalException) {
			printWriter.println("\n" + portalException.getMessage());
		}

		System.out.println(
			"After adding a new folder, there are now " +
				_h7G5FolderLocalService.getH7G5FoldersCount() + " folders.");
	}

	@Reference
	private H7G5FolderLocalService _h7G5FolderLocalService;

	@Reference
	private H7G5FolderService _h7G5FolderService;

}