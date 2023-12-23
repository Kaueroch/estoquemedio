import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Qual a quantidade maxima de peça?");
    int max = scan.nextInt();
    System.out.println("Qual a quantidade minima de peça?");
    int min = scan.nextInt();
    Calcular();

    }
    public static void Calcular(){
        int max= 0 , min = 0 ;
        int media = (max + min)/2;
        System.out.println(media);
    }
}