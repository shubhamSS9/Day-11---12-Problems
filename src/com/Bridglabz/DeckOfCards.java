package com.Bridglabz;

public class DeckOfCards {
    static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public void cards() {

        int n = suit.length * rank.length;
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = rank[i] + " of " + suit[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 1; i <= 4; i++) {
            System.out.println("\n Player" +i);
            for (int j = 0; j < 9; j++)
                System.out.print(" " + deck[i] +  ",");
        }
    }



    public static void main(String[] args) {

        System.out.println("*****Welcome to Deck Of Cards Program*****");
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.cards();
    }
}
