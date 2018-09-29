package com.olx.demo.olxdemo;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RegisterController {
	/*@RequestMapping(value ="/", method = RequestMethod.GET)
	public String reg(){
		 	
		 return "hello";
		}*/
	 	@Autowired
	 	public RegisterService registerService;

		@RequestMapping(value = "/create", method = RequestMethod.POST)
		public RegisterPojo addNewUser(@RequestBody RegisterPojo register) {
			
			return registerService.addUser(register);
		}
		@RequestMapping(value ="/get", method = RequestMethod.GET)
		public List<RegisterPojo> findAll() {
			
			return registerService.findAll();
		}
		@RequestMapping(value = "/phone/{phoneNo}", method = RequestMethod.GET)
		  public RegisterPojo getPhoneNo(@PathVariable("phoneNo") String phoneNo) {
		    return registerService.findByPhoneNo(phoneNo);
		  }
		@RequestMapping(value = "/email/{emailId}", method = RequestMethod.GET)
		  public RegisterPojo getEmailId(@PathVariable("emailId") String emailId) {
		    return registerService.findByEmailId(emailId);
		
		  }
		
}

