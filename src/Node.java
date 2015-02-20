import java.util.ArrayList;


public class Node implements Comparable<Node> {

	private ArrayList<Integer> p;
	private int m; 
	private int product; 

	Node(int m){
		this.m = m; 
		p = new ArrayList<Integer>(); 
		product = 1; 
		int mCopy = m; 
		//getting all the prime numbers m is divisible by and adding them to p
		for(int i = 2; i < mCopy; i++){
			if(mCopy % i == 0){
				p.add(i); 
				mCopy /= i;
				product = product * i; 
			}	
		}
		//System.out.println(p + " , " + max); 
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public ArrayList<Integer> getP() {
		return p;
	}

	public void setP(ArrayList<Integer> p) {
		this.p = p;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}


	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return 0;
	}
}