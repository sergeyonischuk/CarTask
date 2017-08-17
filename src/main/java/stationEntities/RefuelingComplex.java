package stationEntities;

public class RefuelingComplex {
	
	FuelingStation fuelingStation;
	ServiceStation serviceStation;
	RepairStation repairStation;

	public RefuelingComplex(FuelingStation fuelingStation, ServiceStation serviceStation,
			RepairStation repairStation) {
		this.fuelingStation = fuelingStation;
		this.serviceStation = serviceStation;
		this.repairStation = repairStation;
	}

	public FuelingStation getFuelingStation() {
		return fuelingStation;
	}

	public void setFuelingStation(FuelingStation fuelingStation) {
		this.fuelingStation = fuelingStation;
	}

	public ServiceStation getServiceStation() {
		return serviceStation;
	}

	public void setServiceStation(ServiceStation serviceStation) {
		this.serviceStation = serviceStation;
	}

	public RepairStation getRepairStation() {
		return repairStation;
	}

	public void setRepairStation(RepairStation repairStation) {
		this.repairStation = repairStation;
	}
	
	

}
