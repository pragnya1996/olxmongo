package com.olx.demo.olxdemo;

import static org.junit.Assert.assertEquals;

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
public class RegisterServiceTest {
@Mock
RegisterRepository regRepo;

@InjectMocks
RegisterService registerService;


@Test
public void findByEmail1()
	{
		RegisterPojo register2=new RegisterPojo();
		register2.setEmailId("prabhu@gmail.com");
		Mockito.when(regRepo.findByEmailId("prabhu@gmail.com")).thenReturn(register2);
		assertEquals(registerService.findByEmailId("prabhu@gmail.com").getEmailId(), "prabhu@gmail.com");
		
	}
@Test
public void findByEmail2()
	{
	RegisterPojo register2=new RegisterPojo();
	register2.setEmailId("prabhu@gmail.com");
	Mockito.when(regRepo.findByEmailId("prabhu@gmail.com")).thenReturn(register2);
	assertEquals(registerService.findByEmailId(null).getEmailId(), "prabhu@gmail.com");
	}
@Test
public void findByPhone1()
{
	RegisterPojo register2=new RegisterPojo();
	register2.setPhoneNo("9876543210");
	Mockito.when(regRepo.findByPhoneNo("9876543210")).thenReturn(register2);
	assertEquals(registerService.findByPhoneNo("9876543210").getPhoneNo(), "9876543210");
	
}

@Test
public void findByPhone2()
{
	RegisterPojo register2=new RegisterPojo();
	register2.setPhoneNo("9876543210");
	Mockito.when(regRepo.findByPhoneNo("9876543210")).thenReturn(register2);
	assertEquals(registerService.findByPhoneNo(null).getPhoneNo(), "9876543210");
	
}
@Test
public void addRegister2() {
	 RegisterPojo register=new RegisterPojo("pragnya","abc","123","abc@gmail.com","1287","123","free",true);
	 Mockito.when(registerService.addregister(register)).thenReturn(register);
	 RegisterPojo reg1=registerService.addregister(null);
		//System.out.println(reg1);
		Assert.assertNotNull(reg1);
		}
@Test
public void addRegister1() {
	 RegisterPojo register=new RegisterPojo("pragnya","abc","123456","abc@gmail.com","9876543210","123","free",true);
	 Mockito.when(registerService.addregister(register)).thenReturn(register);
	 RegisterPojo reg1=registerService.addregister(register);
		//System.out.println(reg1);
		Assert.assertNotNull(reg1);
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
		List<RegisterPojo> registers=registerService.findAll();
		Assert.assertEquals(regList.size(),registers.size());

}
@Test
public void updateReg_1()
	{
		RegisterPojo register1=new RegisterPojo("pragnya","abc","123456","abc@gmail.com","9876543210","123","free",true);
		Mockito.when(registerService.updateregister(register1)).thenReturn(register1);
		RegisterPojo reg1=registerService.updateregister(register1);
		Assert.assertNotNull(reg1);
		
	}
	@Test
	public void updateReg_2()
	{
		RegisterPojo register1=new RegisterPojo("pragnya","abc","123456","abc@gmail.com","9876543210","123","free",true);
		Mockito.when(registerService.updateregister(register1)).thenReturn(register1);
		RegisterPojo reg1=registerService.updateregister(null);
		Assert.assertNotNull(reg1);
		
	}

}
