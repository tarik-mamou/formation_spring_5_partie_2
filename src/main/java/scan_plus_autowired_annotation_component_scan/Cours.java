package scan_plus_autowired_annotation_component_scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cours {

	String nom;

	public Cours()
	{
		this.nom = "francais";
	}

	@Override
	public String toString() {
		return "Cours [nom=" + nom + "] "+ this.hashCode() ;
	}
}
