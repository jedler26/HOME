public class Garage extends FeatureDecorator{
	
	Home home;
	
	public int garage;
	public Garage(Home home, int gar){
		this.home = home;
		this.garage = gar;
	}
	
	public String getDescription() {
		return home.getDescription() + ", " + garage + " Garage";
	}
	public double cost(){
		return garage* 5000.0 + home.cost();
	}
}