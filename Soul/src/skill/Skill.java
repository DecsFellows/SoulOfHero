package skill;

import character.AbstractCharacter;

public class Skill {

	private String name;

	private String description;
	
	private static int numSkills = 0;
	
	private final int code;

	private double damage;

	public Skill(String name, String description, double damage) {

	}

	public String getName() {
		return null;
	}

	public String getDescription() {
		return null;
	}
	
	public int getCode() {
		return code;
	}
	
	public int getNumSkills() {
		return numSkills;
	}

	public String attack(AbstractCharacter target, int strength) {
		return null;
	}

}
