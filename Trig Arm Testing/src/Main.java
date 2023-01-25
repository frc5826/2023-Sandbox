import trigarm.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Point goal = new Point(3,4);
        Point origin = new Point(0,0);

        Arm arm = new Arm(4,5);
        arm.setGoal(goal);
        arm.setOrigin(origin);

        System.out.println((180/Math.PI) * arm.calculateAlpha());
        System.out.println(arm.calculateDistance());
        System.out.println((180/Math.PI) * arm.calculateBeta());
        System.out.println((180/Math.PI) * arm.calculateTheta());
        System.out.println((180/Math.PI) * arm.calculateGamma());

    }
}