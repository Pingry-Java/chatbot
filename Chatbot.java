import java.util.Scanner;


/**
 * This class represent a basic AI that will chat with a human user
 * It isn't very human-like yet.
 * @author Michael Sun
 * @version 0.1
 */
 
 public class Chatbot
 {
 	public static void main(String[] args)
 	{
 		System.out.println("Hi I'm Chatbot What's your name?");
 		Scanner keyboard = new Scanner(System.in);
 		String userName = keyboard.nextLine();
 		
 		
 		System.out.println("Nice to meet you " + userName + ", how old are you");
 		int age = keyboard.nextInt();
 		keyboard.nextLine();
 		
 		if (age > 50 && age < 100 )
 		{
 			System.out.println("Wow that's old!");
 			System.out.println("Only " + (100 - age) + " years until you're 100!");
 		}
 		else
 		{
 			System.out.println("How long until your turn " + (++age) + "?"); 
 			String a = keyboard.nextLine();
 		}
 		
 		String answer = "anything other than bye"; 
 		while (! answer.equals("bye") || ! answer.equals("Bye"))) // can't use != because that comapres references 
 		{    
 				System.out.println("Tell me one of your hobbies or say \"bye\" to exit ");
 				answer = keyboard.nextLine();
 		}
 		
 	}
 
 
