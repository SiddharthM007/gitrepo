package methodoverloading;
class Sid{
	static int add(int x,int y) {
		return x + y;
	}
	static int add(int x, int y , int z) {
		return x + y + z;
		
	}
}

 class Changingnumberofarguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sid.add(10, 21));
		System.out.println(Sid.add(21, 11,11));

	}

}
