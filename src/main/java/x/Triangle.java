package x;

public class Triangle implements Shape {
	
	int a,b,c;
	
	public Triangle (int a, int b, int c) throws Exception {
		
		if ((a == 0 ) || (b == 0) || (c == 0))
			throw new Exception("Shape can not be zero");
		
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public int sides() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int circumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
