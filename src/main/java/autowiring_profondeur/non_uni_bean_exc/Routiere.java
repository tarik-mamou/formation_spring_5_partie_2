package autowiring_profondeur.non_uni_bean_exc;

import org.springframework.stereotype.Component;

public class Routiere extends Voiture {

   public Routiere(){
       setImmatriculation("8888");
       setType("routiere");

   }
}
