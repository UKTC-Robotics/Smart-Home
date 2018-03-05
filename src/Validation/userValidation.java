package Validation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class userValidation {
 
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		        return matcher.find();
		}

		/* public static boolean emailValidation(String eMail){
		 * boolean isEmailValid = false;
		 * Pattern pattern = Pattern.compile(^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$);
		 * Matcher matcher = pattern.matcher(eMail);
		 * if(matcher.matches()){
		 * isEmailValid = true;
		 * }
		 * else{
		 * isEmailValid = false;
		 * }
		 * 
		 * } */
}