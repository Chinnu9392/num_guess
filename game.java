import java. util.*;
 public class Main {
    public static void guessingNumber()
    {
        Scanner sc = new Scanner(System.in);
        Random ob=new Random();
        int number =ob.nextInt(101); 
        int trails = 4;
        int i,guess;
        for (i = trails; i>0;i--) {
            System.out.println("\n Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("The Trails used:" +(trails-i+1));
                System.out.println("score="+ (i*25));
                break;
            }
            else if (number > guess && i != 1) {
                System.out.println("The number is greater than"+ guess);
                System.out.println("");
            }
            else if (number < guess && i != 1){
                System.out.println("The number is less than " + guess);
                System.out.println(" ");
            }
        }
        
        if ( i == 0) {
            System.out.println("Your"+trails+"completed");
            System.out.println("The number was " + number);
        }
    }
    public static void main(String arg[])
    {
       System.out.println("Welcome to the Number Guessing Game\n");
       System.out.println("A number is chosen between 0 and 100\n");
       System.out.println("guess the number within 4 trials\n");
       System.out.println("Score Criteria:\n");
       System.out.println("First Trial=100\nSecond Trail=75\nThird Trail=50\nFourth Trail=25");
       guessingNumber();
    }
}
