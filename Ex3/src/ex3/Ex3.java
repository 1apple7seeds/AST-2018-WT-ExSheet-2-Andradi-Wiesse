package ex3;

public class Ex3 {
	public double function_f_kn(int k, int n) {
		// returns the f value based on the given n and k values
		int i = 2;
		double p = 1, o1 = 0.9, o2 = 0.1;
		
		while(i<k) {
			p = p*o1/(1-o1);
			i++;
		}

		while(i<=n) {
			p = p*o2/(1-o2);
			i++;
		}

		double f = 1-1/(1+p);
		return f;
	}

	public double function_f_increasing_n(int k, int n) {
		int i = 2;
		double f_sofar = 0.5, o1 = 0.9, o2 = 0.1, p_sofar, p;
		while(i<k) {
			p_sofar = 1/(1-f_sofar) - 1;
			p = p_sofar*o1/(1-o1);
			f_sofar = 1-1/(1+p);
			i++;
		}

		while(i<=n) {
			p_sofar = 1/(1-f_sofar) - 1;
			p = p_sofar*o2/(1-o2);
			f_sofar = 1-1/(1+p);
			i++;
		}
		double f = f_sofar;
		return f;
	}

	public static void main(String []args) {
		Ex3 q3 = new Ex3();
		double ans = q3.function_f_kn(10, 20);
		System.out.println("f = "+ans);
		
		double ans2 = q3.function_f_increasing_n(10, 20);
		System.out.println("f with increasing n = "+ans2);
	}
}
