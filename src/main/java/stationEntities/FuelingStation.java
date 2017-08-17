package stationEntities;

public class FuelingStation {
	private boolean a92Nozzle;
	private boolean a95Nozzle;
	private boolean dieselNozzle;
	private boolean gasNozzle;

	public FuelingStation(boolean a92Nozzle, boolean a95Nozzle, boolean dieselNozzle,
			boolean gasNozzle) {
		this.a92Nozzle = a92Nozzle;
		this.a95Nozzle = a95Nozzle;
		this.dieselNozzle = dieselNozzle;
		this.gasNozzle = gasNozzle;
	}

	public boolean isA92Nozzle() {
		return a92Nozzle;
	}

	public void setA92Nozzle(boolean a92Nozzle) {
		this.a92Nozzle = a92Nozzle;
	}

	public boolean isA95Nozzle() {
		return a95Nozzle;
	}

	public void setA95Nozzle(boolean a95Nozzle) {
		this.a95Nozzle = a95Nozzle;
	}

	public boolean isDieselNozzle() {
		return dieselNozzle;
	}

	public void setDieselNozzle(boolean dieselNozzle) {
		this.dieselNozzle = dieselNozzle;
	}

	public boolean isGasNozzle() {
		return gasNozzle;
	}

	public void setGasNozzle(boolean gasNozzle) {
		this.gasNozzle = gasNozzle;
	}
	
	
	

}