package lifecycle_annotations;


import autowiring_profondeur.types_injection.champ.FactureAutoChamp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationXml {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationApplication.class);


        Voiture voiture = context.getBean(Voiture.class);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                context.close();
            }
        });


    }
}
