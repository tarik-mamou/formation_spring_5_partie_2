package component_scan.xml.beans_a_scanner;


import component_scan.xml.beans_a_scanner.Additioneur;
import component_scan.xml.beans_a_scanner.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationXml {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Additioneur additioneur=context.getBean(Additioneur.class);
		Facture facture=context.getBean(Facture.class);
		System.out.println(facture);
		System.out.println(additioneur);

	}
}
