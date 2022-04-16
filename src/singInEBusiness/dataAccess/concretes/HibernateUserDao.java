package singInEBusiness.dataAccess.concretes;

import java.util.List;

import singInEBusiness.dataAccess.abstracts.UserDao;
import singInEBusiness.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile " +user.getFirstName() + " kullanicisi eklendi.");
		
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile " +user.getFirstName() + " kullanicisi guncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile " +user.getFirstName() + " kullanicisi silindi.");
		
	}

	@Override
	public void login(String email, String password) {
	   
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getByMail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
