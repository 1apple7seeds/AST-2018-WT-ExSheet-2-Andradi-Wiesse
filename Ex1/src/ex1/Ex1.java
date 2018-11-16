package ex1;

public class Ex1 {
    public int primes_int(int input, boolean print_check) {

		if(input == 0) {
			input = Integer.MAX_VALUE;
		}

		if(print_check) {
			System.out.println(2);
		}

  	int output = 1,count = 1;
  	boolean check_prime;

  	while(count < input && output < Integer.MAX_VALUE) {
  		check_prime = true;
  		output+=2;
  		count++;
  		for(int i = (int)Math.sqrt(output);i>2;i--) {
  			if(output % i == 0) {
  				check_prime = false;
  				count--;
  				break;
  			}
  		}
  		if(print_check && check_prime) {
  			System.out.println(output);
  		}
  	}
    return output;
    }

    public double time_int(double count_to_value) {
    	double integer;
    	if (count_to_value==0) {
    		integer = Integer.MIN_VALUE;
    		count_to_value = Integer.MAX_VALUE;
    	} else {
    		integer = 0;
    	}

    	long startTime= System.nanoTime();
    	do {
    		integer++;
    	}while(integer<count_to_value);
    	long endTime = System.nanoTime();

    	long timeElapsed = endTime-startTime;
    	double timeElapsedInSeconds = (double)timeElapsed/1_000_000_000.0;
      return timeElapsedInSeconds;
    }


    public static void main(String []args) {

    	Ex1 Ex1 = new Ex1();

    	int th1 = 100;
    	System.out.println("first "+th1+" integer prime numbers: ");
    	int prime1 = Ex1.primes_int(th1,true);
    	System.out.println("\n"+th1+"-th integer prime number: "+prime1+"\n");
    	
    	System.out.println("Time taken to count (increment with unit step) from 0 to 10000:");
    	double integerCountingTime4 = Ex1.time_int(10000);
    	System.out.println(integerCountingTime4+" seconds\n");
    	
    	System.out.println("Time taken to count (increment with unit step) from 0 to 1000000:");
    	double integerCountingTime3 = Ex1.time_int(1000000);
    	System.out.println(integerCountingTime3+" seconds\n");
    	
    	System.out.println("Time taken to count (increment with unit step) from 0 to 100000000:");
    	double integerCountingTime2 = Ex1.time_int(100000000);
    	System.out.println(integerCountingTime2+" seconds\n");
    	
    	System.out.println("Time taken to count (increment with unit step) from smallest to largest integer:");
    	double integerCountingTime = Ex1.time_int(0);
    	System.out.println(integerCountingTime+" seconds\n");
    }
}

