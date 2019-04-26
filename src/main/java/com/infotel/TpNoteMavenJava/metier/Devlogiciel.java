package com.infotel.TpNoteMavenJava.metier;

import java.util.List;


public class Devlogiciel {

		private Dev developpeur;
		private Dev chefdeveloppeur;
		
		private List<Dev> Dev;

		public Dev getDeveloppeur() {
			return developpeur;
		}

		public void setDeveloppeur(Dev developpeur) {
			this.developpeur = developpeur;
		}

		public Dev getChefdeveloppeur() {
			return chefdeveloppeur;
		}

		public void setChefdeveloppeur(Dev chefdeveloppeur) {
			this.chefdeveloppeur = chefdeveloppeur;
		}

		public List<Dev> getDev() {
			return Dev;
		}

		public void setDev(List<Dev> dev) {
			Dev = dev;
		}

		@Override
		public String toString() {
			return "Devlogiciel [developpeur=" + developpeur + ", chefdeveloppeur=" + chefdeveloppeur + ", Dev=" + Dev
					+ "]";
		}
		

		
		
}
