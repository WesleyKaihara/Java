import java.util.*;


class Main {

    static void Calular( int Operacao, float Num1 , float Num2) {

        float Res = 0;
        if(Operacao == 1){
            Res = Num1+ Num2;
        }
        else if(Operacao == 2){
            Res = Num1 - Num2;
        }
        else if(Operacao == 3){
            Res = Num1 * Num2;
        }
        else if(Operacao == 4){
            Res = Num1 / Num2;
        }
        else{
            System.out.println("Erro - Digite uma operação válida");
            return;
        }
        System.out.println("Resultado : "+ Res);
    }

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("Escolha uma das operações abaixo: ");
        System.out.println(" 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
        System.out.println("-------------------------------------");

        int Operacao = Scanner.nextInt();

        System.out.println("Digite um valor:");
        float Num1 = Scanner.nextFloat();
        System.out.println("Digite outro valor: ");
        float Num2 = Scanner.nextFloat();

        Calular(Operacao,Num1,Num2);
    }
}