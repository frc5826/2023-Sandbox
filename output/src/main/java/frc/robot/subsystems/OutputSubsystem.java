package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OutputSubsystem extends SubsystemBase {

    private TalonSRX talon;

    public OutputSubsystem(){
        this.talon = new TalonSRX(9);
    }

    public TalonSRX getTalon() {
        return talon;
    }

    public void setSpeed(double speed){
        talon.set(TalonSRXControlMode.PercentOutput, speed);
    }

    public double getPosition() {
        return talon.getSelectedSensorPosition();
    }
}
