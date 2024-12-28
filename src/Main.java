import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escriba el limite de nuestra tarjeta: ");
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        Map<String, Double> listaCompras = new HashMap<>();


        int close;

        do {

            System.out.println("Escriba la descripción de la compra: ");
            String producto = scanner.next();

            System.out.println("Escriba el valor de la compra: ");
            double precioProducto = scanner.nextInt();

            if (saldo >= precioProducto){
                saldo -= precioProducto;
                listaCompras.put(producto, precioProducto);
            }else{
                System.out.println("Saldo insuficiente!");
                System.out.println("********************");
                System.out.println("COMPRAS REAlIZADAS");

                Map<String, Double> sortedByName = new TreeMap<>(listaCompras);

                sortedByName.forEach((item, precio)->{
                    System.out.println(item +  " - " + precio);
                });

                System.out.println("********************");
                System.out.println("Saldo de la tarjeta: "+ saldo);

                return;
            }


            System.out.println("Escriba 0 para salir o 1 para continuar");
            close = scanner.nextInt();

            if ( close == 0){
                System.out.println("********************");
                System.out.println("COMPRAS REAlIZADAS");


                Map<String, Double> sortedByName = new TreeMap<>(listaCompras);
                sortedByName.forEach((item, precio)->{
                    System.out.println(item +  " - " + precio);
                });



                System.out.println("********************");
                System.out.println("Saldo de la tarjeta: "+ saldo);

                return;
            }





        }while(close == 1);







    }
}
