package com.espo.crm.smoke;

import org.testng.annotations.Test;

public class examplej2 {

	@Test(groups = "SmokeTest")

	public void LoginTest() {

		System.out.println("Executing Login Test");

	}

	@Test(groups = "SmokeTest")

	public void RegisterTest() {

		System.out.println("Executing Register Test");

	}

	@Test

	public void SearchTest() {

		System.out.println("Executing Search Test");

	}
}
