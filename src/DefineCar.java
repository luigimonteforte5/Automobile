public class DefineCar {
	private int eSize;
	private String licPlate;
	private String make;
	private String model;
	
	public DefineCar(int eSize, String licPlate, String make, String model) {
		this.eSize = eSize;
		this.licPlate = licPlate;
		this.make = make;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return
				"Cilindrata: " + eSize +" cc "+
				", Targa: '" + licPlate + '\'' +
				", Costruttore: '" + make + '\'' +
				", Modello: '" + model + '\'';
	}
}
