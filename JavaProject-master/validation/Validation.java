package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	
	 public Boolean empNameValidation(String input )
	 {
		 Pattern p = Pattern.compile(".s");
		 Matcher m = p.matcher(input);
		return m.matches();
		 
	 }
}
