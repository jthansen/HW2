import java.util.Scanner;


public class Simulator {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want the goal to be?"); 
		int i = sc.nextInt();
		BFS b = new BFS(i); 
		sc.close();
	}

}
