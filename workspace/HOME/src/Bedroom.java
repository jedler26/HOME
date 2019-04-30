public class Bedroom extends FeatureDecorator{
	
	Home home;
	public int bedroom;
	
	public Bedroom(Home home, int bed){
		this.home = home;
		this.bedroom = bed;	
	}
	
	public String getDescription() {
		return home.getDescription() + ", " + bedroom + " Bedroom";
	}
	
	public double cost(){
		String[] splitter = home.getDescription().trim().split(",");
		String type = splitter[0].trim();
		double price = 0.0;
		if(type.equals("House")){
			price = 3000;
		}
		else if(type.equals("Apartment")){
			price = 4500;
		}
		else if(type.equals("Condo")){
			price = 4000;
		}
		else if(type.equals("Mobile House")){
			price = 3800;
		}
		else if(type.equals("Mansion")){
			price = 2700;
		}
		else if(type.equals("Castle")){
			price = 2300;
		}
		
		
		return bedroom * price + home.cost();
	}
}