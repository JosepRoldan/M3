import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] noms = new String[10];
        for (int i = 0; i < noms.length; i++){
            String nom = scanner.next();
            noms[i] = nom;
        }
        int x = scanner.nextInt();
        System.out.println(noms[x]);
    }
}
