package ca.celias.store.domain.account;

public class Account {
    
    private Long id;
	private String number;
	private int balance;
	private String customerId;

	public Account() {

	}
	
	public Account(String number, int balance, String customerId) {
		this.number = number;
		this.balance = balance;
		this.customerId = customerId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
