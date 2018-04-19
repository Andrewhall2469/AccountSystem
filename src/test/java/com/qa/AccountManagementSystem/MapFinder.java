package com.qa.AccountManagementSystem;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MapFinder {

	private MapSearcher mapSearch;
	private Service service;
	private Account account;
	private Account account2;
	private Account account3;
	
	@Before
	public void initialise() {
		account = new Account("Andy", "Hall");
		account2 = new Account("Andy", "Hall");
		account3 = new Account("Andy", "Hall");
		
		service = new Service();
		service.addAccount(account);
		service.addAccount(account2);
		service.addAccount(account3);
		mapSearch = new MapSearcher();
	}
	
	@Test
	public void test() {
		
		int expValue = 0;
		int actValue = mapSearch.findName("aaaaaaa", service.getAccounts());
		Assert.assertEquals(expValue, actValue);
		
		expValue = 2;
		actValue = mapSearch.findName("Andy", service.getAccounts());
		Assert.assertEquals(expValue, actValue);

	}

}
