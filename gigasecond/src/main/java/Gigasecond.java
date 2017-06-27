import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    
    LocalDateTime time;
        
    Gigasecond(LocalDate birthDate) {
        time = birthDate.atStartOfDay();
        time = time.plusSeconds(1000000000);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        time = birthDateTime.plusSeconds(1000000000);
    }

    LocalDateTime getDate() {
        return time;
    }

}
