/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXMLRobotUty;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import robot7.MsgBox;

/**
 * FXML Controller class
 *
 * @author kyokuto
 */
public class FXMLRobotGrandPanelController implements Initializable {

    /* * http://stackoverflow.com/questions/1248510/convert-string-to-keyevents?answertab=votes#tab-top */
    @FXML
    private AnchorPane anchorPane;
    /**
     * * * @author AnyUser
     */

    private final Long SLEEP_WAIT = 10L;
    private Robot robot;
    private boolean dontPushEnter;

    public FXMLRobotGrandPanelController() {
        try {
            this.robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(FXMLRobotGrandPanelController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public boolean doTyping(String letter) throws Exception {
        dontPushEnter = false;
        FXMLRobotGrandPanelController keyboard = new FXMLRobotGrandPanelController();
        robot.delay(500);
        try {
            keyboard.type(letter);
        } catch (IllegalArgumentException i) {
            MsgBox.error("マルチバイトなどのタイプ不能文字 " + i + " です。"
                    + "この行のこれ以降のタイプを中止します。");
            return false;
        }
        return true;
        //((Stage) anchorPane.getScene().getWindow()).hide();
    }

    /*
        public Keyboard() throws AWTException {
            this.robot = new Robot();
        }

        public FXMLRobotGandPanelController(Robot robot) {
            this.robot = robot;
        }
     */
    public void type(CharSequence characters) {
        int length = characters.length();
        for (int i = 0; i < length; i++) {
            try {
                char character = characters.charAt(i);
                type(character);
                Thread.sleep(SLEEP_WAIT);
            } catch (InterruptedException ex) {
                Logger.getLogger(FXMLRobotGrandPanelController.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    public void type(char character) {
        switch (character) {
            case 'a':
                doType(VK_A);
                break;
            case 'b':
                doType(VK_B);
                break;
            case 'c':
                doType(VK_C);
                break;
            case 'd':
                doType(VK_D);
                break;
            case 'e':
                doType(VK_E);
                break;
            case 'f':
                doType(VK_F);
                break;
            case 'g':
                doType(VK_G);
                break;
            case 'h':
                doType(VK_H);
                break;
            case 'i':
                doType(VK_I);
                break;
            case 'j':
                doType(VK_J);
                break;
            case 'k':
                doType(VK_K);
                break;
            case 'l':
                doType(VK_L);
                break;
            case 'm':
                doType(VK_M);
                break;
            case 'n':
                doType(VK_N);
                break;
            case 'o':
                doType(VK_O);
                break;
            case 'p':
                doType(VK_P);
                break;
            case 'q':
                doType(VK_Q);
                break;
            case 'r':
                doType(VK_R);
                break;
            case 's':
                doType(VK_S);
                break;
            case 't':
                doType(VK_T);
                break;
            case 'u':
                doType(VK_U);
                break;
            case 'v':
                doType(VK_V);
                break;
            case 'w':
                doType(VK_W);
                break;
            case 'x':
                doType(VK_X);
                break;
            case 'y':
                doType(VK_Y);
                break;
            case 'z':
                doType(VK_Z);
                break;
            case 'A':
                doType(VK_SHIFT, VK_A);
                break;
            case 'B':
                doType(VK_SHIFT, VK_B);
                break;
            case 'C':
                doType(VK_SHIFT, VK_C);
                break;
            case 'D':
                doType(VK_SHIFT, VK_D);
                break;
            case 'E':
                doType(VK_SHIFT, VK_E);
                break;
            case 'F':
                doType(VK_SHIFT, VK_F);
                break;
            case 'G':
                doType(VK_SHIFT, VK_G);
                break;
            case 'H':
                doType(VK_SHIFT, VK_H);
                break;
            case 'I':
                doType(VK_SHIFT, VK_I);
                break;
            case 'J':
                doType(VK_SHIFT, VK_J);
                break;
            case 'K':
                doType(VK_SHIFT, VK_K);
                break;
            case 'L':
                doType(VK_SHIFT, VK_L);
                break;
            case 'M':
                doType(VK_SHIFT, VK_M);
                break;
            case 'N':
                doType(VK_SHIFT, VK_N);
                break;
            case 'O':
                doType(VK_SHIFT, VK_O);
                break;
            case 'P':
                doType(VK_SHIFT, VK_P);
                break;
            case 'Q':
                doType(VK_SHIFT, VK_Q);
                break;
            case 'R':
                doType(VK_SHIFT, VK_R);
                break;
            case 'S':
                doType(VK_SHIFT, VK_S);
                break;
            case 'T':
                doType(VK_SHIFT, VK_T);
                break;
            case 'U':
                doType(VK_SHIFT, VK_U);
                break;
            case 'V':
                doType(VK_SHIFT, VK_V);
                break;
            case 'W':
                doType(VK_SHIFT, VK_W);
                break;
            case 'X':
                doType(VK_SHIFT, VK_X);
                break;
            case 'Y':
                doType(VK_SHIFT, VK_Y);
                break;
            case 'Z':
                doType(VK_SHIFT, VK_Z);
                break;
            case '`':
                doType(VK_SHIFT, VK_AT);
                break;
            case '0':
                doType(VK_0);
                break;
            case '1':
                doType(VK_1);
                break;
            case '2':
                doType(VK_2);
                break;
            case '3':
                doType(VK_3);
                break;
            case '4':
                doType(VK_4);
                break;
            case '5':
                doType(VK_5);
                break;
            case '6':
                doType(VK_6);
                break;
            case '7':
                doType(VK_7);
                break;
            case '8':
                doType(VK_8);
                break;
            case '9':
                doType(VK_9);
                break;
            case '-':
                doType(VK_MINUS);
                break;
            case '=':
                doType(VK_SHIFT, VK_MINUS);
                break;
            case '~':
                doType(VK_SHIFT, VK_CIRCUMFLEX);
                break;
            case '!':
                doType(VK_SHIFT, VK_1);
                break;
            case '@':
                doType(VK_AT);
                break;
            case '#':
                doType(VK_SHIFT, VK_3);
                break;
            case '$':
                doType(VK_SHIFT, VK_4);
                break;
            case '%':
                doType(VK_SHIFT, VK_5);
                break;
            case '^':
                doType(VK_CIRCUMFLEX);
                break;
            case '&':
                doType(VK_SHIFT, VK_6);
                break;
            case '*':
                doType(VK_SHIFT, VK_COLON);
                break;
            case '(':
                doType(VK_SHIFT, VK_8);
                break;
            case ')':
                doType(VK_SHIFT, VK_9);
                break;
            case '_':
                doType(VK_UNDERSCORE);
                break;
            case '+':
                doType(VK_SHIFT, VK_SEMICOLON);
                break;
            case '\t':
                doType(VK_TAB);
                break;
            case '\n':
                doType(VK_ENTER);
                break;
            case '[':
                doType(VK_OPEN_BRACKET);
                break;
            case ']':
                doType(VK_CLOSE_BRACKET);
                break;
            case '\\':
                doType(VK_BACK_SLASH);
                break;
            case '{':
                doType(VK_SHIFT, VK_OPEN_BRACKET);
                break;
            case '}':
                doType(VK_SHIFT, VK_CLOSE_BRACKET);
                break;
            case '|':
                doType(VK_SHIFT, VK_BACK_SLASH);
                break;
            case ';':
                doType(VK_SEMICOLON);
                break;
            case ':':
                doType(VK_COLON);
                break;
            case '\'':
                doType(VK_SHIFT, VK_7);
                break;
            case '"':
                doType(VK_SHIFT, VK_2);
                break;
            case ',':
                doType(VK_COMMA);
                break;
            case '<':
                doType(VK_SHIFT, VK_COMMA);
                break;
            case '.':
                doType(VK_PERIOD);
                break;
            case '>':
                doType(VK_SHIFT, VK_PERIOD);
                break;
            case '/':
                doType(VK_SLASH);
                break;
            case '?':
                doType(VK_SHIFT, VK_SLASH);
                break;
            case ' ':
                doType(VK_SPACE);
                break;
            default:
                System.out.println("now " + String.valueOf(character));
                throw new IllegalArgumentException(String.valueOf(character));
        }
    }

    private void doType(int... keyCodes) {
        doType(keyCodes, 0, keyCodes.length);
    }

    private void doType(int[] keyCodes, int offset, int length) {
        if (length == 0) {
            return;
        }
        if (keyCodes[offset] == VK_UNDERSCORE) { // '_' for Windows robot.delay(1000); JOptionPane.showMessageDialog(null, "Press the [_] key => press the Ok button => click window"); // Key with hand. robot.delay(3000); } else { robot.keyPress(keyCodes[offset]); doType(keyCodes, offset + 1, length - 1); robot.keyRelease(keyCodes[offset]); } */ if (keyCodes[offset] == VK_UNDERSCORE) {
            System.out.println("Type UNDERSCORE '_' !");
            //MsgBox.info("およそ" + (offset + 1) + " ステップ目に _ があり、行末改行は無効化されます。");
            keyCodes[offset] = VK_AT;
            this.dontPushEnter = true;
        }
        if (keyCodes[offset] == 16 && keyCodes[offset + 1] == 92) {
            System.out.println("Type PIPE ' | ' !");
            //MsgBox.info("およそ" + (offset + 1) + " ステップ目に | があり、行末改行は無効化されます。");
            this.dontPushEnter = true;
        }
        if (keyCodes[offset] == VK_ENTER
                && this.dontPushEnter == true) {
            MsgBox.info("文中に'_'または'|'が含まれてたため、行末改行を無効化しました。"
                    + System.lineSeparator()
                    + "'_'は'@'に置換しています。文字の欠損に注意して手動で改行してください。");
            return; // End of type when with in not typeable caractor.
        }
        System.out.println("Keyode = " + keyCodes[offset]);
        robot.keyPress(keyCodes[offset]);
        doType(keyCodes, offset + 1, length - 1);
        robot.keyRelease(keyCodes[offset]);

        //Robot7.FXMLDocumentController.showAgain();
    }

    @FXML
    public void pasteKeyPattarn() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
        } catch (AWTException ex) {
            Logger.getLogger(FXMLRobotGrandPanelController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void mouseClick(int x, int y) {
        com.sun.glass.ui.Robot robot = com.sun.glass.ui.Application.GetApplication().createRobot();
        robot.mouseMove(x, y);
        robot.mousePress(1);
        robot.mouseRelease(1);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        anchorPane.setOpacity(0.3);
    }

}
