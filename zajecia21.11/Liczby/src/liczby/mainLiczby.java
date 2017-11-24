package liczby;

public class mainLiczby {

    public static void main(String[] args) {
        Liczby lb = new Liczby(1, 2);
        System.out.println("Wieksza z dwoch liczb: " + lb.getX() + " oraz " + lb.getY() + " jest: " + lb.ktoraWieksza());
        Liczby lb1 = new Liczby(3, 1);
        System.out.println("Wieksza z dwoch liczb: " + lb1.getX() + " oraz " + lb1.getY() + " jest: " + lb1.ktoraWieksza());
        Liczby lb2 = new Liczby(1, 1);
        System.out.println("Wieksza z dwoch liczb: " + lb2.getX() + " oraz " + lb2.getY() + " jest: " + lb2.ktoraWieksza());
    }

}
