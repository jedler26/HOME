public class Castle extends Home {
	public double trueCost;

	public Castle() {
		description = "Castle";
	}

	public double castleCost = 100000.0;

	public double cost() {
		return castleCost;
	}
	public double getTrueCost() {
		return trueCost;
	}

	public void setTrueCost(double trueCost) {
		this.trueCost = trueCost;
	}
}
