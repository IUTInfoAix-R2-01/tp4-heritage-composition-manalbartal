package persoJDR;

public class TestVelo {
	public static void main(String[] args) {
		  Velo v1 = new Velo();
	      System.out.println(v1);  
	     
	     System.out.println("diametre de la roue:" + v1.getDiameRoue());
	      // Test getArea() and getPerimeter()
	      System.out.printf("frequence coups de pedale: %.2f%n", v1.getPuissance(13.0));		 
	 }

}
