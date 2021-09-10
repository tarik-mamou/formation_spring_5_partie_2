package autowiring_profondeur.resoudre_exceptions;

import org.springframework.stereotype.Component;

//@Component("routiere")
@Component()
public class Routiere extends Voiture{

   public Routiere(){
       setImmatriculation("8888");
       setType("routiere");

   }
}
