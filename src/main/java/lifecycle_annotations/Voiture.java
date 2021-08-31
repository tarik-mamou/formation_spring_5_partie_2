package lifecycle_annotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public  class Voiture {



    String immatriculation;

    private String type;


    public Voiture(String immatriculation, String type) {
        this.immatriculation = immatriculation;
        this.type = type;
    }




    public Voiture() {
    }

     @PostConstruct
    public void init(){
         System.out.println("methode init appelée");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("methode destory  appelée");
    }


    @Override
    public String toString() {
        return "Voiture{" +
                "immatriculation='" + immatriculation + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}