import java.util.Scanner;


public class Lanche {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int item = 0;
        int qtnd = 0;

        item = lerItem(item);
        qtnd = lerQtnd(qtnd);

        double r = preco(item, qtnd);

        ImprimirComanda(r);


    }
    public static int lerItem(int item){
        item = LER.nextInt();
        return item;
    }
    public static int lerQtnd(int qtnd){
        qtnd = LER.nextInt();
        return qtnd;
    }
    
    public static double preco(int item, int qntd){
        double r = 0;
        
        switch(item){
            case 1:
                r = 4.00 * qntd;
            break;
            case 2:
                r = 4.50 * qntd;
            break;
            case 3:
                r = 5.00 * qntd;
            break;
            case 4:
                r = 2.00 * qntd;
            break;
            case 5:
                r = 1.50 * qntd;
        }
        return r;
    }
    public static void ImprimirComanda(double r){
        System.out.printf("Total: R$ %.2f \n", r);
    }
    
    
}
