package carEntities;

import enums.CarGlassesState;

public class Car implements CarForFuelingStation, CarForRepairStation, CarForServiceStation{
	
	private Engine engine;
	private Undercarriage undercarriage;
	
	private CarTank carTank;
	
	private CarGlassesState carGlassesState;
	private boolean pumbingRequired;

	public Car(Engine engine, Undercarriage undercarriage, CarTank carTank,
			CarGlassesState carGlassesState, boolean pumbingRequired) {
		this.engine = engine;
		this.undercarriage = undercarriage;
		this.carTank = carTank;
		this.carGlassesState = carGlassesState;
		this.pumbingRequired = pumbingRequired;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Undercarriage getUndercarriage() {
		return undercarriage;
	}

	public void setUndercarriage(Undercarriage undercarriage) {
		this.undercarriage = undercarriage;
	}
	

	public CarTank getCarTank() {
		return carTank;
	}

	public void setCarTank(CarTank carTank) {
		this.carTank = carTank;
	}

	public CarGlassesState getCarGlassesState() {
		return carGlassesState;
	}

	public void setCarGlassesState(CarGlassesState carGlassesState) {
		this.carGlassesState = carGlassesState;
	}

	public boolean isPumbingRequired() {
		return pumbingRequired;
	}

	public void setPumbingRequired(boolean pumbingRequired) {
		this.pumbingRequired = pumbingRequired;
	}
	
	

}
