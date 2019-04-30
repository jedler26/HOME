public class Bathroom extends FeatureDecorator{
	
	Home home;
	public double bathroom;
	
	public Bathroom(Home home, double bath){
		this.home = home;
		this.bathroom = bath;	
	}
	
	public String getDescription() {
		return home.getDescription() + ", " + bathroom + " Bathroom";
	}
	
	public double cost(){
		String[] splitter = home.getDescription().trim().split(",");
		String type = splitter[0].trim();
		double price = 0.0;
		if(type.equals("House")){
			price = 1500;
		}
		else if(type.equals("Apartment")){
			price = 3000;
		}
		else if(type.equals("Condo")){
			price = 2500;
		}
		else if(type.equals("Mobile House")){
			price = 2000;
		}
		else if(type.equals("Mansion")){
			price = 1000;
		}
		else if(type.equals("Castle")){
			price = 500;
		}
		
		
		return bathroom * price + home.cost();
	}
}