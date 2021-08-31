package autowiring_profondeur.resoudre_exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("citadine")
public class Citadine extends Voiture{



    public Citadine() {
        setImmatriculation("9999");
        setType("citadine");
    }

}
