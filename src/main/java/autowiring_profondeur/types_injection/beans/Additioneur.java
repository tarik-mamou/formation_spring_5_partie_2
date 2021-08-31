package autowiring_profondeur.types_injection.beans;


import org.springframework.stereotype.Service;

@Service
public class Additioneur {

    private  String nom;

    @Override
    public String toString() {
        return "Additioneur{" +
                "nom='" + nom + '\'' +
                '}';
    }

    public Additioneur() {
        nom="additioneur";
    }

    public static int additioner(int a, int b) {
        return a + b;

    }
}
