public abstract class Home{
	public enum Location { URBAN, SUBURBAN, RURAL };
	public enum SchoolDistrict { A, B, C, D, F };
	
	public double trueCost;
	public String address;
	
	public void setTrueCost(double trueCost) {
		this.trueCost = trueCost;
	}
	
	public double getTrueCost() {
		return trueCost;
	}

	String description = "Unknown Home";
	
	Location location = Location.URBAN;
	SchoolDistrict schooldistrict = SchoolDistrict.A;
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setLocation(Location location){
		this.location = location;
	}
	
	public Location getLocation(){
		return this.location;
	}
	
	public void setSchoolDistrict(SchoolDistrict schooldistrict){
		this.schooldistrict = schooldistrict;
	}
	public SchoolDistrict getSchoolDistrict(){
		return this.schooldistrict;
	}
	
	public abstract double cost();
}