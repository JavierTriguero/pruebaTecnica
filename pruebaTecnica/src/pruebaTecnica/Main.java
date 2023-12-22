package pruebaTecnica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	try  {
			// Creamos el carrito de compras que contendrá los productos

    		CarritoDeCompras carrito1 = new CarritoDeCompras(0,"carrito 1"); 

			// Creamos los productos por defecto
			
			Producto producto1 = new Producto(0,"Producto 1", 10);
			Producto producto2 = new Producto(1,"Producto 2", 20);
			Producto producto3 = new Producto(2,"Producto 3", 30);
			
    		CarritoDeCompras carrito2 = new CarritoDeCompras(1,"carrito 2"); 
    		
    		Producto producto4 = new Producto(3,"Producto 4", 10);
			Producto producto5 = new Producto(4,"Producto 5", 20);
			Producto producto6 = new Producto(5,"Producto 6", 30);
			
    		CarritoDeCompras carrito3 = new CarritoDeCompras(2,"carrito 3"); 
						
			Producto producto7 = new Producto(6,"Producto 7", 10);
			Producto producto8 = new Producto(7,"Producto 8", 20);
			Producto producto9 = new Producto(8,"Producto 9", 30);
			
			// Agregamos los productos generados anteriormente.
						 
			carrito1.agregarProducto(producto1);
			carrito1.agregarProducto(producto2);
			carrito1.agregarProducto(producto3);
						
			carrito2.agregarProducto(producto4);
			carrito2.agregarProducto(producto5);
			carrito2.agregarProducto(producto6);
					
			carrito3.agregarProducto(producto7);
			carrito3.agregarProducto(producto8);
			carrito3.agregarProducto(producto9);
				
			List<CarritoDeCompras> listaCarritos = new ArrayList();
			
			listaCarritos.add(carrito1);
			listaCarritos.add(carrito2);
			listaCarritos.add(carrito3);
						
			buscarCarrito(listaCarritos,0); // <--  introduce aquí el id del carrito que quieras consultar (por defecto, está el 0)
			eliminarCarrito(listaCarritos,2); // <-- introduce aquí el id del carrito que quieras eliminar (por defecto, está el 2)
			
		}catch (Exception e) {
			//Si salta alguna exception mensaje de error por consola
			System.out.print(e.getMessage());
		}  
       
    }

    private static void buscarCarrito(List<CarritoDeCompras> listaCarritos, int id) {
        for (CarritoDeCompras carrito : listaCarritos) {
            if (carrito.getId() == id) {
                System.out.println("Información del Carrito " + carrito.getNombre() + ":");
                System.out.println(carrito.obtenerInformacion());
                return;  // Salir del bucle una vez que se haya encontrado el carrito
            }
        }

        System.out.println("No se encontró un carrito con el ID: " + id);
    }
    private static void eliminarCarrito(List<CarritoDeCompras> listaCarritos, int id) {
    	for (CarritoDeCompras carrito : listaCarritos) {
            if (carrito.getId() == id) {
                // Eliminar el carrito encontrado
                listaCarritos.remove(carrito);
                System.out.println("Carrito con ID " + id + " eliminado correctamente.");
                return;  // Salir del método una vez que se haya eliminado el carrito
            }
        }

        System.out.println("No se encontró un carrito con el ID: " + id);
    }
}