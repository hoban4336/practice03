package prob2;

public class Account {
	String accountNo ;
	int balance;
	
	Account(String s){
		this.accountNo = s;
		System.out.println(s +"계좌가 개설되었습니다.");
		
	}
	public void save(int i){
		System.out.println(accountNo + "계좌에 " +i+"만원이 입금되었습니다.");
		balance += i;
	}
	public void deposit(int i){
		System.out.println(accountNo + "계좌에 " +i+"만원이 출금되었습니다.");
		balance -= i;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getDeposit() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
