package principal;

import leer.Leer;

public class Test {

    public static void main(String[] args) {
        /*
		 * Sólo se debe añadir métodos para establecer los valores de los
		 * atributos, poder imprimirlos datos en pantalla y calcular cantidad a
		 * pagar según el precio de venta. De momento, no hace falta gestionar
		 * el almacén con los artículos que quedan, sólo se pedirá la cantidad
		 * de artículos que lleva el cliente y se dará el precio a pagar según
		 * esa cantidad.
         */

        System.out.println("Bienvenido a la tienda de JUEGOS, MÚSICA Y PELÍCULAS\n--------\n"
                        + "El programa simula una tienda que vende juegos, música y películas\n"
                        + "Los artículos sólo se pueden vender si están disponibles en la tienda\n"
                        + "El usuario puede:\n"
                        + "\t Comprar productos de los existentes.\n"
                        + "\t Añadir nuevos productos a la cesta.\n"
                        + "\t Consultar el importe de la cuenta.");

        boolean continuar = true;
        int lecturaProducto, lecturaCantidad; // Variables para seleccionar el
        // producto y la cantidad que se
        // quiere comprar


        //TALLER: aqui utilizar la función cargarProductos
        

        // Se crea el array "catálogo" para contener los productos. Su dimensión
        // viene del número de veces que se
        // instancia el contructor de Producto
        Producto catalogo[] = new Producto[Producto.dimesionArray];
        // Se crea el objeto gestion para trabajar (mostrar y vender productos,
        // y mostrar caja)
        Gestion gestion = new Gestion();

        //TALLER: Aquí rellenar el array catálogo
  

        do {
            System.out.println("\n\nIntroduzca la opción que desea realizar:\n"
                    + "1. Mostrar productos\n" + "2. Vender productos\n"
                    + "3. Mostrar caja\n"
                    + "SALIR --> Pulse cualquier otro número\n");
            switch (Leer.datoInt()) {
                case 1:
                    gestion.mostrarProductos(catalogo);
                    break;
                case 2:
                    System.out.println("¿Que producto desea comprar?");
                    gestion.mostrarNombreProductos(catalogo);
                    lecturaProducto = Leer.datoInt();
                    System.out.println("¿Cuánta cantidad desea comprar?");
                    lecturaCantidad = Leer.datoInt();
                    // Se carga el producto y la cantidad solicitada por el usuario
                    gestion.comprarProducto(catalogo, lecturaProducto,
                            lecturaCantidad);
                    break;
                case 3:
                    System.out.println(gestion.mostrarCaja() + " €");
                    break;
                    //TALLER: aqui añada la nueva opción Mostrar Ventas
                default:
                    // Se sale del programa
                    continuar = false;
            }

        } while (continuar);

        System.out.println("---- Gracias por usar la aplicación. ----");

    }

}
