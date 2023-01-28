package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class ArmMoveCommand extends CommandBase {

    private ArmSubsystem armSubsystem;

    public ArmMoveCommand(ArmSubsystem armSubsystem){
        this.armSubsystem = armSubsystem;
        addRequirements(armSubsystem);
    }

    @Override
    public void execute() {
        System.out.println(armSubsystem.getBaseAngle());
    }
}
