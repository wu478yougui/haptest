package com.hand.hap.attachment.utils;

public class createUUID {
	
	public static String getUUID(){
			java.util.UUID uuid=java.util.UUID.randomUUID();
			    String str = uuid.toString(); 
			    String uuidStr=str.replace("-", "");
			    System.out.println(uuidStr);
			    return uuidStr;
		
}
}