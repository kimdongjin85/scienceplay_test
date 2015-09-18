package kr.co.msk.domain;


public class Users {
 
	/**
	 * 고객 IDX
	 */
	private String customerIdx;
	
	/**
	 * 이용자 ID
	 */
	private String id;
	
	/**
	 * 이용자 PASSWORD
	 */
	private String password;
	

	public String getCustomerIdx() {
		return customerIdx;
	}

	public void setCustomerIdx(String customerIdx) {
		this.customerIdx = customerIdx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
 

}
