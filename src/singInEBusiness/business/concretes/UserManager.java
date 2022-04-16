package singInEBusiness.business.concretes;

import java.util.List;

import singInEBusiness.business.abstracts.UserService;
import singInEBusiness.business.abstracts.ValidatorService;
import singInEBusiness.core.abstracts.LoginService;
import singInEBusiness.dataAccess.abstracts.UserDao;
import singInEBusiness.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private ValidatorService service;
	private LoginService login;
	
	public UserManager() {
		
	}
	
	
	public UserManager(UserDao userDao, ValidatorService service , LoginService login) {
		super();
		this.userDao = userDao;
		this.service = service;
		this.login = login;
	}




	@Override
	public void add(User user) {
	if(service.validateFirstName(user.getFirstName()) && service.validateLastName(user.getLastName()) && service.validateEmail(user.getEmail()) && service.validatePassword(user.getPassword())){
	
		System.out.println("Bilgiler eksik veya hatali lutfen tekrar deneyiniz.");
		
	 
	}else {
		this.userDao.add(user);
		
	}
	  

	}

	@Override
	public void update(User user) {
	this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}

	@Override
	public User get(int id) {
		
		return this.userDao.get(id);
	}


	@Override
	public void login(User user) {
	
		
	}
	
	

}
