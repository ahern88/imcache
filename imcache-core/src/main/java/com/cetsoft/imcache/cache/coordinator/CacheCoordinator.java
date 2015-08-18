/*
 * Copyright (C) 2015 Cetsoft, http://www.cetsoft.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Author : Yusuf Aytas
 * Date   : Sep 23, 2013
 */
package com.cetsoft.imcache.cache.coordinator;

import com.cetsoft.imcache.cache.Cache;
import com.cetsoft.imcache.cache.CacheType;

/**
 * The Interface CacheCoordinator provides coordination of the various Cache
 * types. Each type of the cache is stored in CacheCoordinator and can be
 * retrieved from it whenever it is needed.
 */
public interface CacheCoordinator {
    
    /**
     * Gets the cache associated with type.
     *
     * @param <K> the key type
     * @param <V> the value type
     * @param type the type
     * @return the cache
     */
    <K, V> Cache<K, V> getCache(CacheType<K, V> type);
    
    /**
     * Adds the cache associated with type.
     *
     * @param <K> the key type
     * @param <V> the value type
     * @param type the type
     * @param cache the cache
     */
    <K, V> void addCache(CacheType<K, V> type, Cache<K, V> cache);
}
