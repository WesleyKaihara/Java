import java.awt.*;
import java.util.Date;


//public = Visibilidade , pode ser acessado por outras classes
// class = criando classe
// Main = Nome da classe
//Todo o código deve estar dentro de uma classe

public class Inicio {
  //Metodo, Funções ou Procedimentos, onde é escrito o código
  // Deve ser Escrito com letra minuscula
  //void = vazio, não retorno valor
  //static = somente uma referencia para metodo main
  //String[] args = argumentos , no método main é obrigatorio

  public static void main(String[] args){

    //declarar função de entrada de dados
    // Scanner entrada = new Scanner(System.in);

    //Envia Mensagem para console
    //Recebe e armazema valor como double em uma variavel
    //Double recebe até 15 digitos - dobro do float

    // System.out.print("Digite um numero:\n");
    // double nota1 = entrada.nextDouble();

    // System.out.print("Digite outro numero: \n");
    // double nota2 = entrada.nextDouble();

    // double calculo = (nota1 + nota2);

    // System.out.print(calculo);

    //pegar valor da data atual
    //importar função

    Date relogio = new Date();

    //Apresenta propriedades do sistema
    System.getProperties();

    System.out.println("A hora do sistema é " + relogio.toString());

    System.out.println("Linguagem do Computador: " + System.getProperty("user.language"));

    //TipoDeDado  nome = Superclasse metodoEstatico
    //Kit de Ferramentas default do java
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.println("Resolução da Tela: " + d.width  + " x " + d.height);
  } 
}