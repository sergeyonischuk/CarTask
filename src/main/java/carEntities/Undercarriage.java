package carEntities;

import enums.TechnicalCondition;

public class Undercarriage {
	private TechnicalCondition technicalCondition;

	public Undercarriage(TechnicalCondition technicalCondition) {
		this.technicalCondition = technicalCondition;
	}

	public TechnicalCondition getTechnicalCondition() {
		return technicalCondition;
	}

	public void setTechnicalCondition(TechnicalCondition technicalCondition) {
		this.technicalCondition = technicalCondition;
	}

}
