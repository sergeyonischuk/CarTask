package stationEntities;

public class ServiceStation {
	
	private boolean toolsForWashing;
	private boolean compressor;
	
	public ServiceStation(boolean toolsForWashing, boolean compressor) {
		this.toolsForWashing = toolsForWashing;
		this.compressor = compressor;
	}

	public boolean isToolsForWashing() {
		return toolsForWashing;
	}

	public void setToolsForWashing(boolean toolsForWashing) {
		this.toolsForWashing = toolsForWashing;
	}

	public boolean isCompressor() {
		return compressor;
	}

	public void setCompressor(boolean compressor) {
		this.compressor = compressor;
	}
	
	

}
