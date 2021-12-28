package com.bridgelabz.deckofcards;

public class DeckOfCardsMain {public static void main(String[] args) {
    DeckOfCards deckOfCards = new DeckOfCards();
    System.out.println("---------Player 1------");
    deckOfCards.printArray(deckOfCards.printDec());
    System.out.println("---------Player 2------");
    deckOfCards.printArray(deckOfCards.printDec());
    System.out.println("---------Player 3------");
    deckOfCards.printArray(deckOfCards.printDec());
    System.out.println("---------Player 4------");
    deckOfCards.printArray(deckOfCards.printDec());
}
}
