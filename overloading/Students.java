package week4.overloading;

public class Students {
      public void getStudentInfo(int id) {
		System.out.println("Student id is "+id);

	}
      public void getStudentInfo(int id, String name) {
    	  System.out.println("Student id is "+id);
    	  System.out.println("Student name is "+name);
      }
      public void getStudentInfo(String email, String phone) {
    	  System.out.println("Student email is "+email);
    	  System.out.println("Student phone number "+phone);
      }
      public static void main(String[] args) {
		Students s=new Students();
				s.getStudentInfo(001);
		s.getStudentInfo(002, "Abirami");
		s.getStudentInfo("abikalmity@gmail.com", "9456757788");
	}
}
