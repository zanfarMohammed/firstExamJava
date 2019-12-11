
public class ComptePayant implements ICompteBancaire {

	String code;
	float solde;
	
	public ComptePayant() {
		// TODO Auto-generated constructor stub
		super();
	}
	public ComptePayant(String code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}

	@Override
	public Double retrait(float soldeR) {
		// TODO Auto-generated method stub
		solde = solde-soldeR-5;
		return (double) (solde);
	}

	@Override
	public Double versement(float soldeV) {
		// TODO Auto-generated method stub
		solde = solde+soldeV-5;
		return (double) (solde);
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("voter solde est: "+solde);
	
	}
	
	

}
