public class Sqft extends FeatureDecorator{
	
	Home home;
	public double squareft;
	
	public Sqft(Home home, double sqft){
		this.home = home;
		this.squareft = sqft;	
	}
	
	public String getDescription() {
		return home.getDescription() + ", " + squareft + " Square ft";
	}
	
	public double cost(){
		String[] splitter = home.getDescription().trim().split(",");
		String type = splitter[0].trim();
		double price = 0.0;
		if(type.equals("House")){
			price = 100;
		}
		else if(type.equals("Apartment")){
			price = 125;
		}
		else if(type.equals("Condo")){
			price = 150;
		}
		else if(type.equals("Mobile House")){
			price = 75;
		}
		else if(type.equals("Mansion")){
			price = 175;
		}
		else if(type.equals("Castle")){
			price = 200;
		}
		return squareft * price + home.cost();
	}
}