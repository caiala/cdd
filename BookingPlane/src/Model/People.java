package Model;

public class People {
	private String peopleId;
	private String peopleName;
	public People(String peopleId,String peopleName){
		this.peopleId = peopleId;
		this.peopleName = peopleName;
		
	}
	public String getPeopleId() {
		return peopleId;
	}
	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}
	public String getPeopleName() {
		return peopleName;
	}
	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}
	
}
