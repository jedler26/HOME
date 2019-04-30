public class Acreage extends PropertyDecorator{
	Home home;
	public double acreage;
	public Acreage(Home home, double acre){
		this.home = home;
		this.acreage = acre;
	}
	
	public String getDescription() {
		return home.getDescription() + ", " + acreage + " Acreage";
	}
	
	public double cost(){
		double cost = home.cost();
		if(home.getLocation() == Home.Location.URBAN){
			cost *= 1.5;
		} else if(home.getLocation() == Home.Location.SUBURBAN){
			cost *= 1;
		} else if(home.getLocation() == Home.Location.RURAL){
			cost *= .9;
		}
		return acreage * 50.0 + cost;
	}
}