package singInEBusiness.core.concretes;

import singInEBusiness.core.abstracts.LoginService;
import singInEBusiness.entities.concretes.User;

public class SingInManager implements LoginService {

	@Override
	public void login(User user) {
		System.out.println("Sisteme giris yapildi. " +user.getFirstName() + " " + user.getLastName());
		
	}

}
