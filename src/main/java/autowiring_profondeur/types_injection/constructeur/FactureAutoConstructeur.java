package autowiring_profondeur.types_injection.constructeur;



import autowiring_profondeur.types_injection.beans.Additioneur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FactureAutoConstructeur {

    Date date;

    private Additioneur additioneur;

    FactureAutoConstructeur() {

        this.date = new Date();
    }

    @Autowired
    public FactureAutoConstructeur(Additioneur additioneur) {

        this.additioneur = additioneur;
    }

    @Autowired
    public Additioneur getAdditioneur() {
        return additioneur;
    }



    @Override
    public String toString() {
        return "Factur Constructeur{" +
                "date=" + date +
                '}';
    }
}
