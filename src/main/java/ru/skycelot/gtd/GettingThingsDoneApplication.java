package ru.skycelot.gtd;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class GettingThingsDoneApplication extends Application<GettingThingsDoneConfiguration> {

    public static void main(final String[] args) throws Exception {
        new GettingThingsDoneApplication().run(args);
    }

    @Override
    public String getName() {
        return "GettingThingsDone";
    }

    @Override
    public void initialize(final Bootstrap<GettingThingsDoneConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final GettingThingsDoneConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
