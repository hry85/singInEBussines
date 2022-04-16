package singInEBusiness;

import singInEBusiness.business.concretes.UserManager;
import singInEBusiness.business.concretes.ValidatorManager;
import singInEBusiness.core.concretes.LoginManager;
import singInEBusiness.dataAccess.concretes.HibernateUserDao;
import singInEBusiness.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Huray","Erdi","hurayerdi@gmail.com","Q1w2e3r4t5!");
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new ValidatorManager(), new LoginManager());
		userManager.add(user1);
		userManager.login(user1);
		
		LoginManager loginManager = new LoginManager();
		loginManager.login(user1);
	}
}
