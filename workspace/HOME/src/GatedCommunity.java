public class GatedCommunity extends PropertyDecorator{
	Home home;

	public GatedCommunity(Home home){
		this.home = home;
	}
	
	public String getDescription() {
		return home.getDescription() + ", Gated Community";
	}
	
	public double cost(){
		return 1000.0 + home.cost();
	}
}