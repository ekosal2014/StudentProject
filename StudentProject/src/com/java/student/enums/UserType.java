package com.java.student.enums;



public enum UserType {
	student("0"),
	teacher("1"),
	;
	
	private final String value;
	
	private UserType (String value){
		this.value=value;
	}
	
	public String getLabel(){
		
		String label = "";
		
		if ("0".equals(value)){
			label = "USER";
		}else{
			label = "ADMIN";
		}
		
		return label;
		
	}
	
	public UserType fromValue(String value){
		
		for(UserType my: UserType.values()){
			if (my.value==value){
				return my;
			}
		}
		return null;
		
	}
	
	public String getValue(){
		return value;
	}
}
