package com.playtika;

import java.util.ArrayList;
import java.util.List;

public class GameFourDice {

    private boolean firstStepUser=false;

    private boolean firstStepComp=false;

    public void setFirstStepUser(boolean firstStepUser) {
        this.firstStepUser = firstStepUser;
    }

    public void setFirstStepComp(boolean firstStepComp) {
        this.firstStepComp = firstStepComp;
    }

    private boolean playerWinner;
    private boolean compWinner;


    private List<Dice> listDice = new ArrayList<>();

    public void generateFourDice() {

        for (int i = 0; i < 4; i++) {

            listDice.add(new Dice());
        }
    }




    public void game() {

        for (Dice dice : listDice) {
            dice.rollDice();

        }

    }

    public void printDiceAfterRoll(){
        for (Dice dice : listDice) {
            System.out.println(dice.getPoint());
        }

    }

    public boolean resultWinner(){

        for (Dice dice : listDice) {
            if (dice.getPoint() == 6)  {
                return true;
            }
        }
        return false;
    }

    public void gameOfComp(){
        System.out.println("Comp is gaming");
        game();
        printDiceAfterRoll();
        this.compWinner=resultWinner();

    }

    public void gameOfUser(){
        System.out.println("Player is gaming");
        game();
        printDiceAfterRoll();
        this.playerWinner=resultWinner();


    }

    public void resultOfPlay() {
            if (this.playerWinner == true) {
                System.out.println("Player is winner");

            }
        else if (this.firstStepUser) System.out.println("Comp is winner");


        if (this.compWinner == true) {
            System.out.println("Comp is winner");

        }

        else if (this.firstStepComp) System.out.println("Player is winner");


//           else /* if (this.playerWinner == false)*/ {
//                System.out.println("Comp is winner");
//
//           }
//
//           /*else*/ if (this.compWinner==true){
//               System.out.println("Comp is winner");
//               return;
//           }
//
//           else /*if (this.compWinner==false)*/ {
//               System.out.println("Player is winner");
//           }
                    }
    }




