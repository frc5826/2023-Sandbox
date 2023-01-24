package frc.robot.trigarm;

public class Vector {

    private Point initial, terminal;

    public Vector(Point initial, Point terminal) {

        initial = new Point();
        terminal = new Point();

        this.initial = initial;
        this.terminal = terminal;

    }

    public Point getInitial() {

        return initial;
    }

    public Point getTerminal() {

        return terminal;
    }

    public double getMagnitude() {

        return Math.sqrt(Math.pow(terminal.getXRelative(initial), 2) + Math.pow(terminal.getYRelative(initial), 2));
    }

}
