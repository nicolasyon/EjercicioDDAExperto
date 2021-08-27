/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expertopracticos;


import java.util.ArrayList;


/**
 *
 * @author magda
 */
public class ControlFacturas {
    
    private static ControlFacturas instancia = new ControlFacturas();

    private ArrayList<Factura> facturas = new ArrayList();
    
    
    public static ControlFacturas getInstancia() {
        return instancia;
    }

    private ControlFacturas() {
    }
    
    public void agregar(Factura c){
        facturas.add(c);
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    
   
    
    public boolean haComprado(Producto prod, Cliente cliente){
        
        ArrayList<Factura> facturas = getFacturas();
        
        for(Factura fac: facturas){
            
            if(fac.haComprado(prod, cliente)){
                
                return true;
            }            
        }
        
        return false;
    } 
    
    /*public ArrayList<Factura> getFacturaPorCliente(String nomCliente){
        
        ArrayList<Factura> facturas = getFacturas();
        
        ArrayList<Factura> facturaCliente = new ArrayList<Factura>();
        
        for(Factura fac: facturas){
            
            if(fac.getCliente().getNombre() == nomCliente){
                                
                facturaCliente.add(fac);
            }
        }
        
        return facturaCliente;
        
    }*/
    
}
