package singInEBusiness.gMailManager.abstracts;

public interface GmailService {
	
	void register(int id,String firstName,String lastName,String email,String password);
	void login(String email, String password);

}
