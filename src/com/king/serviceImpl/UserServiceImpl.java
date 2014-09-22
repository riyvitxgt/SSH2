package com.king.serviceImpl;

import javax.annotation.Resource;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.king.entity.User;
import com.king.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	protected HibernateTemplate hibernateTemplate;
	
	@Override
	public User findById(long id) {
		User user = null;
		try{
			user = hibernateTemplate.get(User.class, id);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean save(User user) {
		try{
			//hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
			hibernateTemplate.save(user);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
