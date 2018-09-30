package com.olx.demo.demoolx;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class RegisterControllerTest {
@Mock
RegisterService registerService;

@InjectMocks
RegisterController registerController;
 @Test
 public void addRegister1() {
	 RegisterPojo register=new RegisterPojo("pragnya","abc","123456","abc@gmail.com","9876543210","123","free",true);
	 Mockito.when(registerService.addregister(register)).thenReturn(register);
	 RegisterPojo reg1=registerController.addNewRegister(register);
		//System.out.println(product1);
		Assert.assertNotNull(reg1);
		
 }
 @Test
 public void addRegister2() {
	 RegisterPojo register=new RegisterPojo("pragnya","abc","123","abc@gmail.com","1287","123","free",true);
	 Mockito.when(registerService.addregister(register)).thenReturn(register);
	 RegisterPojo reg1=registerController.addNewRegister(null);
		//System.out.println(product1);
		Assert.assertNotNull(reg1);
		}

 
}
