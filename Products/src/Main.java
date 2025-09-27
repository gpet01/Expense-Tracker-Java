import java.util.Scanner;

class Product {
	
	private String name;
	private double price;
	private int score;
	

	//Constructor eidikh methodos pou kanei pragmata 'h mia arxikopoihsh timwn kai kaleite opote ftiaxnoume ena antikeimeno ths klashs
	//Prepei panta to onoma na einai idio me to onoma ths klashs. ara to onoma tou kataskeuasth einai Product
	public Product() {
		name = "";
		score = 0;
		price = 1;
	}
	
	public void printData() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Score: " + score);
	}
	
	public void read() { //Methodos
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Product name: ");
		name = in.nextLine();
		System.out.print("Price: ");
		price = in.nextDouble();
		System.out.print("Score: ");
		score = in.nextInt();
	}
	
	public boolean is_better_than(Product other) { //Methodos//
		
		if(score/price > other.score/other.price)
			return true;
		
		return false;
	
		
	}
}

public class Main {

	public static void main(String[] args) {
		
		
		Product best = new Product();
		
		boolean more = true;
		while(more) {
			
			Product current = new Product();
			
			//Klhsh ths methodou read epi tou antikeimenou current
			//apostolh mhnumatos read sto antikeimeno current
			
			current.read();
			
			System.out.println("More Products? 1:Yes, 2:No");
			int answer = in.nextInt();
			if (answer !=1)
				more = false;	
		}
		
		System.out.println("Best Name: " + bestName);
		System.out.println("Best Price: " + bestPrice);
		System.out.println("Best Score: " + bestScore);
	}
	}

 