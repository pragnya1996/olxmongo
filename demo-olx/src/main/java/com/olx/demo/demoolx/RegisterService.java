package com.olx.demo.demoolx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RegisterService {
@Autowired
public RegisterRepository registerRepo;
public RegisterPojo addregister(RegisterPojo register) {
	// TODO Auto-generated method stub
	return registerRepo.save(register);
}

public List<RegisterPojo> findAllregisters() {
	// TODO Auto-generated method stub
	return registerRepo.findAll();
}



public List<RegisterPojo> findAll() {
	return registerRepo.findAll();
}

public RegisterPojo findByPhoneNo(String phoneNo) {
	// TODO Auto-generated method stub
	return registerRepo.findByPhoneNo(phoneNo) ;
}

public RegisterPojo findByEmailId(String emailId) {
	// TODO Auto-generated method stub
	return registerRepo.findByEmailId(emailId);
}
public RegisterPojo updateregister(RegisterPojo register) {
	// TODO Auto-generated method stub
	return registerRepo.save(register);
}
	
}

