import java.util.ArrayList;
import java.util.TreeMap;


public class BFS {
		Node first = new Node(1);
		TreeMap<Node, TreeMap<Integer, Node>> map = new TreeMap<Node, TreeMap<Integer ,Node>>();
		private int expanded = 1; 
		private int goalTest = 1; 
		private int generated = 1; 
		private int max = 0; 
		
	public BFS(int goal){
		map.put(first, new TreeMap<Integer, Node>());
		if(goal == 1){
			System.out.println("Generated: " + generated + " nodes (all nodes in the tree)"); 
			System.out.println("Goal-test: " + goalTest + " nodes (shown)"); 
			System.out.println("Expanded: " + expanded + " nodes");
			return; 
		}
		 
		ArrayList<Integer> goalPrimes = new ArrayList<Integer>();
		int goalCopy = goal; 
		//finding the prime factors for goal
		if(goalCopy % 2 != 0){
			goalPrimes.add(2); 
		}
		for (int i = 2; i <= goalCopy; i++){ 
			if(goalCopy % i == 0){
				goalPrimes.add(i); 
				goalCopy /= i; 
				i--; 
			}
		}
	//checking if the goal/2 is in the arraylist
		if(!goalPrimes.contains(goal/2)){
			goalPrimes.add(goal/2); 
		}
		
	// everything works above this ******************************************
		
		
		
		for(int n = 0; n < goal*10; n++){
			if(goalPrimes.contains(n)){
				Node t = new Node(n);
				
				//adding a child to Node 1,{} 
				map.get(first).put(t.getM(), t);
				expanded++; 
				generated++; //that node was generated
				// checking to see if this node is our goal node
				goalTest++; 
				if(t.getM() == goal){
					System.out.println("Generated: " + generated + " nodes (all nodes in the tree)"); 
					System.out.println("Goal-test: " + goalTest + " nodes (shown)"); 
					System.out.println("Expanded: " + expanded + " nodes"); 
					return;
				}
				
				//running through all the prime numbers in the new node
				//adding a new child for every prime number
				for(int y = 0; y < t.getP().size(); y++){
					Node testNode = new Node(t.getP().get(y));
					map.get(t).put(t.getP().get(y), testNode);
					generated++; 
					goalTest++; 
					if(t.getP().get(y) == goal){
						System.out.println("Generated: " + generated + " nodes (all nodes in the tree)"); 
						System.out.println("Goal-test: " + goalTest + " nodes (shown)"); 
						System.out.println("Expanded: " + expanded + " nodes"); 
						return;
					}
					System.out.println(testNode.getM()); 
					System.out.println(testNode.getP());
					
				} 
				System.out.println("no");
			}
			System.out.println(goalPrimes);
		}
	}
}