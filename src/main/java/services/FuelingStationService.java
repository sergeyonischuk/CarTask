package services;

import carEntities.Car;
import carEntities.CarForFuelingStation;
import carEntities.CarForRepairStation;
import carEntities.CarForServiceStation;
import enums.CarGlassesState;
import enums.TechnicalCondition;
import stationEntities.FuelingStation;
import stationEntities.RefuelingComplex;

public class FuelingStationService {
	RefuelingComplex refComplex;
	
	public FuelingStationService(RefuelingComplex refComplex) {
		this.refComplex = refComplex;
	}

	public String carDiagnostics(Car car) {
		String result = "***DIAGNOSTICS*** \n";
		result += "engine = " + car.getEngine().getTechnicalCondition() + "\n";
		result += "undercarriage = " + car.getUndercarriage().getTechnicalCondition() + "\n";
		result += "Weels pumping needed = " + car.isPumbingRequired() + "\n";
		result += "Glasses = " + car.getCarGlassesState() + "\n";
		result += "Fuel type = " + car.getCarTank().getFuelType() + "\n";
		result += "Tank capacity (litters) = " + car.getCarTank().getTankKapacityLiters() + "\n";
		result += "Tank fullness = " + car.getCarTank().getTankFullnes();
		
		return result;
	}
	
	public CarForRepairStation engineRepair(CarForRepairStation car) {
		TechnicalCondition current = car.getEngine().getTechnicalCondition();
		if (!refComplex.getRepairStation().isToolsForEngineRepairing()) {
			System.out.println("There is no instruments for engine repair on this station");
			return car;
		}
		if (current == TechnicalCondition.REPAIR_REQUIRES) {
			car.getEngine().setTechnicalCondition(TechnicalCondition.OK);
		} else {
			System.out.println("repair is not needed");
		}
		return car;
	}
	
	public CarForRepairStation undercarriageRepair(CarForRepairStation car) {
		if (!refComplex.getRepairStation().isToolsForUndercarriageRepairing()) {
			System.out.println("There is no instruments for undercarriage repair on this station");
			return car;
		}
		if (car.getUndercarriage().getTechnicalCondition() == TechnicalCondition.REPAIR_REQUIRES) {
			car.getUndercarriage().setTechnicalCondition(TechnicalCondition.OK);
		} else {
			System.out.println("repair is not needed");
		}
		return car;
	}
	
	public CarForServiceStation carGlassesCleaning(CarForServiceStation car) {
		if (!refComplex.getServiceStation().isToolsForWashing()) {
			System.out.println("There is no tools for car washing on this station");
			return car;
		}
		if (car.getCarGlassesState() == CarGlassesState.SOILED || car.getCarGlassesState() == CarGlassesState.DIRTY) {
			car.setCarGlassesState(CarGlassesState.CLEAN);
		} else {
			System.out.println("cleaning is not needed");
		}
		return car;
	}
	
	public CarForServiceStation carWeelsPumping(CarForServiceStation car) {
		if (!refComplex.getServiceStation().isCompressor()) {
			System.out.println("There is no compressor on this station");
			return car;
		}
		if (car.isPumbingRequired() == true) {
			car.setPumbingRequired(false);
		} else {
			System.out.println("pumping is not needed");
		}
		return car;
	}
	
	public CarForFuelingStation carRefilling(CarForFuelingStation car) {
		int tankCapacity = car.getCarTank().getTankKapacityLiters();
		int tankFullness = car.getCarTank().getTankFullnes();
		
		if (checkFuelAvailability(car) == false) {
			System.out.println("There is no " + car.getCarTank().getFuelType() + " on this station");
			return car;
		} 
		if (tankFullness < (tankCapacity / 3)) {
			car.getCarTank().setTankFullnes(tankCapacity);
		} else {
			System.out.println("Car does not need refueling");
		}
		
		return car;
	}
	
	private boolean checkFuelAvailability(CarForFuelingStation car) {
		FuelingStation fuelingStation = refComplex.getFuelingStation();
		switch (car.getCarTank().getFuelType()) {
		case A92:
			if (fuelingStation.isA92Nozzle()) {
				return true;
			}
		case A95:
			if (fuelingStation.isA95Nozzle()) {
				return true;
			}
		case DIESEL:
			if (fuelingStation.isDieselNozzle()) {
				return true;
			}
		case GAS:
			if (fuelingStation.isGasNozzle()) {
				return true;
			}
		}
		return false;
	}

}
