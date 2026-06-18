package desafio;

import java.util.ArrayList; // Importando a classe ArrayList para usar listas dinâmicas
import java.util.List; // Importando a interface List para usar listas

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Guerreiro e Mago
        Guerreiro arthur = new Guerreiro("Arthur", 5, 150, 12.0, 8.0);
        Mago morgana = new Mago("Morgana", 7, 100, 15.0, 10.0);

        // Exibindo o status dos personagens
        arthur.exibirStatus();
        morgana.exibirStatus();

        // Usando as habilidades especiais dos personagens
        arthur.usarHabilidadeEspecial();
        morgana.usarHabilidadeEspecial();

        System.out.println("\n--- Demostração de Polimorfismo ---\n");
        List<Personagem> herois = new ArrayList<>();
        herois.add(arthur);
        herois.add(morgana);
        herois.add(new Guerreiro("Lancelot", 6, 140, 11.0, 9.0));
        herois.add(new Mago("Merlin", 8, 90, 18.0, 12.0));

        // Exibindo o status e usando as habilidades especiais de cada personagem na lista
        for (Personagem p : herois) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println("-----------------------------");
        }
    }
}
