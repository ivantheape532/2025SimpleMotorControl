package main.java.frc.robot.subsystems; //PREVIOUS ERROR: The declared package "frc.robot.subsystems" does not match the expected package "main.java.frc.robot.subsystems"

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BlockerConstants;

public class Intaker extends SubsystemBase {
    private static TalonFX m_Intaker = new TalonFX(IntakerConstants.Intaker_ID);

    public static Intaker m_Instance;

    public static Intaker GetInstance() {
        return m_Instance == null ? m_Instance = new Intaker() : m_Instance;
    }

    public Intaker() {
        // EVERYTHING
    }

    public void SetOutput(double Intaker_Out) {
        return m_Intaker.set(Intaker_Out);
    }

    public void NoteIn() {
        m_Intaker.SetOutput(IntakerConstants.NoteInOutput);
    }

    public void NoteOut() {
        m_Intaker.SetOutput(IntakerConstants.NoteOutOutput);
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("IntakerSpd", m_Motor.getVelocity().getValueAsDouble());
    }

}
