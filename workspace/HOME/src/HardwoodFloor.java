public class HardwoodFloor extends FeatureDecorator{
	Home home;
	public HardwoodFloor(Home home){
		this.home = home;
	}
	public String getDescription() {
		return home.getDescription() + ",  Hardwood Floors";
	}
	public double cost(){
		return 500.0 + home.cost();
	}
}