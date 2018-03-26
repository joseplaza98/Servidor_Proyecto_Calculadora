package Servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Unicomfacauca
 */
@WebService(serviceName = "WS_Test")
public class WS_Test {

    /**
     * This is a sample web service operation
     */
        
    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2) {
    int resultado = num1 + num2;
    return  resultado;
    }
    
    @WebMethod(operationName = "restar")
    public int restar(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2) {
    int resultado = num1 - num2;
    return  resultado;
    }
    
    @WebMethod(operationName = "multiplicar")
    public float multiplicar(@WebParam(name = "num1") float num1,@WebParam(name = "num2") float num2) {
    float resultado = num1 * num2;
    return  resultado;
    }
    
    @WebMethod(operationName = "dividir")
    public float dividir(@WebParam(name = "num1") float num1,@WebParam(name = "num2") float num2) {
        
        
                
        if(num2 == 0){
            System.out.println("Error 1: La división por 0 no esta estipulada");
        }
       
        float resultado = num1 / num2;
        return resultado;
       
    }    
}  

