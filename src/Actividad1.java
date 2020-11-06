public class Actividad1 {
    public static void main(String[] args) {
        //Declaramos la variable numero para poder hacer los multiplos de 5.
        int numero = 5;
        //Declaramos el bucle for para poder mostrar los multiplos de 5, del 0 al 100.
        for (int i = 0; i<=100; i++) {
            int multiplo = numero * i;
            System.out.println(multiplo);
        }
    }
}
