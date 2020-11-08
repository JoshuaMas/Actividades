import  java.util.*;
public class Actividad10 {
    public static void main(String[] args) {

        // Programa que calcule la media de números introducidos por el usuario. No habrá más números en el Array cuando se introduzca un negativo
        int valor;
        int ultimo =0;

        ArrayList<Integer> numeros = new ArrayList<>();
        //Inicializamos el scaner fuera y pedimos el primer valor
        Scanner input_user = new Scanner(System.in);
        valor = input_user.nextInt();

        //Luego declaramos un while para pedir valores hasta canzarnos
        while(valor > 0){
            numeros.add(valor);
            valor=input_user.nextInt();
        }

        //Hacemos las operaciones necesarias para sacar la media
        for (var i:numeros){
            ultimo +=i;
        }
        int media = ultimo/numeros.size();
        System.out.println(media);
    }
}
