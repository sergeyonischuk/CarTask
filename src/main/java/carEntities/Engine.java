package carEntities;

import enums.TechnicalCondition;

public class Engine {
	
	private TechnicalCondition technicalCondition;

	public Engine(TechnicalCondition technicalCondition) {
		this.technicalCondition = technicalCondition;
	}

	public TechnicalCondition getTechnicalCondition() {
		return technicalCondition;
	}

	public void setTechnicalCondition(TechnicalCondition technicalCondition) {
		this.technicalCondition = technicalCondition;
	}

}
