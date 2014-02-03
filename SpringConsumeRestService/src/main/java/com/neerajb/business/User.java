package com.neerajb.business;

public interface User {
	
	public boolean login(String username, String password);
	public void logout();
	public String getSessionData();
	public boolean isUserLoggedIn();
}
