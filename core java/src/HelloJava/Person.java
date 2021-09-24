package HelloJava;

public class Person {
	private String Name;
	private String Address;
	private String DOB;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public static void main(String[] args) {
     Person s =new Person();
     s.setName("monish");
     s.setAddress("indore");
     
     System.out.println(s.getName());
     System.out.println(s.getAddress());
     
     	
     
				
				
		
	}
	

}
