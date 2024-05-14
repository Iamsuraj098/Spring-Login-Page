package springMVC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMVC.model.User;

@Repository      // with help of this annotation compiler easily understand this is DAO class.
public class Userdao {
	
	@Autowired 			// used to automatically save data.	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int SaveUser(User user) {
		int id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}
}
