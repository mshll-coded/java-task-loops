public class WeekdaysPrinter {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (String day : weekdays) {
            if (day.equals("Friday") || day.equals("Saturday")) continue;
            System.out.println(day);
        }
    }
}
