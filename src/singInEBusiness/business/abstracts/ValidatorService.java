package singInEBusiness.business.abstracts;

public interface ValidatorService {
	
	boolean validateFirstName(String firstName);
	boolean validateLastName(String lastName);
	boolean validateEmail(String email);
	boolean validatePassword(String password);
	boolean validateIsClicked(boolean isClicked);
	

}
