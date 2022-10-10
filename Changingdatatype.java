package methodoverloading;
class sum {
	static int add(int x , int y) {
		return x + y;
		
	}
	static double add(double x , double y) {
		return x + y;
	}
}

 class Changingdatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(sum.add(21, 21));
		System.out.println(sum.add(21.55, 21.550));

	}

}
