package com.chef.analytics.com.chef.analytics.casstle;
import com.chef.analytics.com.chef.analytics.casstle.dao.EntityActionService;
import com.chef.analytics.com.chef.analytics.casstle.resource.EntityResource;
import com.datastax.driver.core.Cluster;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/*
 * Created by kmacgugan on 6/29/15.
 */
public class AlaskaApplication extends Application<AlaskaConfiguration>{
    public static void main(String[] args) throws Exception {
        new AlaskaApplication().run(args);
    }

    @Override
    public void run(AlaskaConfiguration configuration, Environment environment) throws Exception {
        Cluster cassandra = configuration.getCassandraFactory().build(environment);
        EntityActionService entityActionService = new EntityActionService(cassandra);

        final EntityResource resource = new EntityResource(entityActionService);
        environment.jersey().register(resource);

    }
}
