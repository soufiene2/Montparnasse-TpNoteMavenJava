package com.infotel.TpNoteMaventJava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpNoteMavenJava.Service.Iservice;
import com.infotel.TpNoteMavenJava.Service.ServiceImpl;
import com.infotel.TpNoteMavenJava.metier.Devlogiciel;
import com.infotel.TpNoteMavenJava.metier.Etudiant;
import com.infotel.TpNoteMavenJava.metier.Formation;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    //1	
    	Devlogiciel dd = context.getBean("devlo1", Devlogiciel.class);
    	
    	System.out.println(dd);
        
        
    //2
    	Formation f1 = context.getBean("formation", Formation.class);//formation f minuscule de la classe
    	f1.setIdFormation(1);
    	f1.setNomFormation("Maths");
    	
    	Etudiant e1 = context.getBean("etudiant", Etudiant.class);
    	e1.setId(1);
    	e1.setNom("Dupont");
    	e1.setPrenom("Bernard");
    	e1.setFormation(f1);
    	

    	
    
    	
    	Iservice service = context.getBean("serviceImpl", ServiceImpl.class);
    	service.ajouterEtudiant(e1);
        
    	 context.close();
        
    }
}
