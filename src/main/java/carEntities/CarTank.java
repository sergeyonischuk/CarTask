package carEntities;

import enums.FuelType;

public class CarTank {
	private FuelType fuelType;
	private int tankCapacityLiters;
	private int tankFullnes;

	public CarTank(FuelType fuelType, int tankCapacityLiters, int tankFullnes) {
		this.fuelType = fuelType;
		this.tankCapacityLiters = tankCapacityLiters;
		this.tankFullnes = tankFullnes;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public int getTankKapacityLiters() {
		return tankCapacityLiters;
	}

	public void setTankKapacityLiters(int tankKapacityLiters) {
		this.tankCapacityLiters = tankKapacityLiters;
	}

	public int getTankFullnes() {
		return tankFullnes;
	}

	public void setTankFullnes(int tankFullnes) {
		this.tankFullnes = tankFullnes;
	}
	
	
	
}
