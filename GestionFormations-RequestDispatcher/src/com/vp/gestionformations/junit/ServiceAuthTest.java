package com.vp.gestionformations.junit;

import org.junit.Assert;
import org.junit.Test;

import com.vp.gestionformations.service.ServiceAuth;

public class ServiceAuthTest {
	
	@Test
	public void testEstValide1() {
		String login ="manga";
		String pwd ="aimejava";
		boolean status;
		
		ServiceAuth servicePourTest = new ServiceAuth();
		status = servicePourTest.estValide(login, pwd);
		
		Assert.assertTrue(status);		
	}
	
	@Test
	public void testEstValide2() {
		String login ="ddddd";
		String pwd ="eeee";
		boolean status;
		
		ServiceAuth servicePourTest = new ServiceAuth();
		status = servicePourTest.estValide(login, pwd);
		
		Assert.assertFalse(status);		
	}
}
