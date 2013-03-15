/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.cloud.utils.storage.encoding;

public class DecodedDataStore {
    private final String role;
    private final String uuid;
    private final String providerName;
    private final String scheme;
    private final String url;
    private final String server;
    private final String path;
    
    public DecodedDataStore(String role,
            String uuid,
            String providerName,
            String scheme,
            String url,
            String server,
            String path) {
        this.role = role;
        this.uuid = uuid;
        this.providerName = providerName;
        this.scheme = scheme;
        this.url = url;
        this.server = server;
        this.path = path;
    }
    
    public String getRole() {
        return this.role;
    }
    
    public String getUuid() {
        return this.uuid;
    }
    
    public String getProviderName() {
        return this.providerName;
    }
    
    public String getScheme() {
        return this.scheme;
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public String getServer() {
        return this.server;
    }
    
    public String getPath() {
        return this.path;
    }
}