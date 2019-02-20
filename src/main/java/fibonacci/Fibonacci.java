package fibonacci;

import java.util.ArrayList;

public class Fibonacci {

	public ArrayList result = new ArrayList();
	private int n1;
	private int n2;
	private int i;
	private int count; 
	private final String content;


	public Fibonacci(int n1, int n2, int i, int count, String content) {
		this.result = result;
		this.n1 = n1;
		this.n2 = n2;
		this.i = i;
		this.count = count;
		this.content = content;

	}

	public String getContent() {
		return content;
	}


	public ArrayList getFib() {
		result.add(0);
		result.add(1);
		int currIndex=1;
		while(currIndex<count)
		{
			result.add(((Integer)result.get(currIndex))+((Integer)result.get(currIndex-1)));
			currIndex++;
			System.out.print(result.get(currIndex)+ " ");
		}
		return result;
	}

}