import java.util.Scanner;
<<<<<<< HEAD
=======

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
>>>>>>> feature-nova
public class Olavoce {
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
        Thread.sleep(2000);
        System.out.println("A é um prazer lhe conhecer, então " + nome + " oque o traz aqui?");
        String oquefaz = scanner.nextLine();
        System.out.println("Humm... entendo");
        Thread.sleep(2000);
        System.out.println("Mas como vai a vida?");
        String vida = scanner.nextLine();
        Thread.sleep(2000);
        System.out.println("É, eu também vai " + vida + ", mas isso não importa");
        Thread.sleep(2000);
        System.out.println("Mas isso não importa, boa sorte em (" + oquefaz + ")");
    }
}