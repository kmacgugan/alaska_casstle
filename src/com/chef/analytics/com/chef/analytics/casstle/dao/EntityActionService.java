package com.chef.analytics.com.chef.analytics.casstle.dao;

import com.chef.analytics.com.chef.analytics.casstle.representation.Action;
import com.datastax.driver.core.*;
import com.datastax.driver.core.querybuilder.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kmacgugan on 7/6/15.
 */
public class EntityActionService {
    final Cluster cassandra;
    String keyspace = "proto";
    String table = "entity_actions";

    public EntityActionService(Cluster cassandra){
        this.cassandra = cassandra;
    }

    private Session getSession(){
        cassandra.connect();
    }

    public List<Action> getActionByType(String type){
        Statement statement = QueryBuilder
                .select()
                .all()
                .from(keyspace, table);
        return getSession()
                .execute(statement)
                .all();
    }

    private List<Action> makeActions(ResultSet rs){
        rs.
    }


}
