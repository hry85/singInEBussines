package singInEBusiness.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import singInEBusiness.business.abstracts.ValidatorService;

public class ValidatorManager implements ValidatorService {

	@Override
	public boolean validateFirstName(String firstName) {
		  
		if(firstName.length() < 2) {
			  System.out.println("Adiniz en az iki harften olusmasi gerekir!");
			  return false;
			  
		  }else {
		      return true;
	  }
	}

	@Override
	public boolean validateLastName(String lastName) {
		
		if(lastName.length() < 2) {
			  System.out.println("Soyadiniz en az iki harften olusmasi gerekir!");
		
		        return false;
	}else {
		return true;
	  }
	}

	@Override
	public boolean validateEmail(String email) {
		
		String emailRegex = "[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$";
		Pattern emailPath = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPath.matcher(email);
		
		return matcher.find();
	}

	@Override
	public boolean validatePassword(String password) {
		
		if(password.length() < 6) {
			System.out.println("Parola en az 6 karakterden olusmasi gerekir!");
			  return false;
		}else {
			return true;
		}
	
	}

	@Override
	public boolean validateIsClicked(boolean isClicked) {
		
		return isClicked;
	}
	
	

}
