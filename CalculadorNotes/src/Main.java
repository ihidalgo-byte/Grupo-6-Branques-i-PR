import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvinguts al Calculador de Notes!");

        System.out.print("Quants estudiants hi ha classe?");
        String[] assignaturas = {"Digitalització","Computer Systems","Llenguatges de Marques","Programació","Bases de Dades","Entorns de Desenvolupament"};
        int numeroEstudiantes = sc.nextInt();
        int numeroNotas = 6;
        double sumaNotas = 0;

        for (int i = 0; i < numeroEstudiantes; i++) {
            int numeroEstudiante = i+1;
            System.out.println("Estudiant numero " + numeroEstudiante + ":");

            for (int i2 = 0; i2 < numeroNotas; i2++) {
                System.out.print("Nota de " +assignaturas[i2]+ ":");
                double nota = sc.nextDouble();
                sumaNotas = nota + sumaNotas;
            }
        }
        sc.close();
    }
}
