import java.util.Arrays;
import java.util.Scanner;

class Card
{
    String suit;
    int value;

    Card(String suit, int value)
    {
        this.suit = suit;
        this.value = value;
    }

    void display()
    {
    System.out.println("Suit and Value are: "+this.suit+this.value);
    }
}

class Pile
{
    int top=-1;
    int temp=0;
    Card arr[] = new Card[10];

    void place(Card card)
    {
        if(top==9)
        {
        System.out.println("Pile is full");
        }
        else
        {
            top++;
            arr[top]=card;
            System.out.println("Card placed");
        }
    }

    void draw()
    {
        if(top==-1)
        {
            System.out.println("Pile is empty");
        }
        else
        {
            top--;
            System.out.println("Card drawn");
        }
    }

    void peek()
    {
        if(top==-1)
        { 
            System.out.println("Pile is empty");
        }
        else
        {
            arr[top].display();
        }
    }
}

public class P1_Week2
{
    public static void main(String[] args)
    {
        //considering that the user has 5 cards with him
        Card card[] = new Card[5];
        card[0] = new Card("Spade",1);
        card[1] = new Card("Heart",2);
        card[2] = new Card("Clove",3);
        card[3] = new Card("Club",4);
        card[4] = new Card("Club",5);
        Pile pile = new Pile();
        Scanner s = new Scanner(System.in);
        int op;
        while(true)
        {
            System.out.println("1.Place");
            System.out.println("2.Draw");
            System.out.println("3.Peek");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            op=s.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("Enter the card number to be placed");
                    int card_num = s.nextInt();
                    if(card_num>5)
                    {
                        System.out.println("Invalid card");
                    }
                    else
                    {
                        pile.place(card[card_num-1]);
                    }
                    break;
                case 2:
                    pile.draw();
                    break;
                case 3:
                    pile.peek();
                    break;
                case 4:
                    s.close();
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter a valid number");
            }
        }
    }
}
