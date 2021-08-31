package autowiring_profondeur.resoudre_exceptions;


import org.springframework.stereotype.Component;

@Component
public abstract class Voiture {



    String immatriculation;
    private String type;

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Voiture() {
     }

    @Override
    public String toString() {
        return "Voiture{" +
                "immatriculation='" + immatriculation + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
