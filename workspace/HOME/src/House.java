public class House extends Home {
	public double trueCost;
	public House() {
		description = "House";
	}

	public double houseCost = 250000.0;

	public double cost() {
		return houseCost;
	}
	
	public double getTrueCost() {
		return trueCost;
	}

	public void setTrueCost(double trueCost) {
		this.trueCost = trueCost;
	}
}
