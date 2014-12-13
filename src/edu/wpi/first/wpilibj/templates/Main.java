/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Main extends SimpleRobot
{
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    
    Joystick controller;
    DriveTrain driveTrain;
    UI ui;
    Shift shift;
    
    public void robotInit()
    {
        controller = new Joystick(1);
        driveTrain = new DriveTrain(1,2,3,4);
        shift = new Shift(1, 2, 3, 4);
        ui = new UI();
    }
    
    public void autonomous()
    {
        
    }

    /**
     * called when robot enters operatorControl.
     */
    public void operatorControl()
    {
        while(isOperatorControl() && isEnabled())
        {
            //drive robot using tank drive.
            //THUMBSTICKS drive the robot.
            driveTrain.drive(controller.getRawAxis(Constants.axis_leftStick_Y),
                             controller.getRawAxis(Constants.axis_rightStick_Y));
            
            //SHIFT
            //BUTTON A toggle shifters
            if (controller.getRawButton(buttonA))
            {
                shift.toggle();
            }
            
            ui.printOutput();
        }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test()
    {
    
    }
}
