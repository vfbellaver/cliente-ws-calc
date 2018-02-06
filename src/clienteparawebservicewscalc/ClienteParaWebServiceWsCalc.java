/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteparawebservicewscalc;

import WsCalcWebServiceCliente.CalculadoraWSService;
import javax.swing.JOptionPane;

/**
 *
 * @author BELLAVER
 */
public class ClienteParaWebServiceWsCalc {

    /**
     * @param args the command line arguments
     */
    private static double getDivide(double arg0, double arg1) {
        WsCalcWebServiceCliente.CalculadoraWSService service = new WsCalcWebServiceCliente.CalculadoraWSService();
        WsCalcWebServiceCliente.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getDivide(arg0, arg1);
    }

    private static double getMultiplica(double arg0, double arg1) {
        WsCalcWebServiceCliente.CalculadoraWSService service = new WsCalcWebServiceCliente.CalculadoraWSService();
        WsCalcWebServiceCliente.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getMultiplica(arg0, arg1);
    }

    private static double getSoma(double arg0, double arg1) {
        WsCalcWebServiceCliente.CalculadoraWSService service = new WsCalcWebServiceCliente.CalculadoraWSService();
        WsCalcWebServiceCliente.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getSoma(arg0, arg1);
    }

    private static double getSubtrair(double arg0, double arg1) {
        WsCalcWebServiceCliente.CalculadoraWSService service = new WsCalcWebServiceCliente.CalculadoraWSService();
        WsCalcWebServiceCliente.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getSubtrair(arg0, arg1);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        WsCalcWebServiceCliente.CalculadoraWSService service = new CalculadoraWSService();
        WsCalcWebServiceCliente.CalculadoraWS port = service.getCalculadoraWSPort();
        
        JOptionPane.showMessageDialog(null, "Soma = "+ port.getSoma(50, 20));
        JOptionPane.showMessageDialog(null, "Multiplica = "+ port.getMultiplica(50, 20));
        JOptionPane.showMessageDialog(null, "Divisão = " + port.getDivide(50, 20));
        JOptionPane.showMessageDialog(null, "Subtração = "+ port.getSubtrair(50, 20));
        
    }

    
    
}
