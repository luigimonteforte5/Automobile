public class DefineCar {

	//Crea delle nuove variabili di tipo private, rendendole modificabili solo tramite i metodi setter della classe
	private  int engSize;
	private  String licPlate;
	private  String make;
	private  String model;

	//Crea un metodo costruttore per assegnare un valore alle variabili tramite i metodi setter
	public DefineCar(int engSize, String licPlate, String make, String model) {
		setEngSize(engSize);
		setLicPlate(licPlate);
		setMake(make);
		setModel(model);
	}

	//Metodo setter del parametro cilindrata
	public void setEngSize( int engSize){
		this.engSize = engSize; //assegna alla variabile globale "engSize" il valore dell'attributo del metodo"
	}

	//metodo getter del parametro cilindrata
	public int getEngSize(){
		return engSize; //Ritorna il valore della variabile "engSize
	}

	//Metodo getter del parametro targa
	public String getLicPlate() {
		return licPlate;
	}

	//metodo setter del parametro targa
	public void setLicPlate( String licPlate ) {
		this.licPlate = licPlate;
	}

	//metodo getter del parametro costruttore
	public String getMake() {
		return make;
	}

	//metodo setter del parametro costruttore
	public void setMake( String make ) {
		this.make = make;
	}

	//metodo getter del parametro modello
	public String getModel() {
		return model;
	}

	//metodo setter del parametro modello
	public void setModel( String model ) {
		this.model = model;
	}
}
