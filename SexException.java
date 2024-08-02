public class SexException extends Exception{
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: Неправильно указан пол");
        System.out.printf("Это некорректные данные: %s", i);
        System.out.println();
    }
}

