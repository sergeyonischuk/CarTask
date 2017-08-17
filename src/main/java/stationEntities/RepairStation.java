package stationEntities;

public class RepairStation {
	
	private boolean toolsForEngineRepairing;
	private boolean toolsForUndercarriageRepairing;

	public RepairStation(boolean toolsForEngineRepairing, boolean toolsForUndercarriageRepairing) {
		this.toolsForEngineRepairing = toolsForEngineRepairing;
		this.toolsForUndercarriageRepairing = toolsForUndercarriageRepairing;
	}

	public boolean isToolsForEngineRepairing() {
		return toolsForEngineRepairing;
	}

	public void setToolsForEngineRepairing(boolean toolsForEngineRepairing) {
		this.toolsForEngineRepairing = toolsForEngineRepairing;
	}

	public boolean isToolsForUndercarriageRepairing() {
		return toolsForUndercarriageRepairing;
	}

	public void setToolsForUndercarriageRepairing(boolean toolsForUndercarriageRepairing) {
		this.toolsForUndercarriageRepairing = toolsForUndercarriageRepairing;
	}
	
	

}
