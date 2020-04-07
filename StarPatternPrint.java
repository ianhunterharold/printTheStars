package printTheBasicPattern;
//import java.util.*; 
// does the * mean download everything in.util? 


public class StarPatternPrint {

	public static void main(String[] args) {
		printTheStars();
	}

	static void printTheStars(){
		int i,j,k;

		for (i = 1; i <= 7; i++)
		{
		  for (j = 1; j <= i; ++j)
		      System.out.print(j);

			  for (k = 7 - i; k >= 1; k--)
			     System.out.print("*");

		  System.out.println("");
		      }
		  }
	}
	