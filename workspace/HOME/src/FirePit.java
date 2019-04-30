public class FirePit extends FeatureDecorator{
	
	Home home;
	public int firepit;
	public FirePit(Home home, int f){
		this.home = home;
		this.firepit = f;
	}
	public String getDescription() {
		return home.getDescription() + ", " + firepit + " Fire Pit";
	}
	public double cost(){
		return 700.0 * firepit + home.cost();
	}
}