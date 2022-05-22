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

//        Assignment Operators

//        UnaryOperators
//        Equality And Relational Operators
//        Ternary Operators
//          Logical Operators
    }
}
