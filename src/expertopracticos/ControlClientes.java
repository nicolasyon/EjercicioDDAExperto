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
public class ControlClientes {

    private static ControlClientes instancia = new ControlClientes();

    private ArrayList<Cliente> clientes = new ArrayList();

    public static ControlClientes getInstancia() {
        return instancia;
    }

    private ControlClientes() {
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregar(Cliente c) {
        clientes.add(c);
    }

    //¿Qué clientes nunca han comprado el producto más barato? La consulta debe retornar una colección de objetos Cliente.
    public ArrayList<Cliente> nuncaCompro() {

        ArrayList<Cliente> todosClientes = getClientes();
        
        ArrayList<Cliente> noCompraron = new ArrayList<Cliente>();

        Producto productoMasBarato = ControlStock.getInstancia().productoMasBarato();

        ArrayList<Factura> facturas = ControlFacturas.getInstancia().getFacturas();

        for (Cliente cli : todosClientes) {

           /* for (Factura fact : facturas) {
                correspondeFactura(Cliente cliente
                )
            
            if (facturas.isEmpty()) {
                    clientesNoCompraron.add(cli);
                } else {

                    for (Factura fa : facturas) {
                        ArrayList<LineaFactura> lineasFactura = fa.getLineas();

                        for (LineaFactura linea : lineasFactura) {

                            if (linea.getProducto() = productoMasBarato) {
                                clientesNoCompraron.add(cli);
                            }
                        }
                    }
                }
            }*/
        }
        
        return noCompraron;
    }
}

//slangwagen@gmail.com
