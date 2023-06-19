import java.util.Scanner;

public class IdadeEmDias{

    final static Scanner LER = new Scanner(System.in);
    public static final int ANO = 365;
    public static final int MES = 30;
    public static void main(String[] args) {
        
        int idade = 0;
    
        idade = LerIDade(idade);

        caclAno(idade);



    }
    public static int LerIDade(int idade){
        
        idade = LER.nextInt();
        return idade;

    }public static void caclAno(int idade){
        
        int resto;
        int restoMES;

        int a = idade / ANO;

        System.out.println(a+" ano(s)");
        
        resto = idade % ANO;

        int m = resto / MES;
        System.out.println(m+ " mes(es)");

        restoMES = resto % MES;

        int d = restoMES;
        System.out.println(d+" dia(s)");
        
    
    }

}