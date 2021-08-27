/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expertopracticos;

/**
 *
 * @author magda
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        DatosPrueba.cargar();
        System.out.println(ControlStock.getInstancia().productoMasBarato());
       
        Cliente cli1 = ControlClientes.getInstancia().getClientes().get(2);
        Producto producto = ControlStock.getInstancia().getProductos().get(0);
        
        //ControlClientes.getInstancia().ge
        
        System.out.println(ControlFacturas.getInstancia().haComprado(producto, cli1));
        
        //¿Qué clientes nunca han comprado el producto más barato? La consulta debe retornar una colección de objetos Cliente.
        
        //System.out.println(ControlFacturas.getInstancia().haComprado("Caramelos", cli2));
    }
    
}
