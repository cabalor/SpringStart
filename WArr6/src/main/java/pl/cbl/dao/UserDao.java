package pl.cbl.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.cbl.entity.User;

@Repository
@Transactional
public class UserDao {


	@Autowired
	private EntityManager em;
	
	
	public void add(User user) {
		em.merge(user);
		
		
	}
	
	
	
	
}
