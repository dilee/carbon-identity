/*
 * Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.provisioning.cache;

import org.wso2.carbon.identity.application.common.cache.BaseCache;
import org.wso2.carbon.identity.application.common.cache.CacheEntry;
import org.wso2.carbon.identity.application.common.cache.CacheKey;
import org.wso2.carbon.identity.provisioning.IdentityProvisioningConstants;

public class ServiceProviderProvisioningConnectorCache extends BaseCache<CacheKey, CacheEntry> {

    private static volatile ServiceProviderProvisioningConnectorCache instance;

    public ServiceProviderProvisioningConnectorCache(String cacheName) {
        super(cacheName);

    }

    /**
     * @return
     */
    public static ServiceProviderProvisioningConnectorCache getInstance() {
        if (instance == null) {
            synchronized (ProvisioningConnectorCache.class) {

                if (instance == null) {
                    instance = new ServiceProviderProvisioningConnectorCache(IdentityProvisioningConstants.PropertyConfig.IDENTITY_PROVISIONING_SP_CONNECTOR_CACHE_NAME);
                }
            }
        }
        return instance;
    }

    @Override
    public void addToCache(CacheKey key, CacheEntry entry) {
        super.addToCache(key, entry);
    }

    @Override
    public CacheEntry getValueFromCache(CacheKey key) {
        return super.getValueFromCache(key);
    }

    @Override
    public void clearCacheEntry(CacheKey key) {
        super.clearCacheEntry(key);
    }
}
