import java.util.*;

public class ExpenseTracker {

	ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public void addTransaction(String type, String desc, double amount) {
		transactions.add(new Transaction(type,desc,amount));
	}
	
	public void listTransactions() {
		if (transactions.isEmpty()) {
			System.out.println("Η λίστα είναι άδεια");
			return;
		}
		for( Transaction t : transactions) {
			System.out.println(t);
		}
	}
	
	
	public double getBalance() {
		double balance = 0;
		for (Transaction t: transactions) {
			if (t.getType().equalsIgnoreCase("Income")) {
				balance += t.getAmount();
			} else {
				balance -= t.getAmount();
			}
		}
		return balance;
	}
}
