import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ExpenseTracker tracker = new ExpenseTracker();
		Transaction ts = new Transaction();
		int choice;
		
		do {
			System.out.println("\n==== EXPENSE TRACKER ====");
			System.out.println("1. Καταχώρηση Εσόδων");
			System.out.println("2. Καταχώρηση Εξόδων");
			System.out.println("3. Εμφάνιση Συνναλαγών");
			System.out.println("4. Προβολή Υπολοίπου");
			System.out.println("0. Έξοδος");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			
				case 1,2 -> {
					System.out.println("Περιγραφή: ");
					String desc = scanner.nextLine();
					System.out.println("Ποσό: ");
					Double amount = scanner.nextDouble();
					scanner.nextLine();
					String type = (choice == 1? "Income" : "Expense" );
					tracker.addTransaction(type, desc, amount);
				}
				
				case 3 -> tracker.listTransactions();
				case 4 -> System.out.printf("Υπόλοιπο: %.2f €\n", tracker.getBalance());
				case 0 -> System.out.println("Αντίο");
				
				default -> System.out.println("Μη έγκυρη επιλογή!");
			}
			
			
			
		} while (choice!= 0);

	}

}
