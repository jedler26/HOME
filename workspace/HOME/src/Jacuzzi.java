public class Jacuzzi extends FeatureDecorator{
	Home home;
	public Jacuzzi(Home home){
		this.home = home;
	}
	
	public String getDescription() {
		return home.getDescription() + ", Jacuzzi";
	}
	
	public double cost(){
		return 450.0 + home.cost();
	}
}