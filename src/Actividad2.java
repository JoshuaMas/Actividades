public class Actividad2 {
    public static void main(String[] args) {
        //Declaramos la variable i para tener un contador. Declaramos la variable numero con el numero a se multiplicar.
        int i = 0;
        int numero =5;
        //Declaramos el bucle while para calcular y mostrar los multiplos de 5.
        while (i<=100){
            int multiplo = numero*i;
            System.out.println(multiplo);
            i++;
        }
    }
}
