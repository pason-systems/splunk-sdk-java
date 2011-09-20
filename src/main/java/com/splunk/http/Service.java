/*
 * Copyright 2011 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk.http;

public class Service {
    String scheme = "http";
    String host = "localhost";
    int port = 8089;

    public Service() {}

    public Service(String host) {
        this.host = host;
    }

    public Service(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Service(String host, int port, String scheme) {
        this.host = host;
        this.port = port;
        this.scheme = scheme;
    }

    public String getHost() { 
        return this.host; 
    }

    public void setHost(String value) {
        this.host = value;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int value) {
        this.port = value; 
    }

    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String value) {
        this.scheme = value;
    }

    public ResponseMessage request(RequestMessage message) {
        return null; // UNDONE
    }
}

