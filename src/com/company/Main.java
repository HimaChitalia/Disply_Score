package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        game();

    }

    public static void game(){



                int teamA = 0;
                int teamB = 0;


                //asks for the team selection
                while(true) {
                    System.out.println("Would you like to be in Team A or Tema B? Write A for team A and B for team B. Type anything else to quit.");
                    Scanner input = new Scanner(System.in);
                    String result = input.next();


                    if (result.toUpperCase().equals("A")) {
                        System.out.println("Score of TeamA is " + ++teamA);
                    } else if (result.toUpperCase().equals("B")) {
                        System.out.println("Score of TeamB is " + ++teamB);
                    }
                    else {
                        break;
                    }

                }System.out.println("See you again!");


    }


}