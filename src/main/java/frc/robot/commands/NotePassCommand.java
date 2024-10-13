package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Blocker;

public class NotePassCommand extends Command{
    private static Blocker m_Blocker = Blocker.getInstance();

    public double spd = 0.;

    public NotePassCommand(){
        addRequirements(RobotContainer.m_Blocker);
    }

    @Override
    public void initialize(){
        RobotContainer.m_Blocker.SetNotePassSpd();
    }

    @Override
    public void execute(){
        //anything you like
    }

    @Override
    public void end(boolean interrupted){
        m_Blocker.Stop();
    }

    @Override
    public boolean isFinished(){
        // if(RobotContainer.m_driverController.getAButton()) return false;
        // return true;

        // return !RobotContainer.m_driverController.getAButton();

        if(!RobotContainer.m_driverController.getAButton()) return true;
        // if(HasNote()) return true;
        // if(NoVisionToNote()) return true;
        return false;
        // return false;
    }

}
