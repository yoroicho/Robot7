/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot7;

import javafx.fxml.FXML;
import javax.swing.JOptionPane;

/**
 *
 * @author kyokuto
 */
public class MsgBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = -1; i < 4; i++) {
            JOptionPane.showMessageDialog(null, String.valueOf(i), String.valueOf(i), i);
        }
    }

    
    public static void info(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void error(String msg) {
        JOptionPane.showMessageDialog(null, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public static void plain(String msg) {
        JOptionPane.showMessageDialog(null, msg, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void question(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Question", JOptionPane.QUESTION_MESSAGE);
    }

    public static void warning(String msg) {
        JOptionPane.showMessageDialog(null, msg, "WARNING!", JOptionPane.WARNING_MESSAGE);
    }

}
