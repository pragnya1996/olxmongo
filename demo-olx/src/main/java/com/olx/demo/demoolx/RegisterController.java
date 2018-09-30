package com.olx.demo.demoolx;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RegisterController {
	 	@Autowired
	 	public RegisterService registerService;

		@RequestMapping(value = "/create", method = RequestMethod.POST)
		public RegisterPojo addNewRegister(@RequestBody RegisterPojo register) {
			return registerService.addregister(register);
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
		@RequestMapping(value = "/update", method = RequestMethod.PUT)
		public RegisterPojo updateRegister(@RequestBody RegisterPojo register) {
			
			return registerService.updateregister(register);
		}
		
}


