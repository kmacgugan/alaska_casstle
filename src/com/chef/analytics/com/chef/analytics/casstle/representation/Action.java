package com.chef.analytics.com.chef.analytics.casstle.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * Created by kmacgugan on 6/30/15.
 */
public class Action {
    public UUID id;
    public String[] tags;
    public String type;
   @JsonProperty("recorded_at")
    public String recordedAt;
    @JsonProperty("remote_request_id")
    public String remoteRequestId;
    @JsonProperty("request_id")
    public String requestId;
    @JsonProperty("service_hostname")
    public String serviceHostname;
    public String task;
    public String endpoint;
    @JsonProperty("user_agent")
    public String userAgent;
    public Entity entity;

    class Entity {
        public String name;
        public String manage;
        public String parent;
        public String type;
        public String endpoint;
    }

    public class Properties {
        @JsonProperty("avatar_id")
        public String avatarUrl;
        public String email;
        @JsonProperty("gravatar_id")
        public String gravatarId;
    }

    public class Requestable {
        public String name;
        public String type;
        public String endpoint;
    } 

}
