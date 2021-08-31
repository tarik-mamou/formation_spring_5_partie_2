package autowiring_profondeur.resoudre_exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {




    Voiture voiture;



    @Autowired
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    @Override
    public String toString() {
        return "Client{" +
                "voiture=" + voiture +
                '}';
    }
}
