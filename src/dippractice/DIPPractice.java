/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author jamesb
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //   InputStrategy in = new ScannerInputStrategy();
        InputStrategy in = new GUIInputStrategy();
        InMsgService inmsg = new InMsgService(in);
        inmsg.inputMessage();
        
     //   OutputStrategy out = new ConsoleOutputStrategy();
        OutputStrategy out = new GUIOutputStrategy();
        MessageService service = new MessageService(out);
        service.outputMessage();
    }
}
