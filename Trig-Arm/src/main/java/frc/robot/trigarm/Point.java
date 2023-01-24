package frc.robot.trigarm;

public class Point {

    double x, y;

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
}
