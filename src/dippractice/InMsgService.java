/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author jamesb
 */
public class InMsgService {
    private InputStrategy in;
    private String msg;
    
    public InMsgService(InputStrategy in)    {
        this.in = in;
    }
    
    public void inputMessage()  {
        in.inputMessage(msg);
    }
}
