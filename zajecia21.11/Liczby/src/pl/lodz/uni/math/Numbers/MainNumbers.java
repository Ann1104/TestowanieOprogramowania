package pl.lodz.uni.math.Numbers;

public class MainNumbers {

    public static void main(String[] args) {
        Numbers nb = new Numbers(1, 2);
        System.out.println("The bigger of the two numbers: " + nb.getX() + " and " + nb.getY() + " is: " + nb.whichNumberIsBigger());
        Numbers nb2 = new Numbers(3, 1);
        System.out.println("The bigger of the two numbers: " + nb2.getX() + " and " + nb2.getY() + " is: " + nb2.whichNumberIsBigger());
        Numbers nb3 = new Numbers(1, 1);
        System.out.println("The bigger of the two numbers: " + nb3.getX() + " and " + nb3.getY() + " is: " + nb3.whichNumberIsBigger());
    }

}
