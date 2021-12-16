package day3Hw;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1= new Instructor();
		instructor1.id=1;
		instructor1.firstName="Kamil";
		instructor1.lastName="Kamo";
		instructor1.password="456";
		instructor1.companyName="Microsoft";
		instructor1.wage="1¢";
		
		
		Student student1=new Student();
		student1.id=2;
		student1.firstName="Şamil";
		student1.lastName="Şamo";
		student1.password="123";
		student1.studentPoint=100;
		student1.universityName="Cambridge";
		
				

		
		UserManager userManager= new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
	

	}

}
