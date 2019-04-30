public class MobileHouse extends Home {
	public double trueCost;

	public MobileHouse() {
		description = "Mobile House";
	}

	public double mobileHouseCost = 75000.0;

	public double cost() {
		return mobileHouseCost;
	}
	
	public double getTrueCost() {
		return trueCost;
	}

	public void setTrueCost(double trueCost) {
		this.trueCost = trueCost;
	}
}
