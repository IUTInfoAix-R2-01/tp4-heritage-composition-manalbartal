package Cycles;

public class VeloElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR =15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double  coupleMoteur) {
		super.setBraquet(braquet);
		super.setDiamRoue(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec(double diamRoue, double coupleMoteur) {
		super.setDiamRoue(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec() {
		facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	public static double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	public static void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR=DEFAUT_COUPLE_MOTEUR;
	}
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double coupleMoteur) {
		this.facteurPuissanceMoteur = coupleMoteur;
		
	}
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	public static void main (String[] args) {
		VeloElec V1 = new VeloElec();
		System.out.println(V1);
		V1.setDEFAUT_COUPLE_MOTEUR(DEFAUT_FACTEUR_PUISSANCE_MOTEUR);
		System.out.println(V1);
		V1.setBraquet(01.2);
		V1.setGenAlea(null);
		System.out.println(V1);
		V1.setDiamRoue(0.25);
		System.out.println(V1);
	}

}
