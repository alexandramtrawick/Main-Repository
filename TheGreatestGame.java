import java.util.Random;
import java.util.Scanner;

import static com.aca.GreatGame.compare;

public class GreatestGame {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.next();

    int round = 0;
    int userWins = 0;
    int computerWins = 0;
    int guesses = 0;

    game(name, round, userWins, computerWins, guesses);
    }

    private static void game(String name, int round, int userWins, int computerWins, int guesses) {
        round++;
        guesses = 0;

        Random ran = new Random();
        int computerNum = ran.nextInt((100) + 1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number from 1 to 100.");
        int userGuess = scan.nextInt();
        guesses++;

        if(computerNum == userGuess) {
            System.out.println("Congratulations, you guessed the number on the first try!");
            userWins++;
        }else{
            guesses = compareNum(computerNum, userGuess, guesses);
            if(guesses > 5){
                System.out.println("You finally guessed it after " + guesses + " guesses. You lose!");
                computerWins++;
            }else {
                System.out.println("Congratulations, " + name + ", you win! It took you " + guesses + " guesses.");
                userWins++;
            }
        }
        System.out.println("That concludes round " + round + ".\nComputer Wins: " + computerWins + "\n" + name + "'s Wins: " + userWins);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Would you like to play again? (Y/N)");
        String answer = scan2.next();
        if(answer.equalsIgnoreCase("Y")){
            game(name,round,userWins,computerWins, guesses);
        }else{
            System.exit(0);
        }
    }

    private static int compareNum(int computerNum, int userGuess, int guesses){
        Scanner scan = new Scanner(System.in);
        guesses += 1;
        while(userGuess != computerNum) {
            if (userGuess > computerNum) {
                System.out.println("Your number is higher than my number. Try again: ");
                guesses++;
                userGuess = scan.nextInt();
            }else{
                System.out.println("Your number is lower than my number. Try again: ");
                guesses++;
                userGuess = scan.nextInt();
            }
        }
        return guesses;
    }

}
