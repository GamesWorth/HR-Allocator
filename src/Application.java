import accounts.*;

public class Application {

	public static void main(String[] args) {
	Admin testAdmin=new Admin("login","pword");
	testAdmin.login("pword");
	User_Interface system=new User_Interface();
	}
}
