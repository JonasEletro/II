
package modbustest;

import java.io.IOException;
import java.net.UnknownHostException;
import de.re.easymodbus.modbusclient.*;
import de.re.easymodbus.exceptions.ModbusException;

/**
 *
 * @author João
 */
public class ModbusTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException, ModbusException {
        // TODO code application logic here
        
    
        ModbusClient modbusClient = new ModbusClient("127.0.0.1", 5502);
        modbusClient.Connect();
        boolean[] inputRegisters= modbusClient.ReadCoils(0, 8);
        for (int i=0 ; i<inputRegisters.length; i++)
        {
            System.out.println("input Register"+i+": "+inputRegisters[i]);
            
        }
  
       
        
    
    }
    
}
