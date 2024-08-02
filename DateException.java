public class DateException extends Exception{
    public DateException() {
    }

    public void dateException(String i) {
        System.out.println("Exception: Некорректный формат данных");
        System.out.printf("Это некорректный формат: %s", i);
        System.out.println();
    }
}
