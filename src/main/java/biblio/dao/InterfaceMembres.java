package biblio.dao;

import java.util.List;

import biblio.metier.Membre;

public interface InterfaceMembres {
	
	 void ajouter(Membre membre);
	    List<Membre> afficher();
	    void supprimer(int idMembre);
	    void modifier(Membre membre);
	
}
