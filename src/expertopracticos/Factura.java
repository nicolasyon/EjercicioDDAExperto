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
public class Factura {

    private Cliente cliente;
    private ArrayList<LineaFactura> lineas = new ArrayList();

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void agregar(int cantidad, Producto p) {
        lineas.add(new LineaFactura(p, cantidad));
    }

    public boolean haComprado(Producto prod, Cliente cliente) {

        if (getCliente().equals(cliente) && tieneProducto(prod)) {
            return true;
        }

        return false;
    }

    public boolean tieneProducto(Producto prod) {
        ArrayList<LineaFactura> lineasFactura = getLineas();

        for (LineaFactura linea : lineasFactura) {

            if (linea.productoPertenece(prod)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean correspondeFactura(Cliente cliente){
        if(getCliente().equals(cliente)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", lineas=" + lineas + '}';
    }

}
