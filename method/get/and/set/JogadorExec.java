package method.get.and.set;

import java.util.Scanner;

public class JogadorExec {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("-- Cadatro de jogador na base de dados --");
        System.out.print("Digite o nome do jogador: ");
        String nomejogador = entrada.nextLine();   
        System.out.print("Digite a idade do jogador: ");
        int idadejogador = entrada.nextInt();
        System.out.print("Digite a altura do jogador (em metros): ");
        float alturajogador = entrada.nextFloat();
        
        j1.setnome(nomejogador);
        j1.setidade(idadejogador);
        j1.setaltura(alturajogador);
        
        System.out.println("-- O jogador foi cadastro! --");
        System.out.printf("Nome: %s\n", j1.getnome());
        System.out.printf("Idade: %d anos\n", j1.getidade());
        System.out.printf("Altura: %.2fm\n", j1.getaltura());
    }
}
