import java.util.Arrays;
public class TestCarritoDeCompras {
    public static void main(String[] args) {
        Producto [] productosComprar = {new Producto("P1",10,2), new Producto("P2", 5, 1)};
        CarritoDeCompras carritoCompras = new CarritoDeCompras(productosComprar);
        carritoCompras.calcularMontoFactura();
        carritoCompras.calcularDescuento();
        System.out.println(carritoCompras);
    }
}

class Producto{
    public String nombre;
    public double precio;
    public double cantidad;

    public Producto(String nombre, double precio, double cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("PRODUCTO\n"
                + "Nombre: %s\n", nombre
                + "Precio: %.2f\n", precio
                + "Cantidad : %.2f\n", cantidad);
    }
       
}

class CarritoDeCompras{
    public Producto[] productos;
    public double efectivo;
    public double montoFactura;
    public double descuento;
    
    public CarritoDeCompras(Producto[] productos){
        this.productos = productos;
    }
    
    public double calcularMontoFactura(){
        for(Producto producto : productos){
            this.montoFactura += (producto.precio * producto.cantidad);
        }
        return this.montoFactura;
    }
    
    public void calcularDescuento(){
        if(this.montoFactura > 1000)
            this.descuento = this.montoFactura * 0.1;
    }

    @Override
    public String toString() {
        return String.format("CAARRITO: \n"
                + "Lista Productos: %s\n"
                + "Efectivo: %.2f\n"
                + "Monto compra: %.2f\n"
                + "Decuento: %.2f",
                Arrays.toString(productos), efectivo, montoFactura, descuento);
    }
}
