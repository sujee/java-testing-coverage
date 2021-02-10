package x;

public class Square implements Shape {
	int a;
	
	public Square (int a) throws Exception {
		if ( a == 0)
			throw new Exception ("Invalid size");
		
		this.a = a;
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
