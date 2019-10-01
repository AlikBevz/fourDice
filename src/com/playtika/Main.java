package com.playtika;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("If player first step - enter 1, if comp first - 2");
        int num = in.nextInt();


        GameFourDice gameFourDice = new GameFourDice();

       gameFourDice.generateFourDice();

        if (num == 1) {
            gameFourDice.setFirstStepUser(true);
            gameFourDice.gameOfUser();
        }

        if (num == 2) {
            gameFourDice.setFirstStepComp(true);
            gameFourDice.gameOfComp();}


            gameFourDice.resultOfPlay();


        }


}




