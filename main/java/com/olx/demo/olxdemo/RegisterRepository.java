package com.olx.demo.olxdemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
@Component
public interface RegisterRepository extends MongoRepository<RegisterPojo,String> {
	
	RegisterPojo findByPhoneNo(String phoneNo);

	RegisterPojo findByEmailId(String emailId);

	
	
}
