package frc.robot.fabrik;

public class Vector {

    private Point terminal, initial;

    public Vector(Point terminal, Point initial){
        this.terminal = terminal;
        this.initial = initial;
    }

    public Vector(){
        this.terminal = new Point(0,0);
        this.initial = new Point(0,0);
    }

    public void normalize(){
        double length = Math.sqrt( Math.pow(terminal.getX() - initial.getX(), 2) + Math.pow(terminal.getY() - initial.getY(), 2) );
        double difX = terminal.getX() - initial.getX();
        double difY = terminal.getY() - initial.getY();

        terminal.setCoordsRelative(initial, difX / length, difY / length);
    }

    public double getLength(){
        return Math.sqrt( Math.pow(terminal.getX() - initial.getX(), 2) + Math.pow(terminal.getY() - initial.getY(), 2) );
    }

    public void setLength(double length){
        normalize();
        terminal.setCoords(terminal.getXRelative(initial) * getLength() + initial.getX(), terminal.getYRelative(initial) * getLength() + initial.getY());
    }

    public double getMagnitude(){
        return Math.sqrt(Math.pow(terminal.getXRelative(initial), 2) + Math.pow(terminal.getYRelative(initial), 2));
    }

    public double getAngleBetweenOther(Vector other){
        //TODO finish
        return 0.0;
    }

    public Point getTerminal(){
        return terminal;
    }

    public Point getInitial(){
        return initial;
    }

}
