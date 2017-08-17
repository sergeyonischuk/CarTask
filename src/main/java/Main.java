import carEntities.Car;
import carEntities.CarTank;
import carEntities.Engine;
import carEntities.Undercarriage;
import enums.CarGlassesState;
import enums.FuelType;
import enums.TechnicalCondition;
import services.FuelingStationService;
import stationEntities.FuelingStation;
import stationEntities.RefuelingComplex;
import stationEntities.RepairStation;
import stationEntities.ServiceStation;

public class Main {

	public static void main(String[] args) {
		FuelingStation fuelingStation = new FuelingStation(true, true, true, false);
		RepairStation repairStation = new RepairStation(true, false);
		ServiceStation serviceStation = new ServiceStation(true, true);
	
		RefuelingComplex refuelingComplex = new RefuelingComplex(fuelingStation, serviceStation, repairStation);
		FuelingStationService fuelingStationService = new FuelingStationService(refuelingComplex);
		
		Engine engine = new Engine(TechnicalCondition.REPAIR_REQUIRES);
		Undercarriage undercarriage = new Undercarriage(TechnicalCondition.OK);
		CarTank carTank = new CarTank(FuelType.GAS, 80, 20);
		
		Car car = new Car(engine, undercarriage, carTank, CarGlassesState.SOILED, false);
		
		fuelingStationService.carRefilling(car);
		fuelingStationService.engineRepair(car);
		
		System.out.println(fuelingStationService.carDiagnostics(car));
	}

}
