package com.cluster.test.regression;

import org.testng.annotations.Test;

import com.cluster.test.config.TestConfiguration;

public class TestNGClass1 extends TestConfiguration
{
	@Test
	public void test2()
	{
		System.out.println("Runnig test2");
	}
}