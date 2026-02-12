package Cycles;
import java.util.Random;
public class Velo {
	private static double defautBraquet = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		this.genAlea = new Random();
	}
	public double getDefautBraquet() {
		return defautBraquet;
	}
	public Velo() {
		this.braquet = defautBraquet;
		this.diamRoue = 1.0;
		this.genAlea = new Random();

	}
	public void setDefautBraquet(double newDefautBraquet) {
		defautBraquet = newDefautBraquet;
	}
	public Velo(double braquet) {
		this.braquet = braquet;
		this.genAlea = new Random();

	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random newGenAlea) {
		genAlea = newGenAlea;
	}
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double newBraquet) {
		braquet = newBraquet;
	}
	public double getDiameRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double newDiamRoue) {
		diamRoue = newDiamRoue;
		
	}
	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance( double frequenceCoupsDePedale) {
		return frequenceCoupsDePedale * braquet* diamRoue * genAlea.nextDouble();
		
	} 
	public static void main(String[] args) {
		  Velo v1 = new Velo();
	      System.out.println(v1);  
	     
	     System.out.println("diametre de la roue:" + v1.getDiameRoue());
	      // Test getArea() and getPerimeter()
	     System.out.println("frequence coups de pedale: %.2f%n", v1.getPuissance(13.0));	
	     System.out.println("genALea", v1.getGenAlea());
	 }	
	
	 
}


