/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/**
 *
 * @author samega15
 */
public class Shift
{
    final static Value reverse = DoubleSolenoid.Value.kReverse;
    final static Value forward = DoubleSolenoid.Value.kForward;
    
    DoubleSolenoid shifterSolenoidA, shifterSolenoidB;
    
    public Shift(int fwdChannelA, int revChannelA, int fwdChannelB, int revChannelB)
    {
        shifterSolenoidA = new DoubleSolenoid(fwdChannelA, revChannelA);
        shifterSolenoidB = new DoubleSolenoid(fwdChannelB, revChannelB);
    }
    
    public void toggle()
    {
        //if solenoids are equal, toggle both
        //else set both to reverse
        if (solenoidsEqual()) //check both equal
        {
            if (shifterSolenoidA.get() == reverse)
                setForward();
            else
                setReverse();
        }
        else
        {
            setReverse();
        }
    }
    
    private boolean solenoidsEqual()
    {
        return shifterSolenoidA.get() == shifterSolenoidB.get();
    }
    
    private void setForward()
    {
        shifterSolenoidA.set(forward);
        shifterSolenoidB.set(forward);
    }
    
    private void setReverse()
    {
        shifterSolenoidA.set(reverse);
        shifterSolenoidB.set(reverse);
    }
}
