import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        String nameOfActor = "Mammootty";
        int yearOfBirth = 1951;
        String[] movieTitles = {
                "Bheeshma Parvam",
                "One",
                "Puzhu",
                "CBI 5: The Brain"
        };
        float[] ratings = {
                7.8F,
                9.0F,
                10F,
                5F
        };

        System.out.println("Name of the Actor is " + nameOfActor);
        int age = LocalDateTime.now().getYear() - 1951;
        System.out.println("Year he born : " + yearOfBirth);
        System.out.println("Age : " + age);
        for (String title : movieTitles) {
            System.out.println(title);
        }

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i] + " and the ratings is " +getRating(ratings[i]));
        }

    }

    static String getRating(float rating) {
        if (rating > 8.0) return "amazing";
        else if (rating > 7) return "very good";
        else if (rating > 6.5) return "good";
        else if (rating > 5) return "average";
        else return "bad";
    }

}