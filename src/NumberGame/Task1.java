package NumberGame;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random r=new Random();
        int minRange=1;
        int maxRange=100;
        int maxAttempts=10;
        int score=0;

        boolean playAgain=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Number guessing game");
        System.out.println("I have selected the number between"+minRange+" to "+maxRange);

        while(playAgain){
          // taken random number
            int randomNumber=r.nextInt(maxRange-minRange+1)+minRange;
            int attempts=0;

            boolean guessedCorrectly=false;
            System.out.println("You have "+ maxAttempts+" to guess the number ");
            while(attempts<maxAttempts){
                 int userGuess=sc.nextInt(); //your guessed number
                 attempts++;
                if(userGuess==randomNumber){
                    guessedCorrectly=true;
                    break;
                }
                else if(userGuess<randomNumber){
                    System.out.println("Too low! ,Try Again");
                }
                else if(userGuess>randomNumber){
                    System.out.println("Too High ! ,Try Again");
                }
            }
            if(guessedCorrectly){ //if your guessed number is true and it simply prints
                System.out.println("Congrats ! You have guessed the number in "+attempts+" attempts");
                score++;
            }
            else{
                System.out.println("Sorry Bad luck! Your attempts are over");
            }

            System.out.println("Do you want to playAgain(yes/no)");
            String playagainResponse=sc.next(); //Take yes and no from user

            if(!playagainResponse.equals("yes")){ //if say no
                playAgain=false;
            }
            System.out.println("Thanks for playing ! Your score is "+score);
        }
    }
    }


