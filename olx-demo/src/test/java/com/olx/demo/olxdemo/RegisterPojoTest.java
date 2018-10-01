package com.olx.demo.olxdemo;

import org.junit.Test;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import org.junit.runner.RunWith;
@RunWith(MockitoJUnitRunner.class)
public class RegisterPojoTest {
    @Test
    public void gettersSettersTest()
    {
                    //default constructor
                    RegisterPojo register=new RegisterPojo();
                    //setters
                    register.setName("pragnya");
                    register.setAddress("Mobile");
                    register.setPassword("Mobiles");
                    register.setEmailId("prabhu@gmail.com");
                    register.setPhoneNo("9036851911");
                    register.setUserId("123");
                    register.setUserType("free");
                    register.setActivated(false);
                    //getters
                    Assert.assertEquals("pragnya", register.getName());
                    Assert.assertEquals("Mobile", register.getAddress());
                    Assert.assertEquals("Mobiles", register.getPassword());
                    Assert.assertEquals("prabhu@gmail.com", register.getEmailId());
                    Assert.assertEquals("9036851911", register.getPhoneNo());
                    Assert.assertEquals("123", register.getUserId());
                    Assert.assertEquals("free", register.getUserType());
                    Assert.assertEquals(false, register.isActivated());
    }
    

}
