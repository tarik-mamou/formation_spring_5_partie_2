package scan_plus_autowired_annotation_component_scan;

import org.springframework.beans.factory.annotation.Autowired;

public class Etudiant {

	private Cours cours;


	public Etudiant(Cours cours) {
		this.cours = cours;

	}

	@Override
	public String toString() {
		return "Etudiant [cours=" + cours + "]";
	}

}
