package singInEBusiness.business.abstracts;

import java.util.List;

import singInEBusiness.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	void login(User user);
	
	List<User> getAll();
	User get(int id);
	

}
