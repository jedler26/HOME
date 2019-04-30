public class SwimmingPool extends FeatureDecorator{
	Home home;
	public SwimmingPool(Home home){
		this.home = home;
	}
	
	public String getDescription() {
		return home.getDescription() + ", Swimming Pool";
	}
	public double cost(){
		return 200.0 + home.cost();
	}
}