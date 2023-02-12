public class Main {
    public static void main(String[] args) {
        double coast = 999.99; //Цена билета
        int miles_per_coast = 20;
        int miles = (int)coast / miles_per_coast;
        System.out.println("Цена билета: " + coast);
        System.out.println("Накоплено миль: " + miles);
    }
}