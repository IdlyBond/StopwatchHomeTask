public enum Lines {
    TRY_AGAIN("Попробуйте еще раз"),
    MENU("1) Новый отсчет \n" +
            "2) Продолжить \n" +
            "3) Приостановить \n" +
            "4) Посмотреть время \n" +
            "5) Выбрать другое время \n" +
            "6) Выйти \n"),
    ENTER_NAME("Введите название секундомера:"),
    IS_WORKING("Секундомер уже работает"),
    NOT_WORKING("Секундомер еще не работает"),
    ENTER_INDEX("Выберете:"),
    NO_ELEMENTS("Секундомеров в базе пока нет");

    String line;

    Lines(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return line;
    }
}
