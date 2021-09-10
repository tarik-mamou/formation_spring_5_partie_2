package autowiring_profondeur.types_injection.methode;



import autowiring_profondeur.types_injection.beans.Additioneur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FactureAutoMethode {

    Date date;

    private Additioneur additioneur;

    FactureAutoMethode() {

        this.date = new Date();
    }

    public FactureAutoMethode(Date date) {
        this.date = date;
    }

    @Autowired
    private void setAdditioneur(Additioneur additioneur) {
        this.additioneur = additioneur;
    }

    public Additioneur getAdditioneur() {
        return additioneur;
    }



    @Override
    public String toString() {
        return "Facture Methode {" +
                "date=" + date +
                '}';
    }
}
