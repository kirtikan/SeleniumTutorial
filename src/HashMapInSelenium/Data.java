package HashMapInSelenium;

import java.util.HashMap;

public class Data {
	
	public static HashMap<String, String> getUserLoginInfo()
	{
		HashMap<String,String> userMap = new HashMap<String,String>();
		userMap.put("admin", "kirti.16dec@gmail.com#kirti@292008");
		userMap.put("customer", "kirtikanojiya16@gmail.com#cust@1234");
		
		return userMap;
	}
	
	
	//for calender months to select u can create HashMap for months,
	// HashMap<Integer,String> monthsMap = new HashMap<Integer,String>();
	//monthsMap.put(1,"January");
	//monthsMap.put(2,"February");
	//.
	//.
	//monthsMap.put(12,"December");
}
