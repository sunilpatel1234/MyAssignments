package week1.day1;

public class LearnifElse {
public static void main(String[] args) {
	
	int number=6;

	if (number>0 && number%2==0) {
		
		
		System.out.println("even Number :"+number );
	} else {

		System.out.println("odd Number :"+ number);
	}
	
	
	int num=0;
	
	if (num>0 && number%2==0) {
		System.out.println("even :"+num );
	}
	else if(num==0) {
		System.out.println("Neutral Number : "+num);
	}
	else {

		System.out.println("odd Number :"+ num);
	}
	
}
	
	
}
