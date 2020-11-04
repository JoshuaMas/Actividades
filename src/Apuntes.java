import java.util.*;
public class Apuntes {
    public static void main(String[] args) {
        // Formas de incrementar y decrementar una variable en 1.
        int x =1;
        x++;
        ++x;
        x=x+1;
        x+=1;//Sumamos y asignamos el valor a la variable.
        System.out.println(x);

        int y = 1;
        y--;
        --y;
        y=y-1;
        y-=1;//Restamos y asignamos a la variable.
        System.out.println(y);

        //Tomar datos por teclado.
            //Usamos varables para almacenar los datos.
        int datos;
            //Declaramos la instancia de Scanner.
        Scanner sc = new Scanner(System.in);

            //Pedimos los datos por pantalla.
        System.out.print("Por favor introduce un nuemro: ");
            //Declaramos que datos tendra un valor igual al introducido por teclado.
        datos= sc.nextInt();
            //Cerramos la posibilidad de introducir datos.
        sc.close();
            //Mostramos el resultado.
        System.out.println("Tu numero es: "+datos);

        //Array
            //Declararemos una variable constante
        final int ARRAY_SIZE =10;
            //Declararamos una matriz a 0 con un numero de elementos igual a ARRAY_SIZE
        double[] miArray =new double[ARRAY_SIZE];//Revisar
            //Hacemos referencia al cuarto elemento de la matriz
        System.out.println("Valor de la cuarta posición "+miArray[3]);
            //Asignamos el valor 1.667 al noveno elemento del array
        miArray[8] = 1.667;
            //Asignamos el valor 3.333 al tercer elemento del array
        miArray[2] = 3.333;
    }


}
