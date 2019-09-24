import java.time.LocalTime;
import java.util.Objects;

public class Stopwatch {

    private LocalTime time;

    /*
    1) Начать отсчет
    2) Посмотреть время
    3) Остановить
    4) Начать новое измерение
    5) Продолжиь старое измерение
     */

    public void newTime(){
        time = LocalTime.now();
    }

    public void start(){
        if(Objects.isNull(time)) throw new NullPointerException();

    }



}
