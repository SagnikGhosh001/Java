package Quiz;
import java.util.Scanner;

public class Main {
	public static void startQuiz(Question que[])
	{
		System.out.println("*****************Quiz APP*****************");
		Scanner sc=new Scanner(System.in);
		String answer;
		int score=0;
		for(int i=0;i<que.length;i++)
		{
			System.out.println(que[i].questions);
			System.out.println("Type your Ans: ");
			answer=sc.next();
			if(answer.equalsIgnoreCase(que[i].ans))
			{
				System.out.println("Right Ans");
				score++;
			}
			else
			{
				System.out.println("Wrong Ans");
			}	
		}
		System.out.println("Your Score is "+score+"/5");
	}

	public static void main(String[] args) {
		String s1="1. Who invented Java Programming?\r\n"
				+ "a) Guido van Rossum\r\n"
				+ "b) James Gosling\r\n"
				+ "c) Dennis Ritchie\r\n"
				+ "d) Bjarne Stroustrup";
		String s2="2. Which statement is true about Java?\r\n"
				+ "a) Java is a sequence-dependent programming language\r\n"
				+ "b) Java is a code dependent programming language\r\n"
				+ "c) Java is a platform-dependent programming language\r\n"
				+ "d) Java is a platform-independent programming language";
		String s3="3. Which component is used to compile, debug and execute the java programs?\r\n"
				+ "a) JRE\r\n"
				+ "b) JIT\r\n"
				+ "c) JDK\r\n"
				+ "d) JVM";
		String s4="4. Which one of the following is not a Java feature?\r\n"
				+ "a) Object-oriented\r\n"
				+ "b) Use of pointers\r\n"
				+ "c) Portable\r\n"
				+ "d) Dynamic and Extensible";
		String s5="5. Which of these cannot be used for a variable name in Java?\r\n"
				+ "a) identifier & keyword\r\n"
				+ "b) identifier\r\n"
				+ "c) keyword\r\n"
				+ "d) none of the mentioned";
		Question que[]={
		                            new Question(s1,"b"),
		                            new Question(s2,"d"),
		                            new Question(s3, "c"),
		                            new Question(s4, "b"),
		                            new Question(s5, "c")               
		};
		Main.startQuiz(que);

	}

}