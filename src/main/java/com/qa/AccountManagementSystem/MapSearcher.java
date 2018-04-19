package com.qa.AccountManagementSystem;

import java.util.Map;

public class MapSearcher {
	public int findName (String firstName, Map<Integer, Account> accounts) {
		return (int)accounts.values().stream().filter(account -> firstName.equals(account.getFirstName())).count();
		
	}

}