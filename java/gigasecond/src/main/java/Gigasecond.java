import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static final Duration OF_SECONDS = Duration.ofSeconds(1_000_000_000);
    LocalDateTime secondsPassed;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        secondsPassed = moment.plus(OF_SECONDS);
    }

    LocalDateTime getDateTime() {
        return secondsPassed;
    }

}
