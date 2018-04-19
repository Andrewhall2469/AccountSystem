package AccountSystem.AccountSystem;

import com.google.gson.Gson;

public class MapToJson {
	
	private static String jsonStr;

	public static void jWrite() {
		
		Account ac = new Account("Andy", "Hall");
		
		Gson gsonObj = new Gson();
		setJsonStr(gsonObj.toJson(ac));
		
		String jsonStr = gsonObj.toJson(ac);
		
		System.out.println(jsonStr);
	}
	
	public static String getJsonStr() {
		return jsonStr;
	}
	
	public static void setJsonStr(String jsonStr) {
		MapToJson.jsonStr = jsonStr;
	}

}
