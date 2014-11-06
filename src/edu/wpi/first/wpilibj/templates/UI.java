import edu.wpi.first.wpilibj.DriverStationLCD;

package edu.wpi.first.wpilibj.templates;

public class UI
{
    private DriverStationLCD outputBox;
    private int printCounter;
    
    public UI()
    {
        outputBox = DriverStationLCD.getInstance();
        printCounter = 0;
    }
    
    public void printOutput()
    {
        printCounter++;
        
        //clear, update, and reset printCounter
        if (printCounter == 100)
        {
            //clear output box
            outputBox.println(DriverStationLCD.Line.kUser1, 1, "                                        ");
            outputBox.println(DriverStationLCD.Line.kUser2, 1, "                                        ");
            outputBox.println(DriverStationLCD.Line.kUser3, 1, "                                        ");
            outputBox.println(DriverStationLCD.Line.kUser4, 1, "                                        ");
            outputBox.println(DriverStationLCD.Line.kUser5, 1, "                                        ");
            outputBox.println(DriverStationLCD.Line.kUser6, 1, "                                        ");
            
            //update the LCD
            outputBox.updateLCD();
            
            //reset printCounter
            printCounter = 0;
        }
        
        outputBox.println(DriverStationLCD.Line.kUser1, 1, "UI test                                 ");
        outputBox.println(DriverStationLCD.Line.kUser2, 1, "                                        ");
        outputBox.println(DriverStationLCD.Line.kUser3, 1, "                                        ");
        outputBox.println(DriverStationLCD.Line.kUser4, 1, "                                        ");
        outputBox.println(DriverStationLCD.Line.kUser5, 1, "                                        ");
        outputBox.println(DriverStationLCD.Line.kUser6, 1, "                                        ");
        
        outputBox.updateLCD();
    }
}
