import  java.util.*;
public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String algo;
        int contador =1;
        System.out.print("Introduce una palabra");
        algo = sc.next();
        while (contador<algo.length()){
            contador++;
        }
        System.out.println("El total de digitos es "+contador);
    }
}
