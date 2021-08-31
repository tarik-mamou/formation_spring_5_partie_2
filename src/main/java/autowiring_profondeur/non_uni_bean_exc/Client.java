package autowiring_profondeur.non_uni_bean_exc;

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
