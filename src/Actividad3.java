public class Actividad3 {
    public static void main(String[] args) {
        //Declaramos la variable i para tener un contador. Declaramos la variable numero con el numero a se multiplicar.
        int i = 0;
        int numero =5;
        //Declaramos el bucle do/while para calcular y mostrar los multiplos de 5.

        do {
            int multiplo = numero*i;
            System.out.println(multiplo);
            i++;
        }while (i<=100);
    }
}
