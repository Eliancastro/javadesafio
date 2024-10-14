import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.00;
        int option = 0;

        System.out.println("**************************************");
        System.out.println("\nnombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");
        System.out.println("\n**************************************");


        String menu = """
               *** Escriba el numero de la opcion deseada ***
               1 - Consultar saldo
               2 - Retirar
               3 - Depositar
               9 - Salir
               """;

        Scanner teclado = new Scanner(System.in);
        while (option != 9){
            System.out.println(menu);
            option = teclado.nextInt();

            switch (option){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("saldo insuficiente");
                    }else{
                        saldo -= valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

}
