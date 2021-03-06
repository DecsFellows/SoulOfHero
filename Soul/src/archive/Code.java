package archive;

import character.AbstractCharacter;
import inventory.Item;
import map.Location;
import map.Map;
import skill.Skill;

public class Code {
	private static final int scalar = 71;
	private static final int shift = 7;
	private static final int addedAbstractCharacter = 1000000;
	private static final int addedItem = 1010000;
	private static final int addedMap = 1020000;
	private static final int addedLocation = 1030000;
	private static final int addedUser = 1040000;
	private static final int addedSkill = 1050000;
	private static final int addedArchive = 1060000;

	public static int getCode(AbstractCharacter character) {
		return character.getNumCharacters() * scalar + shift + addedAbstractCharacter;
	}
	
	public static int getCode(Item item) {
		return item.getNumItems() * scalar + shift + addedItem;
	}
	
	public static int getCode(Map map) {
		return map.getNumMaps() * scalar + shift + addedMap;
	}
	
	public static int getCode(Location location) {
		return location.getNumLocations() * scalar + shift + addedLocation;
	}
	
	public static int getCode(User user) {
		return user.getNumUsers() * scalar + shift + addedUser;
	}
	
	public static int getCode(Skill skill) {
		return skill.getNumSkills() * scalar + shift + addedSkill;
	}
	
	public static int getCode(Archive archive) {
		return archive.getNumArchives() * scalar + shift + addedArchive;
	}
	
}
