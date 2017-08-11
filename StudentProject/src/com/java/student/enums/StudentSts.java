package com.java.student.enums;



public enum StudentSts {
	DELETE("0"),
	ACTIVE("1"),
	LOCK("2"),
	INACTIVE("3"),
	;
	
	private String value;
	
	private StudentSts(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	public StudentSts fromValue(String value){
		for(StudentSts my: StudentSts.values()){
			if (my.value == value){
				return my;
			}
		}
		return null;
	}
	
	public String getLabel(){
		
		String label = "";
		if ("1".equals(value)){
			label = "ACTIVE";
		}else if ("2".equals(value)){
			label = "LOCK";
		}else if ("3".equals(value)){
			label = "INACTIVE";
		}else{
			label = "DELETE";
		}
		
		return label;
	}
}
