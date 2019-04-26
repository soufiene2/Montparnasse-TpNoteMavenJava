package com.infotel.TpNoteMavenJava.dao;

import org.springframework.stereotype.Repository;

import com.infotel.TpNoteMavenJava.dao.Idao;
import com.infotel.TpNoteMavenJava.metier.Dev;
import com.infotel.TpNoteMavenJava.metier.Devlogiciel;
import com.infotel.TpNoteMavenJava.metier.Etudiant;
@Repository
public class DaoImpl implements Idao{

	@Override
	public int ajouterDev(Dev d) {
		System.out.println("personne a été ajoutée");
		return d.getId();
	}

	@Override
	public int ajouterDevlogiciel(Devlogiciel dd) {
		System.out.println("personne a été ajoutée");
		return 0;
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		System.out.println(e);
		return e.getId();
	}

}
