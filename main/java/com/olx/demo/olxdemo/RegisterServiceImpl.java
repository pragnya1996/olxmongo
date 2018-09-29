package com.olx.demo.olxdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService  {
	@Autowired
    public RegisterRepository regRepo;
	@Override
	public RegisterPojo findByPhoneNo(String phoneNo) {
		
		return regRepo.findByPhoneNo(phoneNo);
	}

	@Override
	public RegisterPojo findByEmailId(String emailId) {
		
		return regRepo.findByEmailId(emailId);
	}

	

	@Override
	public List<RegisterPojo> findAll() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public RegisterPojo addUser(RegisterPojo register) {
		// TODO Auto-generated method stub
		return regRepo.save(register);
	}

	

	

	

	

	

}
