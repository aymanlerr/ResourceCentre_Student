
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		// write code here
		output += String.format("%-10s %-30s %-10s\n", super.getAssetTag(), super.getDescription(), os);
		return output;
	}
}


