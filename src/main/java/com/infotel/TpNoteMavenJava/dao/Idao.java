package com.infotel.TpNoteMavenJava.dao;

import com.infotel.TpNoteMavenJava.metier.Dev;
import com.infotel.TpNoteMavenJava.metier.Devlogiciel;
import com.infotel.TpNoteMavenJava.metier.Etudiant;

public interface Idao {
	
	public int ajouterDev(Dev d);
	public int ajouterDevlogiciel(Devlogiciel dd);
	public int ajouterEtudiant(Etudiant e);


}
