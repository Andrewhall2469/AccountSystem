package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import AccountSystem.AccountSystem.MapToJson;

public class JSONTester {


	MapToJson json = new MapToJson();
	
	@Test
	public void Test() {
		json.jWrite();
		String joutput = json.getJsonStr();
		
		assertEquals("{\"firstName\":\"Andy\",\"lastName\":\"Hall\","
				+ "\"accountNumber\":0}", joutput);
	}
	
}
