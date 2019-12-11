
public class CompteEpagne implements ICompteBancaire {
	String code;
	float solde;
	float interet=(float) 0.6;
	public CompteEpagne() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public CompteEpagne(String code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}

	@Override
	public Double retrait(float soldeR) {
		// TODO Auto-generated method stub
		solde = solde-soldeR;
		return (double) (solde);
	}

	@Override
	public Double versement(float soldeV) {
		// TODO Auto-generated method stub
		solde = solde+soldeV;
		return (double) (solde);
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("voter solde est: "+solde);
	
	}
	
	public Double calculInteret() {
		solde=solde+solde*interet;
		return (double) (solde);
		
	}

}
