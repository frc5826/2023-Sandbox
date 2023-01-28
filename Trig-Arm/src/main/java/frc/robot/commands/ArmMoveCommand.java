// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.trigarm.Arm;

public class ArmMoveCommand extends CommandBase
{
    ShuffleboardTab arm = Shuffleboard.getTab("Arm");
    NetworkTableEntry armsetpoint1 = arm.add("Arm Setpoint1", 0).getEntry();
    NetworkTableEntry armsetpoint2 = arm.add("Arm Setpoint2", 0).getEntry();

    private final ArmSubsystem armSubsystem;

    PIDController pid1 = new PIDController(0.1, 0, 0);
    PIDController pid2 = new PIDController(0.1, 0, 0);
    

    public ArmMoveCommand(ArmSubsystem armSubsystem)
    {
        arm.addNumber("Middle Encoder Value: ", () -> armSubsystem.getMiddleAngle());
        arm.addNumber("Base Encoder Value: ", () -> armSubsystem.getBaseAngle());

        this.armSubsystem = armSubsystem;
        addRequirements(armSubsystem);

        pid1.setSetpoint(0);
        pid2.setSetpoint(0);
    }

    @Override
    public void execute() {

        armSubsystem.setSpeed9(pid1.calculate(armSubsystem.getMiddleAngle(), armsetpoint1.getDouble(0)));
        armSubsystem.setSpeed6(pid2.calculate(armSubsystem.getBaseAngle(), armsetpoint2.getDouble(0)));

        System.out.println(armSubsystem.arm.calculateBeta());
        System.out.println(armSubsystem.arm.calculateDistance());
        System.out.println(armSubsystem.getBaseAngle());
        System.out.println(armSubsystem.getMiddleAngle());
        System.out.println("");
    }

}
