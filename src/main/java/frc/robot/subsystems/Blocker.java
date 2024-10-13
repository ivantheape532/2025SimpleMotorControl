package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BlockerConstants;

public class Blocker extends SubsystemBase {

    private static TalonFX m_Motor = new TalonFX(0, "canivore");
    // private static TalonFX m_tmp1Motor = new TalonFX(0);
    // private static TalonFX m_tmp2Motor = new TalonFX(0, "rio");

    public Blocker(){

    }
    
    public void SetNotePassSpd(){
        m_Motor.set(BlockerConstants.PassNotePct);
    }

    public void Stop(){
        m_Motor.set(0.);
    }

    public void SetNoteOutSpd(){
        m_Motor.set(BlockerConstants.OutNotePct);
        // SetSpd(BlockerConstants.OutNotePct);
    }

    public void SetSpd(double spd){
        m_Motor.set(spd);
    }


    @Override
    public void periodic(){
        SmartDashboard.putNumber("BlockerSpd", m_Motor.getVelocity().getValueAsDouble());
    }

    public static Blocker m_Instance;
    public static Blocker getInstance() {      //make sure everyone gets the same Instance
        return m_Instance == null ? m_Instance = new Blocker() : m_Instance;
    }
}
