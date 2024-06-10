public class Main {
	public static void main(String[] args) {
		//Crea due nuovi oggetti car invocando il costruttore della classe DefineCar
		DefineCar car1 = new DefineCar(2000, "AB123CD", "Volkswagen", "Golf");
		DefineCar car2 = new DefineCar(1600, "EF456GH", "Ford", "Fiesta");

		//Stampa gli elementi degli oggetti car invocando i metodi getter della classe DefineCar
		System.out.println("Auto 1");
		System.out.println("Cilindrata: " + car1.getEngSize());
		System.out.println("Targa: " + car1.getLicPlate());
		System.out.println("Produttore: " + car1.getMake());
		System.out.println("Modello: " + car1.getModel());

		System.out.println();

		System.out.println("Auto 2");
		System.out.println("Cilindrata: " + car2.getEngSize());
		System.out.println("Targa: " + car2.getLicPlate());
		System.out.println("Produttore: " + car2.getMake());
		System.out.println("Modello: " + car2.getModel());

	}
}