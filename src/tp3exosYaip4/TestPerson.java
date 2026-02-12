package tp3exosYaip4;

public class TestPerson {
	public static void main (String[] args) {
		Person P1 = new Person("Manal", "49 Rue Albert Camus");
		System.out.println(P1);
		
		System.out.println("the name is " + P1.getName());
		System.out.println("the address is :" + P1.getAddress());
		
		P1.setAddress("Phillippe Solari");
		System.out.println(P1);
	}
}
