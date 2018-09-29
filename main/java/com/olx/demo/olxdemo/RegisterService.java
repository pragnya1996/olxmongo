package com.olx.demo.olxdemo;

import java.util.List;



public interface RegisterService {
	List<RegisterPojo> findAll();
public RegisterPojo findByPhoneNo(String phoneNo);
public RegisterPojo findByEmailId(String emailId);
public RegisterPojo addUser(RegisterPojo user);



}
