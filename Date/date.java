package Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class date {
    public static void main(String[] args) {
        LocalDate currDate = LocalDate.now();
        LocalDateTime currDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formated = formatter.format(currDateTime);

        System.out.println(currDate);
        System.out.println(currDateTime);
        System.out.println(formated);
    }
}
