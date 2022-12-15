package entities;

import java.util.Date;
import java.util.Objects;

public class LogUsers implements Comparable<LogUsers>{
	private String userName;
	private Date userAccess;
		
	public LogUsers() {
	}
		
	public LogUsers(String userName, Date userAccess) {
		this.userName = userName;
		this.userAccess = userAccess;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getUserAccess() {
		return userAccess;
	}
	public void setUserAccess(Date userAccess) {
		this.userAccess = userAccess;
	}


	@Override
	public String toString() {
		return "LogUsers [userName=" + userName + ", userAccess=" + userAccess + "]";
	}

	@Override
	public int compareTo(LogUsers other) {		
		return userName.compareTo(other.getUserName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogUsers other = (LogUsers) obj;
		return Objects.equals(userName, other.userName);
	}
	
	
	
}
