package carEntities;

import enums.CarGlassesState;

public interface CarForServiceStation {
	
	public CarGlassesState getCarGlassesState();

	public void setCarGlassesState(CarGlassesState carGlassesState);

	public boolean isPumbingRequired();

	public void setPumbingRequired(boolean pumbingRequired);

}
