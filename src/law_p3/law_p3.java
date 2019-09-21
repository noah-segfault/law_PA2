package law_p3;
import java.util.Scanner; 

public class law_p3 {

	public static void main(String[] args) {
		String [] topics = {"Video Games", "Music", "Movies", "TV Shows", "Books"};
		int[][] responses = new int [5][10];
		int numPeople, i , j, input, total = 0;
		double greatestAvg = 0, leastAvg = 0;
		String greatestTopic = null; 
		String leastTopic = null;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter number of people taking the survey:");
		
		numPeople = scnr.nextInt();
		
		for (i = 0; i < numPeople; i++)
		{
			System.out.println("Please rate these topics Person #" + (i + 1));
			for (j = 0; j < 5; j++)
			{
				System.out.println("What do you rate " + topics[j] + "? (1 - 10)");
				input = scnr.nextInt();
				responses[j][input - 1]++;
			}
		}
		
		for (i = 0; i < 10; i++)
		{
			System.out.printf(" %3s ", (i + 1));
		}
		System.out.print(" | ");
		System.out.println(" Avg");
		System.out.println("-----------------------------------------------------------------------");
		for (i = 0; i < 5; i++)
		{
			total = 0;
			System.out.printf("%4s ", topics[i]);
			for (j = 0; j < 10; j++)
			{
				System.out.printf("%4d ", responses[i][j]);
				total += (responses[i][j] * (j + 1));
			}
			System.out.printf("%4.2f ", (total / (double)10));
			if (i == 0)
			{
				leastAvg = (total / (double)10);
				leastTopic = topics[i];
			}
			if (leastAvg > (total / (double)10))
			{
				leastAvg = (total / (double)10);
				leastTopic = topics[i];
				
			}
			if (greatestAvg < (total / (double)10))
			{
				greatestAvg = (total / (double)10);
				greatestTopic = topics[i];
			}
			
			System.out.println();
		}
		System.out.println("The topic with the most points is " + greatestTopic);
		System.out.println("The topic with the least points is " + leastTopic);
		
		
		scnr.close();
	}
	
}
