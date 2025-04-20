package myInstitute;
public class department{
	int sID,age;
	String name;
	public void getDepartment(){
		System.out.println("Staff ID: " + sID + "\nName:" + name + "\nAge:" + age);
	}
	public department(int sID, int age, String name){
		this.sID = sID;
		this.age = age;
		this.name = name;
	}
}