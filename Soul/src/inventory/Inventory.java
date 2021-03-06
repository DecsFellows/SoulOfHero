package inventory;

import dsa.iface.IIterator;
import dsa.impl.BSTMap;

public class Inventory {

	private int maxItem;

	private BSTMap<Integer, Item> items;

	public Inventory(int maxItem) {
		this.maxItem = maxItem;
		items = new BSTMap<Integer, Item>();
	}

	public void addItem(Item item) {
		if(items.size() < maxItem)
			items.put(item.getCode(), item);
	}

	public Item findItem(int code) {
		return items.get(code);
	}

	public Item removeItem(int code) {
		return items.remove(code);
	}

	public Weapon getWeapon(int code) {
		Item toReturn = items.get(code);
		if(toReturn instanceof Weapon)
			return (Weapon) toReturn;
		else
			return null;
	}

	public Food getFood(int code) {
		Item toReturn = items.get(code);
		if(toReturn instanceof Food)
			return (Food) toReturn;
		else
			return null;
	}

	public Armor getArmor(int code) {
		Item toReturn = items.get(code);
		if(toReturn instanceof Armor)
			return (Armor) toReturn;
		else
			return null;
	}

	public String toString() {
		IIterator<Item> iterator = items.values();
		String toReturn = "";
		while(iterator.hasNext()) {
			toReturn += iterator.next().toString();
		}
		return toReturn;
	}

	public void changeMaxItem(int max) {
		maxItem = max;
	}

}
