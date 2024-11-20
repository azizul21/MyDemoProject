public class PasswordGenerator {
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&";
	public static void main(String[] args) {
		int passwordLength = 12; // Length of the password 
		String password = generateRandomPassword(passwordLength); 
		System.out.println("Generated Password: " + password); 
	} 
	public static String generateRandomPassword(int length) 
	{ 
		StringBuilder password = new StringBuilder(length); 
		//1st approach
		/*
		 * SecureRandom random = new SecureRandom(); for (int i = 0; i < length; i++) {
		 * int index = random.nextInt(CHARACTERS.length());
		 * password.append(CHARACTERS.charAt(index)); }
		 */
		//2nd Approach
		for (int i = 0; i < length; i++) {
			password.append(CHARACTERS.charAt((int)(Math.random()*68)));
		} 
		
		
		return password.toString(); 
	}
	
}
