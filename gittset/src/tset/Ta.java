package tset;

public class Ta {
	public int sum(int x,int y){
		System.out.println(x+y);
		return x+y;
	}
	public static void main(String[] args) {
		Ta ta=new Ta();
		ta.sum(33, 55);
	}
}

