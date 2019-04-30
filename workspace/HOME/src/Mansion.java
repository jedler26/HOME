public class Mansion extends Home {
	
	public double trueCost;
	public Mansion() {
		description = "Mansion";
	}

	public double mansionCost = 1000000.0;

	public double cost() {
		return mansionCost;
	}
	
	public double getTrueCost() {
		return trueCost;
	}

	public void setTrueCost(double trueCost) {
		this.trueCost = trueCost;
	}
}