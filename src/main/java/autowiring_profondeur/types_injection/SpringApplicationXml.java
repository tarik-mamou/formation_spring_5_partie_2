package autowiring_profondeur.types_injection;



import autowiring_profondeur.types_injection.champ.FactureAutoChamp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationXml {

	//commenter a chaque fois l annotation componet
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_2.xml");

		//FactureAutoConstructeur facture=context.getBean(FactureAutoConstructeur.class);

		//FactureAutoMethode facture=context.getBean(FactureAutoMethode.class);
		FactureAutoChamp facture=context.getBean(FactureAutoChamp.class);

		System.out.println(facture.getAdditioneur() );


	}
}
