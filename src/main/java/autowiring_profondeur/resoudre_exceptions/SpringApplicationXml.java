package autowiring_profondeur.resoudre_exceptions;



import autowiring_profondeur.types_injection.champ.FactureAutoChamp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationXml {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_types_injection_resoudre_exceptions.xml");

		//genere NoUniqueBeanDefinitionException

		Client client=context.getBean(Client.class);

		System.out.println(client );


	}
}
