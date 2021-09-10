package scan_plus_autowired_annotation_component_scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigurationApplication {
   /* @Bean
    public Cours monCours() {
        return new Cours("francais");
    }
    */


    @Bean
    public Etudiant monEtudiant(Cours cours) {
        return new Etudiant(cours);
    }
}

