//3
package Pokemons;

public class Pokemon {
	private String type;
	private String name;
	private int power;
	
	public Pokemon(String name, String type, int power) {
		this.name = name;
		this.type = type;
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	
	
	
}
