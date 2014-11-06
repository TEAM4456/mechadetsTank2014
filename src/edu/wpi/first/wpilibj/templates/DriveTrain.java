package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * 
 * @author Mech Cadets
 */

public class DriveTrain
{
    private Jaguar MotorLF, MotorLB, MotorRF, MotorRB;
    private RobotDrive chassis;
    
    public DriveTrain(int lf, int lb, int rf, int rb)
    {
        MotorLF = new Jaguar(lf);
        MotorLB = new Jaguar(lb);
        MotorRF = new Jaguar(rf);
        MotorRB = new Jaguar(rb);
        chassis = new RobotDrive(MotorLF, MotorLB, MotorRF, MotorRB);
    }
    
    //This will set chassisSafteyEnabled to boolean enabled
    //Turns off safety mechanism to allow drive train motors to say on more than 0.1s
    public void setChassisSafteyEnabled(boolean enabled)
    {
        chassis.setSafetyEnabled(enabled);
    }
    
    //This will drive the robot given a magnitude, direciton, and location
    //Arguments are usually given by the controller
    public void drive(double leftValue, double rightValue)
    {
        chassis.tankDrive(leftValue, rightValue);
    }   
}