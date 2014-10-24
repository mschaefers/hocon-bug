import com.jasonclawson.dropwizardry.config.hocon.HoconConfigurationBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TestApplication extends Application<TestConfiguration> {

    // dirty, only for unit test
    private TestConfiguration configuration;

    @Override
    public void initialize(Bootstrap<TestConfiguration> bootstrap) {
        bootstrap.addBundle(new HoconConfigurationBundle());
    }

    @Override
    public void run(TestConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().disable();
        this.configuration = configuration;
    }

    public TestConfiguration getConfiguration() {
        return configuration;
    }
}
