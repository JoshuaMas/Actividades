import java.util.*;
public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int num;
        int cuadrado=0;
        int cubo=0;
        System.out.println("Porfavor introduce el primer valor entero");
        num=sc.nextInt();
        for (int i=0;i<nums.length;i++){
            nums[i]=num;
            cuadrado=nums[i]*nums[i];
            cubo=nums[i]*nums[i]*nums[i];
            System.out.println("Por favor introduce otro valor");
            num=sc.nextInt();
        }
        System.out.println("Los numeros son:");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"\n"+cuadrado+"\n"+cubo);
        }
        System.out.println("Adios");
    }
}
