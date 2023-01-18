import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] noms = new String[10];

        System.out.print("Quina posició vols sel·leccionar? ");
        int posicio = scanner.nextInt();

        for (int i = posicio; i < 10; i++){
            String nom = scanner.next();
            noms[i] = nom;
        }
    }
}
