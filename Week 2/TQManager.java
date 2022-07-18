import java.util.*;


abstract class TestQuestion{
	String question;
	TestQuestion(String Question)
	{
		question=Question;
	}
	abstract void readquestion();
}


class ShortAnswer extends TestQuestion{
	int numlines;
	ShortAnswer(String Question)
	{
		super(Question);

	}
	void readquestion()
	{
		numlines=1;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the question: ");  
		question= sc.nextLine();
	}
	public String toString()
	{
		System.out.println(question);
		System.out.println("numlines-"+numlines);
		return(" ");
	}
}

class LongAnswer extends TestQuestion{
	int numlines;
	LongAnswer(String Question)
	{
		super(Question);

	}
	void readquestion()
	{
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in); 
		System.out.println("Enter the question: ");  
		question= sc1.nextLine();
		System.out.println("Enter the number of lines: ");
		numlines=sc2.nextInt();
	}
	public String toString()
	{
		System.out.println(question);
		System.out.println("numlines-"+numlines);
		return(" ");
	}
}

class MCQ extends TestQuestion{
	int numchoices;
	MCQ(String Question)
	{
		super(Question);
	}
	String[] choices=new String[100];
	void readquestion()
	{
		int i=0;
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in); 
		System.out.println("Enter the question: ");  
		question= sc1.nextLine();
		System.out.println("Enter the number of choices: ");
		numchoices=sc2.nextInt();
		while(i<=numchoices)
		{
			choices[i]=sc2.nextLine();
			i++;
		}

	}
	public String toString()
	{
		System.out.println(question);
		int k=0;
		while(k<=numchoices)
		{
			System.out.println(choices[k]);
			k++;
		}
		return(" ");
	}
}
// Main class
public class TQManager{

	// Main driver method
	public static void main(String args[])
	{
		int type;
		String ex;
		Scanner sc= new Scanner(System.in);
		int number;
		System.out.println("Enter the number of questions");
		number=sc.nextInt();
		TestQuestion questionList[] = new TestQuestion[number];
		
		Scanner sc1= new Scanner(System.in);
		for(int curq=0;curq<number;curq++)
		{
			System.out.println("Enter 1 for Short Answer 2 for Long Answer 3 for MCQ");
			type = sc1.nextInt();
			switch(type)
			{
			case 1:
			{
				questionList[curq] = new ShortAnswer(null);
				(questionList[curq]).readquestion();
				break;

			}

			case 2:
			{
				questionList[curq] = new LongAnswer(null);
				(questionList[curq]).readquestion();
				break;

			}
			case 3:
			{
				questionList[curq] = new MCQ(null);
				(questionList[curq]).readquestion();
				break;

			}
			}
			
		}
		for(int cur=0;cur<number;cur++)
		{
			ex=(questionList[cur]).toString();
		}
			
	}
}
		


