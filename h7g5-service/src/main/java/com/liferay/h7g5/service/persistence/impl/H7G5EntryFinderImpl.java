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
package com.liferay.h7g5.service.persistence.impl;

import com.liferay.h7g5.service.persistence.H7G5EntryFinder;

import java.util.List;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.H7G5EntryLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;


import org.osgi.service.component.annotations.Component;

public class H7G5EntryFinderImpl extends H7G5EntryFinderBaseImpl implements H7G5EntryFinder {
    
    public List<H7G5Entry> findByH_D_N(long h7g5FolderId, String description, String name) {
        Session session = null;

        try {
            session = openSession();

            ClassLoader classLoader = getClass().getClassLoader();

            DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                .add(RestrictionsFactoryUtil.eq("description", description))
                .add(RestrictionsFactoryUtil.eq("h7g5FolderId", h7g5FolderId))
                .add(RestrictionsFactoryUtil.eq("name", name));

            return H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);
        }
        catch (Exception exception) {
            throw new SystemException(exception);
        }
        finally {
            closeSession(session);
        }
    }
    
    public List<H7G5Entry> findByKey(String key) {
        Session session = null;

         try {
             session = openSession();

             ClassLoader classLoader = getClass().getClassLoader();

             DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                 .add(RestrictionsFactoryUtil.eq("key", key));

             return H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);
         }
         catch (Exception exception) {
            throw new SystemException(exception);
         }
         finally {
             closeSession(session);
        }
    }
    
    public List<H7G5Entry> findByName(String name) {
        Session session = null;
         try {
             session = openSession();

             ClassLoader classLoader = getClass().getClassLoader();

             DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                 .add(RestrictionsFactoryUtil.eq("name", name));

             List<H7G5Entry> entries = H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);

             return (List<H7G5Entry>) entries;
         }
         catch (Exception exception) {
            throw new SystemException(exception);
         }
         finally {
             closeSession((Session) session);
         }
    }

    public List<H7G5Entry> findByH7G5FolderId(long h7g5FolderId) {
        Session session = null;

         try {
             session = openSession();

             ClassLoader classLoader = getClass().getClassLoader();

             DynamicQuery entryQuery = DynamicQueryFactoryUtil.forClass(H7G5Entry.class, classLoader)
                 .add(RestrictionsFactoryUtil.eq("h7g5FolderId", h7g5FolderId));

             return H7G5EntryLocalServiceUtil.dynamicQuery(entryQuery);
         }
         catch (Exception exception) {
            throw new SystemException(exception);
         }
         finally {
             closeSession(session);
         }
    }
}