import java.time.LocalTime;
import java.util.Objects;

public class Stopwatch {

    private final String name;

    public Stopwatch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private LocalTime now = LocalTime.of(0, 0, 0, 0);

    private LocalTime start;

    private boolean isRunning = false;

    public int proceed(){
        if(isRunning) return -1;
        start = LocalTime.now();
        isRunning = true;
        return 0;
    }

    private void count(){
        if(!isRunning) return;
        LocalTime end = LocalTime.now();
        now = now.plusMinutes(end.getMinute() - start.getMinute())
                .plusSeconds(end.getSecond() - start.getSecond())
                .plusNanos(end.getNano() - start.getNano());
        start = LocalTime.now();
    }

    public int stop(){
        if(!isRunning) return -1;
        count();
        isRunning = false;
        return 0;
    }

    @Override
    public String toString() {
        count();
        return now.getMinute() + ":" + now.getSecond() + ":" + now.getNano();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stopwatch stopwatch = (Stopwatch) o;
        return isRunning == stopwatch.isRunning &&
                Objects.equals(name, stopwatch.name) &&
                Objects.equals(now, stopwatch.now) &&
                Objects.equals(start, stopwatch.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, now, start, isRunning);
    }
}
