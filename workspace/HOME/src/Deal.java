public class Deal{
	Home home;
	public double difference;
	public String address;
	
	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public Deal(Home home, double d, String address){
		this.home = home;
		this.difference = d;
		this.address = address;
	}
	
	public double getDifference() {
		return difference;
	}
	public void setDifference(double difference) {
		this.difference = difference;
	}
}