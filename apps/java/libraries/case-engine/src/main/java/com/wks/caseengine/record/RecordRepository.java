/*
 * WKS Platform - Open-Source Project
 * 
 * This file is part of the WKS Platform, an open-source project developed by WKS Power.
 * 
 * WKS Platform is licensed under the MIT License.
 * 
 * © 2021 WKS Power. All rights reserved.
 * 
 * For licensing information, see the LICENSE file in the root directory of the project.
 */
package com.wks.caseengine.record;

import java.util.List;

import com.google.gson.JsonObject;

public interface RecordRepository {

	List<JsonObject> find(final String recordTypeId) throws Exception;

	JsonObject get(final String recordTypeId, final String id) throws Exception;

	void save(final String recordTypeId, final JsonObject object) throws Exception;

	void update(final String recordTypeId, final String id, final JsonObject object) throws Exception;

	void delete(final String recordTypeId, final String id) throws Exception;

}
