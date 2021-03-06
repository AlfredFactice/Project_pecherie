package donne;

import java.util.ArrayList;

public abstract class CommunAuxDonne implements CommunAuDonne {

	public CommunAuxDonne(int numero) {
		// TODO Auto-generated constructor stub
		this.numero=numero;
		listedeDonne = new ArrayList<CommunAuDonne>();
	}
	private final int numero;
	private double hauteurEauMoyenne;
	protected ArrayList<CommunAuDonne> listedeDonne;
	private ReleveDateHeureEau marreHauteExceprion, marreBasseExceprion;
	private boolean testHautExt=true,testHautBas=true,testMoyenn=true;

	@Override
	public ArrayList<CommunAuDonne> getListeDeDonne() {
		// TODO Auto-generated method stub
		return listedeDonne;
	}

	@Override
	public CommunAuDonne getListeDeDonne(int position) {
		// TODO Auto-generated method stub
		return listedeDonne.get(position);
	}

	@Override
	public int getListeDeDonne(CommunAuDonne moi) {
		int compteur=0;
		for (CommunAuDonne mois2 : listedeDonne) {
			if (moi.getNumero()==mois2.getNumero()) {
				break;
			} else {
				compteur=compteur+1;
			}
		}
		return compteur;
	}

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}

	@Override
	public ReleveDateHeureEau getMarreHauteExceprion() {
		// TODO Auto-generated method stub
		return marreHauteExceprion;
	}

	@Override
	public ReleveDateHeureEau getMarreBasseExceprion() {
		// TODO Auto-generated method stub
		return marreBasseExceprion;
	}

	@Override
	public double getHauteurEauMoyenne() {
		return hauteurEauMoyenne;
	}

	@Override
	public void setHauteurEauMoyenne(double hauteurEauMoyenne) {
		if (testMoyenn==true) {
			this.hauteurEauMoyenne = hauteurEauMoyenne;
			testMoyenn=false;
		}
	}

	@Override
	public void setListeDeDonne(ArrayList<CommunAuDonne> listedeDonne) {
		// TODO Auto-generated method stub
		this.listedeDonne=listedeDonne;
	}

	@Override
	public void setListeDeDonne(CommunAuDonne listeDeMois) {
		// TODO Auto-generated method stub
		this.listedeDonne.add(listeDeMois);
	}

	@Override
	public void setListeDeDonne(int position, CommunAuDonne Donnee) {
		// TODO Auto-generated method stub
		this.listedeDonne.set(position, Donnee);
	}

	@Override
	public void addMarreeHaute(ReleveDateHeureEau marreHauteExceprion) {
		// TODO Auto-generated method stub
		if (testHautExt==true) {
			this.marreHauteExceprion=marreHauteExceprion;
			testHautExt=false;
		}
	}

	@Override
	public void addMarreeBasse(ReleveDateHeureEau marreBasseExceprion) {
		// TODO Auto-generated method stub
		if (testHautBas==true) {
			this.marreBasseExceprion=marreBasseExceprion;
			testHautBas=false;
		}
		
	}

	
}
