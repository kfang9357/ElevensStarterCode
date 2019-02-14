package Activity1;

/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String[] args) {

        Card card = new Card("Three", "Heart", 3);
        System.out.println("The RANK is: " + card.rank());
        System.out.println("The SUITE is: " + card.suit());
        System.out.println("THE POINT VALUE is: " + card.pointValue());

        Card otherCard = new Card("Three", "Heart", 3);

        System.out.println("Determining if otherCard matches card: " + card.matches(otherCard));

        Card otherCard2 = new Card("Seven", "Spades", 7);

        System.out.println("Determining if otherCard2 matches card: " + card.matches(otherCard2));


    }
}

