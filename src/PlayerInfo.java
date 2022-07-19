
public class PlayerInfo {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public PlayerInfo() {	
		//empty constructor just in case
	}
	
	public PlayerInfo(String name) {
		//takes name in constructor, no need for setter method
		this.name = name;
	}
	
}
