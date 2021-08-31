package autowiring_profondeur.types_injection.champ;



import autowiring_profondeur.types_injection.beans.Additioneur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FactureAutoChamp {

    Date date;
    @Autowired
    private Additioneur additioneur;

    FactureAutoChamp() {

        this.date = new Date();
    }

    public FactureAutoChamp(Date date) {
        this.date = date;
    }


    public Additioneur getAdditioneur() {
        return additioneur;
    }



    @Override
    public String toString() {
        return "Facture{" +
                "date=" + date +
                '}';
    }
}
