package com.ebay.web.service;
import com.ebay.web.entity.User;

public interface UserService {

	User searchById(String id);
	
//	Page search(Page pager);
	
	int insert(User user);

//	int update(User user);
	
	int delete(String id);
	
}