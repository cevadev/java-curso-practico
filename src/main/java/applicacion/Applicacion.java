package applicacion;

import java.util.Scanner;

public class Applicacion {
    public static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1. Trabajar con Clientes");
        System.out.println("2. Trabajar con Proveedores");
        System.out.println("3. Trabajar con Productos");
        System.out.println("4. Trabajar con Facturacion");
        System.out.println("0. Salir");
    }

    public static void mostrarSubMenu(String tipoMenu){
        System.out.printf("*** Menu Trabajar con %s ***\n", tipoMenu);
        System.out.println("1. Craer");
        System.out.println("2. Buscar");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.println("0. Salir");
    }

    public static void mostrarSubMenuFacturacion(){
        System.out.println("*** Menu Gestion de Facturacion ***");
        System.out.println("1. Craer");
        System.out.println("2. Buscar");
        System.out.println("0. Salir");
    }

    public static int capturarNumeroEntero(String mensaje){
        while(true){
            try{
                System.out.printf("%s: ", mensaje);
                return Integer.parseInt(teclado.nextLine());
            }
            catch(NumberFormatException ex){
                System.out.println("Mensaje: " + "Ingrese un valor que corresponda con un numero entero");
            }
        }
    }
    public static double capturarNumeroReal(String mensaje){
        while(true){
            try{
                System.out.printf("%s: ", mensaje);
                return Double.parseDouble(teclado.nextLine());
            }
            catch(NumberFormatException ex){
                System.out.println("Mensaje: " + "Ingrese un valor que corresponda con un numero real");
            }
        }
    }

    public static String capturarCadenaCaracteres(String mensaje){
        String resultado;
        while(true){
            resultado = teclado.nextLine().strip();
            if(!resultado.isEmpty()){
                return resultado;
            }
            System.out.println("MENSAJE: No ha ingresado ningun dato. Especifique un valor concreto");
        }
    }
}
