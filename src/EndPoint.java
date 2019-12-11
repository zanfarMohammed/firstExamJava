
public class EndPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComptePayant cp=new ComptePayant("T04754",7000);
		System.out.println("Opertations compte Payant:");
		cp.afficher();
		System.out.println("operation retrait  compte payant");
		cp.retrait(500);		cp.afficher();
		System.out.println("operation versement  compte payant");
		cp.versement(500);		cp.afficher();
		CompteEpagne ce=new CompteEpagne("T04754",7000);
		System.out.println("Opertations compte Epagne");
		ce.afficher();
		System.out.println("operation retrait  compte Epagne");
		ce.retrait(500);		ce.afficher();
		System.out.println("operation versement  compte Epagne");
		ce.versement(500);		ce.afficher();
		System.out.println("operation qui permet de calculer l'interet compte Epagne");
		ce.calculInteret();		ce.afficher();
	}

}
