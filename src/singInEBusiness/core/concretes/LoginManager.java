package singInEBusiness.core.concretes;

import singInEBusiness.core.abstracts.LoginService;
import singInEBusiness.entities.concretes.User;
import singInEBusiness.gMailManager.concretes.GmailLoginManager;

public class LoginManager implements LoginService {

	@Override
	public void login(User user) {
		
		GmailLoginManager gmailLoginManager = new GmailLoginManager();
		gmailLoginManager.login(user.getEmail());
		
	}

}
