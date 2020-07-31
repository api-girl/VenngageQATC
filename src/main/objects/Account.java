public class Account {
	private String firstName;
	private String lastName;
	private String email;
	private String password;

	/**
	 * Create the constructor that takes the following:
	 * First name
	 * Last name
	 * Email
	 * Password
	 **/

	public Account(){
//		this.firstName = "QA";
//		this.lastName = "Test";
//		this.email = "qa.nevena@venngage.com";
//		this.password = "123456";
		this.firstName = "proba";
		this.lastName = "probic";
		this.email = "proba@yopmail.com";
		this.password = "123456";
	}

	// Create the necessary Getter functions
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
}