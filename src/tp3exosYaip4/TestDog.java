package tp3exosYaip4;

public class TestDog {
	public static void main(String[] args) {
		Dog d1 = new Dog("Rusty");
		Dog d2 = new Dog ("Max");
		System.out.println(d1);
		System.out.println(d2);
		d1.greets();
		d1.greets(d2);
		
	}
	

}
