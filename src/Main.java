import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int alunos;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantos alunos serão avaliados");
        alunos = s.nextInt();
        double notaA[] = new double[alunos];
        double notaB[] = new double[alunos];
        double mediaC[] = new double[alunos];

        for (int i=0; i<notaA.length; i++) {
            System.out.println("Digite a primeira nota");
            notaA[i] = s.nextDouble();
            notaA[i] = notaA[i] * 2;
            System.out.println("Digite a segunda nota");
            notaB[i] = s.nextDouble();
            notaB[i] = notaB[i] * 3;
            mediaC[i] = (notaA[i] + notaB[i]) / 5;
        }

        for (int i=0; i<notaA.length; i++) {
            System.out.println("Primeira nota: " +notaA[i]+  " Segunda nota: " +notaB[i]+ " Média: " +mediaC[i]);
        }
    }

}