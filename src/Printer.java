import java.util.Scanner;

public class Printer {

    private Scanner scr = new Scanner(System.in);

    public int getIndex(int from, int to){
        while (true) {
            if (scr.hasNextInt()) {
                int index = scr.nextInt();
                if (index >= from && index <= to) return index;
            }
            System.out.println(Lines.TRY_AGAIN);
            scr.next();
        }
    }

/*    public int getIndex(int from, int to){
        while(true){
            int number = 0;
            if(scr.hasNextInt()){
                number = scr.nextInt();
            }
            if(number >= from && number <= to){
                return number;
            }
            System.out.println(Lines.TRY_AGAIN);
        }
    }*/

    public String getName(){
        return scr.next();
    }
}
