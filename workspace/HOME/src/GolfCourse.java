public class GolfCourse extends PropertyDecorator{
	Home home;
	public GolfCourse(Home home){
		this.home = home;
	}
	
	public String getDescription() {
		return home.getDescription() + ", Golf Course";
	}
	
	public double cost(){
		return 2500.0 + home.cost();
	}
}