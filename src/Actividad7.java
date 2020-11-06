import java.util.*;
public class Actividad7 {
    public static void main(String[] args) {
        //Instanciamos la variable sc para poder pedir datos por pantalla.
        Scanner sc = new Scanner(System.in);
        //Declaramos las variables controlInt y controlAcc para poder tener el control de acceso. Declaramos la variable pass para la contraseña.
        int pass;
        boolean controlAcc = false;
        int controlInt = 3;
        //Pedimos la contraseña
        System.out.print("Please inseret the password ");
        pass =sc.nextInt();
        //Utilizamos do/while para poder hacer una primera comprobación de la contraseña
        do {
            if (pass==1234){
                System.out.println("Allowed access!!");
                controlAcc=true;
            }else {
                System.out.print("Incorrect password. Please insert the password ");
                pass = sc.nextInt();
                System.out.println("You have "+controlInt+" attempts left");
                controlInt--;
            }
        }while (!controlAcc && controlInt>=0);
    }
}

