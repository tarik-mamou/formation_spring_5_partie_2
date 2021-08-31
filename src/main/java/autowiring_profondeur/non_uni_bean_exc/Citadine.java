package autowiring_profondeur.non_uni_bean_exc;

import org.springframework.stereotype.Component;

public class Citadine extends Voiture {



    public Citadine() {
        setImmatriculation("9999");
        setType("citadine");
    }

}
