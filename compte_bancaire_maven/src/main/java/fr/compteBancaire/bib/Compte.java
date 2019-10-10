package fr.compteBancaire.bib;


public class Compte {
	
    
    private String nomTitulaire;
    private int solde;
    private int decouvert;
	
    public Compte(String nomTitulaire,int solde, int decouvert){
   
    	this.nomTitulaire=nomTitulaire;
    	this.solde = solde;
    	this.decouvert = decouvert;
    	
    }
    
    public void crediter(int montant){
    	solde += montant;
    }
    
    public void retrait(int montant) {
    	if (decouvert < solde) {
    		solde -= montant;
    		System.out.println("retrait effectué");
    	}
    	
    	else System.out.println("Attention la découverte !");
    }
    
    
    public int getConsultation() {
		return solde;
	}

	public void setConsultation(int solde_verif) {
		this.solde = solde_verif;
	}

	public void virement(int montant, Compte receveur ) {
		
    	this.retrait(montant);
    	receveur.crediter(montant);
    	
    }

	public String getNomTitulaire() {
		return nomTitulaire;
	}

	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}
    
    
}


