package frc.robot.subsystems;

import edu.wpi.first.util.WPIUtilJNI;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.fabrik.Arm2Segment;

import java.time.Instant;

public class ArmSubsystem extends SubsystemBase {

    private DutyCycleEncoder baseArmEncoder, middleArmEncoder;

    private Arm2Segment arm;

    private double dTime;


    public ArmSubsystem(){
        this.baseArmEncoder = new DutyCycleEncoder(Constants.baseArmEncoderID);
        this.middleArmEncoder = new DutyCycleEncoder(Constants.middleArmEncoderID);

        this.baseArmEncoder.setConnectedFrequencyThreshold(900);
        this.middleArmEncoder.setConnectedFrequencyThreshold(900);

        this.arm = new Arm2Segment(Constants.armLengths, Constants.maxError);

        this.dTime = 0;
    }

    public double getBaseAngle(){
        return baseArmEncoder.get();
    }

    public double getMiddleAngle(){
        return middleArmEncoder.get();
    }

    @Override
    public void periodic() {

    }
}
