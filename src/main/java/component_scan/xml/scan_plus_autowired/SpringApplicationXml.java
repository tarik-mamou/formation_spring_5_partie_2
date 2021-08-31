package component_scan.xml.scan_plus_autowired;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		Facture facture=context.getBean(Facture.class);

		System.out.println(facture.getAdditioneur() );


	}
}
