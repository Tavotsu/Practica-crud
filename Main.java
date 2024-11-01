import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Una instancia(Objeto) 
        Tienda objetoTienda = new Tienda();
        Scanner scanner = new Scanner(System.in);
        //Declarar una variable para la opción
        int opcion;
        //Menú do while : realiza la validación al final
        do{
            //opciones del menú
            System.out.println("Menú de opciones");
            System.out.println("1 - Agregar producto");
            System.out.println("2 - Mostrar producto");
            System.out.println("3 - Actualizar producto");
            System.out.println("4 - Eliminar producto");
            System.out.println("5 - Salir");
            System.out.println("Escoge el número de la opción");
            opcion = scanner.nextInt();
            scanner.nextLine();
            //decidir por que camino guíar el código según la opción
            switch(opcion){
                case 1 -> objetoTienda.agregarProductos();
                case 2 -> objetoTienda.mostrarProductos();
                case 3 -> objetoTienda.actualizarProductos();
                case 4 -> objetoTienda.eliminarProducto();

                case 5 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Ingresa una opción valida");
            }
        } while(opcion != 5);//Matiene el bucle activo mientras la opción no sea un número 5

    }
}
