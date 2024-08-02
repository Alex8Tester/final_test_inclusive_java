public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: Некорректный формат данных");
        System.out.printf("Это некорректный формат: %s", i);
        System.out.println();
    }
}
