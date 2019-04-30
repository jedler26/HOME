public class SchoolDistrict extends PropertyDecorator{
	Home home;
	
	public SchoolDistrict(Home home){
		this.home = home;	
	}
	
	public String getDescription() {
		if(home.getSchoolDistrict() == Home.SchoolDistrict.A){
			return home.getDescription() + ", Excellent School District";
		} else if(home.getSchoolDistrict() == Home.SchoolDistrict.B){
			return home.getDescription() + ", Good School District";
		} else if(home.getSchoolDistrict() == Home.SchoolDistrict.C){
			return home.getDescription() + ", Average School District";
		} else if(home.getSchoolDistrict() == Home.SchoolDistrict.D){
			return home.getDescription() + ", Poor School District";
		} else if(home.getSchoolDistrict() == Home.SchoolDistrict.F){
			return home.getDescription() + ", Bad School District";
		}else{
			return home.getDescription();
		}
	}
	
	public double cost(){
		double cost = home.cost();
		if(home.getSchoolDistrict() == Home.SchoolDistrict.A){
			cost += 10000; 
		} else if(home.getSchoolDistrict() == Home.SchoolDistrict.B){
			cost += 5000;
		} else if(home.getSchoolDistrict() == Home.SchoolDistrict.C){
			cost = home.cost();
		} else if(home.getSchoolDistrict() == Home.SchoolDistrict.D){
			cost -= 5000;
		} else if(home.getSchoolDistrict() == Home.SchoolDistrict.F){
			cost -= 10000;
		}
		return cost;
	}
}