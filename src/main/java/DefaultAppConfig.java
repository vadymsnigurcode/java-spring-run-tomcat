import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultAppConfig {
    @Bean
    public TomcatLauncher tomcatLauncher() {
        return new TomcatLauncher();
    }

}
