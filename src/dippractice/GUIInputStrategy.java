/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author jamesb
 */
public class GUIInputStrategy implements InputStrategy {
    @Override
    public void inputMessage(String msg)    {
       msg = JOptionPane.showInputDialog("Enter a message: ");
    }
}
