// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.trigarm.Arm;


public class ArmSubsystem extends SubsystemBase {

    private TalonSRX talon9;
    private TalonSRX talon6;
    private DutyCycleEncoder baseArmEncoder, middleArmEncoder;

    public static Arm arm;

    public ArmSubsystem() {

        this.talon9 = new TalonSRX(9);
        this.talon6 = new TalonSRX(6);

        this.baseArmEncoder = new DutyCycleEncoder(9);
        this.middleArmEncoder = new DutyCycleEncoder(8);

        this.baseArmEncoder.setConnectedFrequencyThreshold(900);
        this.middleArmEncoder.setConnectedFrequencyThreshold(900);

        this.arm = new Arm(Constants.armseg1, Constants.armseg2, Constants.origin);

    }

    public TalonSRX getTalon9() {
        return talon9;
    }

    public TalonSRX getTalon6() {
        return talon6;
    }

    public void setSpeed9(double speed){
        talon9.set(TalonSRXControlMode.PercentOutput, speed);
    }

    public void setSpeed6(double speed){
        talon6.set(TalonSRXControlMode.PercentOutput, speed);
    }

    public double getBaseAngle() {

        return 360 * baseArmEncoder.get();
    }

    public double getMiddleAngle() {

        return 360 * middleArmEncoder.get();
    }

}
