package component_scan.xml.beans_a_scanner;


import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Facture {

    Date date;

    Facture() {
        this.date = new Date();
    }

    public Facture(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Facture{" +
                "date=" + date +
                '}';
    }
}
