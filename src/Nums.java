public enum Nums {
    ERROR_CODE(-1),
    MAX_LIST_SIZE(3),
    MIN_MENU(1),
    MAX_MENU(5);


    int number;

    Nums(int number) {
        this.number = number;
    }

    public int get() {
        return number;
    }
}
