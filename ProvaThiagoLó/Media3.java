import java.util.Scanner;

public class Media3 {

    final static Scanner LER = new Scanner(System.in);
    
    public static final int peso1 = 2;
    public static final int peso2 = 3;
    public static final int peso3 = 4;
    public static final int peso4 = 1;

    public static void main(String[] args) {
        
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;

        n1 = Ler();
        n2 = ler();
        n3 = ler();
        n4 = ler();
        n5 = ler();

        double media = calcularMedia(n1, n2, n3, n4);
        
        String r = VerificarMedia(media);
        String rx = VerificarExame(n5, media);

        ImprimirMediaFinal(media, r, media, rx);

    }
    public static double calcularMedia(double n1, double n2, double n3, double n4){
       double media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3) + (n4 * peso4) /10) ;

       return media;

    }
    public static String VerificarMedia(double media){
        String r = null;

        if(media >= 7.0){
           r = "Aluno Aprovado\n";
        }else if(media < 5.0){
            r = "Aluno Reprovado\n";
        }else if(media > 5.0 || media <= 6.9){
            r = "Aluno em exame\n";
        }
        return r;
    }
    public static String VerificarExame(double n5, double media){
        
        double notaexame = (media + n5) /2;

        String rx = null;

        if(notaexame >= 5.0){
            rx = "Aluno Aprovado\n";
        }else{
            rx = "Aluno Reprovado\n";
        }
        return rx;
    }
    public static void ImprimirMediaFinal(double media, String r, double notaexame, String rx){
        System.out.printf("Media: %.1f\n", media);
        System.out.println(r);
        System.out.printf("Nota do exame: %.1f\n", notaexame);
        System.out.println(rx);
        System.out.printf("Media Final: \n");
    }
    
}
