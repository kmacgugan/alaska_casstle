package com.chef.analytics.com.chef.analytics.casstle.resource;

import com.chef.analytics.com.chef.analytics.casstle.dao.EntityActionService;
import com.chef.analytics.com.chef.analytics.casstle.representation.Action;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by kmacgugan on 6/30/15.
 */
@Path("actions")
@Produces(MediaType.APPLICATION_JSON)
public class EntityResource {
    final EntityActionService entityActionService;

    public EntityResource(EntityActionService entityActionService){
        this.entityActionService = entityActionService;
    }


    @GET
    public List<Action> getActions(@QueryParam("since") Optional<String> since,
                             @QueryParam("before") Optional<String> before,
                             @QueryParam("types") Optional<String> types){

        ArrayList<Action> actions = new ArrayList<Action>();
        if (since.isPresent() && before.isPresent() && types.isPresent()){

        } else if (since.isPresent() && before.isPresent()){

        }
        else if(types.isPresent()){

        }

        return actions;
    }


}
