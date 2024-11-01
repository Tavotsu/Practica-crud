import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    //Lista de proctos
    private final ArrayList<Producto> listaProductos;
    //Scanner como un atributo
    //PODEMOS UTILIZARLO DENTRO DE LOS MÉTODOS
    private final Scanner scanner;

    //Crear un constructor para inicializar mi lista vacía.
    public Tienda(){
        listaProductos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    //1 - Método para agregar productos C: create
    public void agregarProductos(){
        //1er dato ID
        System.out.println("Ingresa el id del producto");
        int id = scanner.nextInt();
        scanner.nextLine(); //Eliminar el buffer \n  1

        //2do dato Nombre
        System.out.println("Ingresa el nombre del producto");
        String nombre = scanner.nextLine();
        
        //3er dato precio
        System.out.println("Ingresa el precio del producto");
        double precio = scanner.nextDouble();

        //4 - Crear un nuevo producto //creamos un nuevo objeto
        Producto producto = new Producto(id, nombre, precio);
        //5 - añadir el producto a la lista
        listaProductos.add(producto);
    }
    //2 - Método para mostrar productos R: read
        public void mostrarProductos(){
            //1- validar si la lista está vacía.
            if(listaProductos.isEmpty()){
                System.out.println("No hay productos en el sistema (Lista vacía)");
            }else{
                //2 recorrer la lista e imprimirla
                for (Producto producto : listaProductos){
                    System.out.println(producto);
                }
            }
        }
    //3 - Método para actualizar productos U: update
        public void actualizarProductos(){
            //1- solicito el id al user
            System.out.println("Ingresa el id del producto a actualizar");
            int id = scanner.nextInt();
            scanner.nextLine();
            //2 - Recooremos la lista
            for(Producto producto : listaProductos){
                //3 buscamos una coincidencia de id's
                 if(producto.getIdProducto()==id){
                    //4 Solicitar los otros datos al user para actualizar
                    System.out.println("Ingresa el nombre a actualizar");
                    String nuevoNombre= scanner.nextLine();
                    System.out.println("Ingresa el precio a aactualizar");
                    double nuevoPrecio = scanner.nextDouble();
                    //5 actualizo los datos nombre
                    producto.setNombreProducto(nuevoNombre);
                    //actualo el precio
                    producto.setPrecioProducto(nuevoPrecio);
                    //6 entregamos un mensaje
                    System.out.println("Producto actualizado");
                    return;
            }
            }           
        }
    //4- Método para eliminar productos D: delete
    public void eliminarProducto(){
            //1- solicito el id al user
            System.out.println("Ingresa el id del producto a actualizar");
            int id = scanner.nextInt();
            scanner.nextLine();
            //2 Paso creo una variable para almacenar si hay un producto a eliminar.
            Producto productoAEliminar = null;
            //3 recorrer la lista
            for(Producto producto : listaProductos){
                //4 busco coincidencia de id
                if(producto.getIdProducto()==id){
                     //5 agrego el producto a eliminar a la variable productoAEliminar
                    productoAEliminar=producto;
                   break;
                }
            }
            //6 Pasar eliminar el producto si productoAEliminar tiene algo dentro.
            //Si productoAEliminar no es nulo....
            if (productoAEliminar !=null){
                //Paso 7 eliminar el producto de la lista
                listaProductos.remove(productoAEliminar);
                System.out.println("Producto eliminado");
            }else{
                System.out.println("Producto no encontrado por su id");
            }
    } 
}
