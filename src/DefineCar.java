public class DefineCar {
	private final int engSize;
	private final String licPlate;
	private final String make;
	private final String model;
	
	public DefineCar(int engSize, String licPlate, String make, String model) {
		this.engSize = engSize;
		this.licPlate = licPlate;
		this.make = make;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return
				"Cilindrata: " + engSize +" cc "+
				", Targa: '" + licPlate + '\'' +
				", Costruttore: '" + make + '\'' +
				", Modello: '" + model + '\'';
	}
}
