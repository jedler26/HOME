public class Apartment extends Home {
	public double trueCost;
	public Apartment() {
		description = "Apartment";
	}

	public double aptCost = 150000.0;

	public double cost() {
		return aptCost;
	}
	
	public double getTrueCost() {
		return trueCost;
	}

	public void setTrueCost(double trueCost) {
		this.trueCost = trueCost;
	}
}
