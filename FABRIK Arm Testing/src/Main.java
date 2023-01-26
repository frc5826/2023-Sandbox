import fabrik.Arm2Segment;
import fabrik.Point;
import fabrik.Vector;
import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    @Test
    public void testArm() {
        double[] armSegs = {1, 1};
        Arm2Segment arm = new Arm2Segment(armSegs, 0.1);
        arm.setGoal(new Point(1, 1));
        arm.fabrik();

        assertEquals(Math.PI/2, arm.getArmMiddleAngle(), 0.1);
    }
}