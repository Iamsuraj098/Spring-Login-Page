package springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.dao.Userdao;
import springMVC.model.User;


@Service   // by using this compiler automatically understand it is Service layer. We can also do same thing in two ways with the help
			//of XML file and an annotation @Component.
public class UserService {
	
	@Autowired
	private Userdao userdao;
	public int createUser(User user) {
		return this.userdao.SaveUser(user);
	}
}
 