package com.olx.demo.olxdemo;

import java.util.ArrayList;
import java.util.List;

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
		//System.out.println(reg1);
		Assert.assertNotNull(reg1);
		
 }
 @Test
 public void addRegister2() {
	 RegisterPojo register=new RegisterPojo("pragnya","abc","123","abc@gmail.com","1287","123","free",true);
	 Mockito.when(registerService.addregister(register)).thenReturn(register);
	 RegisterPojo reg1=registerController.addNewRegister(null);
		//System.out.println(reg1);
		Assert.assertNull(reg1);
		}
 @Test
	public void getAllProductTest_1()
	{
		List<RegisterPojo> regList=new ArrayList<RegisterPojo>();
		RegisterPojo register=new RegisterPojo("pragnya","abc","123456","abc@gmail.com","9876543210","123","free",true);
		regList.add(register);
		register=new RegisterPojo("pragnya","abc","123456","abc@gmail.com","9876543210","123","free",true);
		regList.add(register);
		Mockito.when(registerService.findAll()).thenReturn(regList);
		List<RegisterPojo> registers=registerController.findAll();
		Assert.assertEquals(regList.size(),registers.size());
 
}
 @Test
 public void updateReg_1()
	{
		RegisterPojo register1=new RegisterPojo("pragnya","abc","123456","abc@gmail.com","9876543210","123","free",true);
		Mockito.when(registerService.updateregister(register1)).thenReturn(register1);
		RegisterPojo reg1=registerController.updateRegister(register1);
		Assert.assertNotNull(reg1);
		
	}
	@Test
	public void updateReg_2()
	{
		RegisterPojo register1=new RegisterPojo("pragnya","abc","123456","abc@gmail.com","9876543210","123","free",true);
		Mockito.when(registerService.updateregister(register1)).thenReturn(register1);
		RegisterPojo reg1=registerController.updateRegister(null);
		Assert.assertNotNull(reg1);
		
	}
	@Test
	 public void findByPhone1()
		{
			RegisterPojo register2=new RegisterPojo();
			register2.setPhoneNo("9036851911");
			Mockito.when(registerService.findByPhoneNo("9036851911")).thenReturn(register2);
			RegisterPojo reg1=registerController.getPhoneNo("9036851911");
			Assert.assertNotNull(reg1);
			
		}
	@Test
	 public void findByPhone2()
		{
			RegisterPojo register2=new RegisterPojo();
			register2.setPhoneNo("9036851911");
			Mockito.when(registerService.findByPhoneNo("9036851911")).thenReturn(register2);
			RegisterPojo reg1=registerController.getPhoneNo(null);
			Assert.assertNotNull(reg1);
			
		}
	
	@Test
	 public void findByEmail1()
		{
			RegisterPojo register2=new RegisterPojo();
			register2.setEmailId("prabhu@gmail.com");
			Mockito.when(registerService.findByEmailId("prabhu@gmail.com")).thenReturn(register2);
			RegisterPojo reg1=registerController.getEmailId(null);
			Assert.assertNotNull(reg1);
			
		}
	@Test
	 public void findByEmail2()
		{
			RegisterPojo register2=new RegisterPojo();
			register2.setEmailId("prabhu@gmail.com");
			Mockito.when(registerService.findByEmailId("prabhu@gmail.com")).thenReturn(register2);
			RegisterPojo reg1=registerController.getEmailId("prabhu@gmail.com");
			Assert.assertNotNull(reg1);
			
		}
}
