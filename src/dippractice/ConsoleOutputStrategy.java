/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author jamesb
 */
public class ConsoleOutputStrategy implements OutputStrategy {
    @Override
    public void outputMessage(String msg)    {
       System.out.println(msg); 
    }
    
}
