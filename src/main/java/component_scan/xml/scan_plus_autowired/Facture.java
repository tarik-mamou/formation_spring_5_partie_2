package component_scan.xml.scan_plus_autowired;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Facture {

    Date date;

    private Additioneur additioneur;

    Facture() {

        this.date = new Date();
    }

    public Facture(Date date) {
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
        return "Facture{" +
                "date=" + date +
                '}';
    }
}
