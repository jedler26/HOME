public class CentralAC extends FeatureDecorator{
	Home home;
	public CentralAC(Home home){
		this.home = home;
	}
	
	public String getDescription() {
		return home.getDescription() + ", Central Air Conditioning";
	}
	public double cost(){
		return 1200.0 + home.cost();
	}
}