public class StopwatchProcessor {

    private Stopwatch stopwatch;

    private StopwatchArchive archive = new StopwatchArchive();

    private Printer printer = new Printer();

    public void start(){
        set();
        menu();
    }

    private void menu(){
        System.out.println(Lines.ENTER_INDEX);
        while (true) {
            System.out.println(Lines.MENU);
            switch (printer.getIndex(Nums.MIN_MENU.get(), Nums.MAX_MENU.get())) {
                case 1:
                    set();
                    break;
                case 2:
                    proceed();
                    break;
                case 3:
                    stop();
                    break;
                case 4:
                    viewTime();
                    break;
                case 5:
                    choose();
                    break;
                case 6:
                    return;
            }
        }
    }

    private void set(){
        System.out.println(Lines.ENTER_NAME);
        stopwatch = archive.set(new Stopwatch(printer.getName()));
    }

    private void viewTime(){
        System.out.println(stopwatch.toString());
    }

    private void proceed(){
        if(stopwatch.proceed() == Nums.ERROR_CODE.get()) System.out.println(Lines.IS_WORKING);
    }

    private void stop(){
        if(stopwatch.stop() == Nums.ERROR_CODE.get()) System.out.println(Lines.NOT_WORKING);
    }

    private void choose(){
        stopwatch.stop();
        if(archive.isEmpty()) {
            System.out.println(Lines.NO_ELEMENTS);
            return;
        }
        System.out.println(Lines.ENTER_INDEX);
        System.out.println(archive.toString());
        stopwatch = archive.choose(printer.getIndex(1, archive.getSize()) - 1);

    }


}
