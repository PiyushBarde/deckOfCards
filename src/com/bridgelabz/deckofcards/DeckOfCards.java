package com.bridgelabz.deckofcards;

public class DeckOfCards {
    static String suitCondition() {
        String suit;
        int randomSuits = (int) Math.floor(Math.random() * 100) % 4 + 1;
        switch (randomSuits) {
            case 1:
                suit = "Clubs";
                break;
            case 2:
                suit = "Diamonds";
                break;
            case 3:
                suit = "Hearts";
                break;
            case 4:
                suit = "Spades";
                break;

            default:
                suit = null;
                break;
        }
        return suit;
    }

    static String rankCondition() {
        String rank;
        int ranksCondition = (int) Math.floor(Math.random() * 100) % 13 + 1;
        switch (ranksCondition) {
            case 1:
                rank = "2";
                break;
            case 2:
                rank = "3";
                break;
            case 3:
                rank = "4";
                break;
            case 4:
                rank = "5";
                break;
            case 5:
                rank = "6";
                break;
            case 6:
                rank = "7";
                break;
            case 7:
                rank = "8";
                break;
            case 8:
                rank = "9";
                break;
            case 9:
                rank = "10";
                break;
            case 10:
                rank = "Jack";
                break;
            case 11:
                rank = "Queen";
                break;
            case 12:
                rank = "King";
                break;
            case 13:
                rank = "Ace";
                break;

            default:
                rank = null;
                break;
        }
        return rank;
    }
    static String[][] printDec() {
        int counter = 0;
        String[][] player = new String[3][13];
        String[] checker = new String[13];
        String temp;
        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 3; j++) {


                temp = rankCondition();
                for (int k = 0; k <= j; k++) {
                    if (checker[k] == temp) {
                        temp = rankCondition();
                    }
                }
                checker[j] = temp;
                player[index][j] = suitCondition() + " " + temp;

            }
        }
        return player;
    }

    static void printArray(String[][] player){
        for (int index = 0; index < 3; index++) {

            for (int j = 0; j < 3; j++) {
                System.out.println(player[index][j]);
            }
        }

    }
}
