package pl.lodz.uni.math.Numbers;

public class Numbers {

    private int x;
    private int y;

    public Numbers(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int whichNumberIsBigger() {
        if (getX() == getY()) {
            return getX();
        } else if (getX() > getY()) {
            return getX();
        } else {
            return getY();
        }
    }
}
