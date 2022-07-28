package com.company;
import javax.swing.*;

public class GuessNumber {
    public static void main(String[] args)
    {
        int computerNumber=(int)(Math.random()*100+1);
        int userAnswer=0, score=0;
        System.out.println("The Correct Guess would be : "+computerNumber); //print this random number
        int count=1;
        while(userAnswer != computerNumber)
        {
            String response=JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100","Guessing Game", JOptionPane.QUESTION_MESSAGE);
            userAnswer=Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, " "+determineGuess(userAnswer, computerNumber, count, score));
            count++;
        }
    }
    public static String determineGuess(int userAnswer, int computerNumber, int count, int score)
    {
        if(userAnswer <=0 || userAnswer >100)
            return "Your guess is invalid";
        else if(userAnswer == computerNumber) {
            switch (count) {
                case 1:
                    score = 100;
                    break;
                case 2:
                    score = 90;
                    break;
                case 3:
                    score = 80;
                    break;
                case 4:
                    score = 70;
                    break;
                case 5:
                    score = 60;
                    break;
                case 6:
                    score = 50;
                    break;
                case 7:
                    score =40;
                    break;
                case 8:
                    score = 30;
                    break;
                case 9:
                    score = 20;
                    break;
                case 10:
                    score = 10;
                    break;
            }
            return "Congratulations, you guess the number " + computerNumber +
            " in " + count + " guesses. \n Your score is: " + score;
        }
        else if ( count < 10 && userAnswer > computerNumber ) {
            if ( userAnswer - computerNumber > 10 ) {
                return "Your guess is too high, \n Try Number :"+count;
            }
            else {
                return "Your guess is little high, \n Try Number :"+count;
            }
        }
        else if ( count < 10 && userAnswer < computerNumber ) {
            if ( computerNumber - userAnswer > 10 ) {
                return "Your guess is too low, \n Try Number :"+count;
            }
            else {
                return "Your guess is little low, \n Try Number :"+count;
            }
        }
        else
            return "Your guess is incorrect \n Try number :"+count;
    }
}