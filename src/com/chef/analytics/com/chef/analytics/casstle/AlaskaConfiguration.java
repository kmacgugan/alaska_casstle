package com.chef.analytics.com.chef.analytics.casstle;
import com.sun.istack.internal.NotNull;
import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.stuartgunter.dropwizard.cassandra.CassandraFactory;

import javax.validation.Valid;

/**
 * Created by kmacgugan on 6/29/15.
 */
public class AlaskaConfiguration extends Configuration{
    @Valid
    @NotNull
    private CassandraFactory cassandra = new CassandraFactory();

    @JsonProperty("cassandra")
    public CassandraFactory getCassandraFactory() {
        return cassandra;
    }

    @JsonProperty("cassandra")
    public void setCassandraFactory(CassandraFactory cassandra) {
        this.cassandra = cassandra;
    }
}
