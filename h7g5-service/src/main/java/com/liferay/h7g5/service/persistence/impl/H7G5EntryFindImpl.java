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

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.portal.kernel.dao.orm.Session;

public class H7G5EntryFindImpl {

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
         catch (Exception e) {
            throw new SystemException(e);
         }
         finally {
             closeSession((Session) session);
         }
         return null;
     }    
}