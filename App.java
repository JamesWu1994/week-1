
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice =50;
		double amountOfMonyInWallet = 100;
		double sum = itemPrice + amountOfMonyInWallet;
		if (sum <= amountOfMonyInWallet) {
			amountOfMonyInWallet -= sum;
			System.out.println ("Your new balance is $" + amountOfMonyInWallet);
		}
		int numberOfFriends = 10;
		int ageInYears = 6;
		int total = numberOfFriends * ageInYears;
		System.out.println ("Your number of friends you made based your age:" + total);
		String firstName = "James";
		String lastName = "Wu";
		String middleInitial ="N/A";
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println (fullName);
	}

}
