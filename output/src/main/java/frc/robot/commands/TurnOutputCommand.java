package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.OutputSubsystem;

public class TurnOutputCommand extends CommandBase {
    private OutputSubsystem outputSubsystem;

    public TurnOutputCommand(OutputSubsystem outputSubsystem){
        this.outputSubsystem = outputSubsystem;
    }

    @Override
    public void execute(){
        outputSubsystem.setSpeed(0.3);
    }
}
