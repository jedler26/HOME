public class Historic extends FeatureDecorator{
	Home home;
	public Historic(Home home){
		this.home = home;
	}
	
	public String getDescription() {
		return home.getDescription() + ", Historic (haunted)";
	}
	public double cost(){
		return 2500.0 + home.cost();
	}
}