import java.util.Scanner;
public class Account_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        float newbalance=0;
        double balance;
        int num1=0, op;



        Account_logic dueño = new Account_logic(

                "Carlos",
                456215878,
                15.02,
                "Ahorrar dinero",
                2000.00);
        do{
            System.out.println("Que desea hacer en su cuenta?\n");

            System.out.println("[1] Saldo");
            System.out.println("[2] Retirar");
            System.out.println("[3] Depositar");
            System.out.println("0) Salir");
            System.out.println("");
            op=sc.nextInt();


            //Metodos if para la operacion

            //poner el else ayuda a que no se repita el programa infinitamente


            if (op == 1) {
                System.out.println("Su saldo es: " + dueño.getBalance());


            }else
            if (op == 2) {
                System.out.println("Usted hara un retiro");

                System.out.println("Ingrese la cantidad");
                num1 = sc.nextInt();

                newbalance = (float) dueño.getBalance() - num1;
                dueño.setBalance(newbalance);

            }else

            if (op == 3) {
                System.out.println("Usted hara un deposito\n");

                System.out.println("Ingrese la cantidad");
                num1 = sc.nextInt();

                newbalance = (float) dueño.getBalance() + num1;
                dueño.setBalance(newbalance);

            }else {System.out.println("Adios");}
        }while(op>=1 && op<=3);

        System.out.println("\n");
        dueño.toString();

    }
}
