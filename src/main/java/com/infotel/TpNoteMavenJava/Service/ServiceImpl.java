package com.infotel.TpNoteMavenJava.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpNoteMavenJava.dao.Idao;
import com.infotel.TpNoteMavenJava.metier.Dev;
import com.infotel.TpNoteMavenJava.metier.Devlogiciel;
import com.infotel.TpNoteMavenJava.metier.Etudiant;
@Service
public class ServiceImpl implements Iservice{
@Autowired
	private Idao dao;


	public Idao getDao() {
	return dao;
}

public void setDao(Idao dao) {
	this.dao = dao;
}

	@Override
	public int ajouterDev(Dev d) {
		// TODO Auto-generated method stub
		return dao.ajouterDev(d);
	}

	@Override
	public int ajouterDevlogiciel(Devlogiciel dd) {
		// TODO Auto-generated method stub
		return dao.ajouterDevlogiciel(dd);
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.ajouterEtudiant(e);
	}

}
