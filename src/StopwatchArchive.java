import java.util.ArrayList;
import java.util.List;

public class StopwatchArchive {

    private List<Stopwatch> watchList = new ArrayList<>();

    public Stopwatch set(Stopwatch stopwatch){
        if(watchList.size() == Nums.MAX_LIST_SIZE.get()){
            if(!isEmpty()) watchList.remove(0);
            ((ArrayList) watchList).trimToSize();
            return add(stopwatch);
        }
        return add(stopwatch);
    }

    public Stopwatch choose(int index){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
        return watchList.get(index);
    }

    private Stopwatch add(Stopwatch stopwatch){
        watchList.add(stopwatch);
        return stopwatch;
    }

    public boolean isEmpty(){
        return watchList.isEmpty();
    }

    public int getSize(){
        return watchList.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < watchList.size(); i++) {
            builder.append(i + 1).append(") ").append(watchList.get(i).getName()).append(": ").append(watchList.get(i)).append("\n");
        }
        return builder.toString();
    }
}
