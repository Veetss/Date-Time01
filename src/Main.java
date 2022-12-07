import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        int currentDay = todayDate.getDayOfMonth();
        int monthLength = todayDate.lengthOfMonth();

        System.out.println(monthLength - currentDay + " days left to Halloween!");

        System.out.println(java.time.Year.of(todayDate.getDayOfMonth()).length() - todayDate.getDayOfYear() + " days left at the New years!");
        //System.out.println(java.time.Year.of(todayDate.getYear()).length() - todayDate.getDayOfYear());

    }
}