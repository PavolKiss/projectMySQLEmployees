package ServerEmployees;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloServerApplication extends Application<HelloServerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloServer";
    }

    @Override
    public void initialize(final Bootstrap<HelloServerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HelloServerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
