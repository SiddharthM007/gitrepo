package mypackage1;
public class Array {
static void minimum(int a[]) {
	int value = a[0];
	for (int m = 1;m<a.length;m++)
		if (value>a[m])
			value = a[m];
	System.out.println(value);
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {93,3,-1,2};
		minimum(x);

	}

}
