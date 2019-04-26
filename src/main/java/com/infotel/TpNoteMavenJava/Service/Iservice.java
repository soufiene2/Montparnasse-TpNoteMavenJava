package com.infotel.TpNoteMavenJava.Service;


import com.infotel.TpNoteMavenJava.metier.Dev;
import com.infotel.TpNoteMavenJava.metier.Devlogiciel;
import com.infotel.TpNoteMavenJava.metier.Etudiant;

public interface Iservice {
	public int ajouterDev(Dev d);
	public int ajouterDevlogiciel(Devlogiciel d);
	public int ajouterEtudiant(Etudiant e);
}
