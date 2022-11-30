package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.OutputSubsystem;

import static frc.robot.Constants.joystick;

public class TurnOutputCommand extends CommandBase {
    private OutputSubsystem outputSubsystem;

    public TurnOutputCommand(OutputSubsystem outputSubsystem){

        this.outputSubsystem = outputSubsystem;
        addRequirements(outputSubsystem);
    }

    @Override
    public void execute(){
        outputSubsystem.setSpeed(joystick.getRawAxis(1));
    }

    @Override
    public void end(boolean interupted){
        outputSubsystem.setSpeed(0);
    }

}
