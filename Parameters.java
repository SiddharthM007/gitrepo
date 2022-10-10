package methodoverloading;
import java.util.*;

public class Parameters {
	int v = 500;
	void change(int v) {
		v = v+100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameters o = new  Parameters();
		System.out.println("Before making change"+o.v);
		o.change(500);
		System.out.println("After change made"+o.v);

	}

}
