import java.util.Scanner;

public class Main {
    public static double media(double a, int b) {
        double media = a / b;
        return media;
    }
    public static void mostrarResutado(double media){
        if(media<5){
            System.out.println("El alumnen a suspes");
        }
        else{
            System.out.println("El alumne a aprovat");
        }
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvinguts al Calculador de Notes!");
        System.out.print("Quants estudiants hi ha classe? ");
        String[] assignaturas = { "Digitalització", "Computer Systems", "Llenguatges de Marques", "Programació",
                "Bases de Dades", "Entorns de Desenvolupament" };
        int numeroEstudiantes = sc.nextInt();
        int numeroNotas = 6;

        for (int i = 0; i < numeroEstudiantes; i++) {
            int numeroEstudiante = i + 1;
            System.out.println("Estudiant numero " + numeroEstudiante + ":");
            double sumaNotas = 0;

            for (int i2 = 0; i2 < numeroNotas; i2++) {
                System.out.print("Nota de " + assignaturas[i2] + ":");
                double nota = sc.nextDouble();
                sumaNotas = nota + sumaNotas;
               
            }
            System.out.println("Media del alumno: "+media(sumaNotas, numeroNotas)); 
            mostrarResutado(media(sumaNotas, numeroNotas));
        }
        sc.close();
    }
}
