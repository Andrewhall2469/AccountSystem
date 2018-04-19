package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import AccountSystem.AccountSystem.Account;
import AccountSystem.AccountSystem.Service;

public class ServiceTest {
	Service service = new Service();

	@Test
	public void testAddAccount() {
		Account testAccount = new Account("Andy", "Hall");
		
		assertTrue(!service.getAccounts().containsKey(testAccount.getAccountNumber()));
		
		service.addAccount(testAccount);
		
		assertTrue(service.getAccounts().containsKey(testAccount.getAccountNumber()));
		
		assertTrue(service.getAccounts().get(testAccount.getAccountNumber()).equals(testAccount));
	}

	@Test
	public void testRetrieveAccount() {
		Account testAccount = new Account("Andy", "Hall");
		
		assertNull(service.retrieveAccount(testAccount.getAccountNumber()));
		
		service.addAccount(testAccount);
		
		assertTrue(testAccount.equals(service.retrieveAccount(testAccount.getAccountNumber())));
	}

}