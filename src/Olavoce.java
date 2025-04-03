import java.util.Scanner;
public class OlaMundo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Mundo!");
        Thread.sleep(2000);
        System.out.println("Ehhh... Desculpe te chamar de ... Mundo");
        Thread.sleep(2000);
        System.out.println("Acabei de Acordar");
        Thread.sleep(2000);
        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();
        System.out.println("A é um prazer lhe conhecer, então " + nome + " oque o traz aqui?");

    }
}