package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fnum = 0, snum=1, sum=0;
		System.out.println(fnum);
		System.out.println(snum);
		
		for (int i =1; i<11;i++) 
		  {
			sum = fnum+snum;
			fnum=snum;
			snum=sum;
			System.out.println(sum);
			
		   }
		
	
	}
}


