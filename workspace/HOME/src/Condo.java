public class Condo extends Home {
	public double trueCost;

	public Condo() {
		description = "Condo";
	}

	public double condoCost = 200000.0;

	public double cost() {
		return condoCost;
	}
	
	public double getTrueCost() {
		return trueCost;
	}

	public void setTrueCost(double trueCost) {
		this.trueCost = trueCost;
	}
}
