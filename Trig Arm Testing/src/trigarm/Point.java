package trigarm;

public class Point {

    private double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getXRelative(Point origin) {

        return x-origin.getX();
    }

    public double getYRelative(Point origin) {

        return y-origin.getY();
    }
}
