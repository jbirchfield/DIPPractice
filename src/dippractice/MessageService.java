/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author jamesb
 */
public class MessageService {
    private InputStrategy msg;
    private OutputStrategy out;
    
    public MessageService(OutputStrategy out)    {
        this.out = out;
    }
    
    public void outputMessage() {
        out.outputMessage(msg);
    }
}
