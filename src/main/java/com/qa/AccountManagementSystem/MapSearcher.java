package com.qa.AccountManagementSystem;

import java.util.Map;

public class MapSearcher {
	public int findName (String firstName, Map<Integer, Account> accounts) {
		int count = 0;
				for (Account acn : accounts.values()) 
				{
					if (acn.getFirstName().equals(firstName)) 
					{
						count++;
					}
				}
		System.out.println(count + " accounts are present with the same first names :-) " + firstName);
		return count;
		
	}

}