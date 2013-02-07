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
    private OutputStrategy out;
    private String msg;
    
    public MessageService(OutputStrategy out)    {
        this.out = out;
    }
    
    public void outputMessage() {
        out.outputMessage(msg);
    }
}
