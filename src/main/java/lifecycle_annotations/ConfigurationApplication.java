package lifecycle_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApplication {



    @Bean
    public Voiture maVoiture() {

        return new Voiture("88888","routiere");
    }
}