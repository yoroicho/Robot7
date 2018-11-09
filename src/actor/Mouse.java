/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actor;

import java.awt.AWTException;

import java.awt.event.InputEvent;
import com.sun.glass.ui.Robot;

/**
 *
 * @author kyokuto
 */
public class Mouse {

    private static final int HOME_POS_X = 10;
    private static final int HOME_POS_Y = 150;

    private static final int WAIT_ACTIVE = 500;

    public static void mouseClick(int x, int y) {
        Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
        robot.mouseMove(x, y);
        robot.mousePress(1);
        robot.mouseRelease(1);
    }

    public static void mouseMove(int x,int y){
        Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
        robot.mouseMove(x, y);
    }
    
    
    public static void mouseActiveHome() throws AWTException {
        mouseClick(HOME_POS_X, HOME_POS_Y);
        /*
        
        Robot robot = new Robot();
        robot.mouseMove(HOME_POS_X, HOME_POS_Y);
        robot.delay(WAIT_ACTIVE);
        robot.mousePress(InputEvent..BUTTON1_DOWN_MASK);
        robot.delay(WAIT_ACTIVE);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
        robot.delay(WAIT_ACTIVE);
         */
    }
}
