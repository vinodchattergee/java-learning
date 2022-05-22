import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        String car = "Honda BRV";
        int price = 140000;
        int moneyInBank = 1000000000;
        boolean isDamaged = true;

        //        Arithmetic Operators
        System.out.println("Price of the car " + car + " is INR " + price);
        int increasePrice = price + 8000;
        System.out.println("Price of the car " + car + " is increased to INR " + increasePrice);
        int decreasedPrice = price - 8000;
        System.out.println("Price of the car " + car + " is decreased to INR " + decreasedPrice);
        int twoCarsPrice = price * 2;
        System.out.println("Price of the 2 cars of model " + car + " is INR " + twoCarsPrice);
        int brvsYouCanBuy = moneyInBank / price;
        System.out.println("You can buy " + brvsYouCanBuy + " car(s) of model " + car + " with your money in bank");
        int moneyRemaining = moneyInBank % price;
        System.out.println("You will have " + moneyRemaining + " after buying " + brvsYouCanBuy + " BRVs");
        System.out.println();
        //        UnaryOperators
        System.out.println();
        int priceNegative = -140000;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign : INR " + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign : INR " + priceNegativeWithMinusSign);
        int oneRupeePriceIncrease = price++;//price has become 140001 but is evaluated after assignment.
        System.out.println("Price didnt increased by 1 rupee as the evaluation happened after the price is assigned. " + oneRupeePriceIncrease);
        int oneRupeePriceIncrease2 = ++price;//price has become 140002 and is evaluated before assignment.
        System.out.println("Price is increased by 2 rupee as the evaluation is now happened before the assignment. " + oneRupeePriceIncrease2);
        int oneRupeePriceDecrease = price--;//price has become 140001 but is evaluated after assignment.
        System.out.println("Price didnt decreased by 1 rupee as the evaluation happened after the price is assigned. " + oneRupeePriceDecrease);
        int oneRupeePriceDecrease2 = --price;//price has become 140000 and is evaluated before assignment.
        System.out.println("Price is decreased by 2 rupee as the evaluation is now happened before the assignment. " + oneRupeePriceDecrease2);
        System.out.println("The car is damaged? : " + !isDamaged);
        System.out.println();

        //        Equality And Relational Operators
        System.out.println();
        System.out.println("The cars price is equal to the money in the bank : " + (moneyInBank == price));
        System.out.println("The cars price is not equal to the money in the bank : " + (moneyInBank != price));
        System.out.println("The cars price is greater than the money in the bank : " + (moneyInBank < price));
        System.out.println("The cars price is lesser than the money in the bank : " + (moneyInBank > price));
        System.out.println("The cars price is greater than or equal to the money in the bank : " + (moneyInBank <= price));
        System.out.println("The cars price is lesser than or equal to the money in the bank : " + (moneyInBank >= price));
        System.out.println("The car dataType is String : " + (car instanceof String));
        System.out.println();
        String damagedText = isDamaged ? "The car is damaged " : " The car is not damaged";
        System.out.println("The cars status : " + damagedText);
        System.out.println();


//        Assignment Operators


//        Ternary Operators
//          Logical Operators
    }
}
