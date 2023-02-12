public class Main {
    public static void main(String[] args) {
        double coast = 999.99; //Цена билета
        int milesPerCoast = 20;
        int miles = (int)coast / milesPerCoast;
        System.out.println("Цена билета: " + coast);
        System.out.println("Накоплено миль: " + miles);
    }
}