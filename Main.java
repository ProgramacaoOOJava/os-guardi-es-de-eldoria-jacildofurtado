public class Main {
    public static void main(String[] args) {
        // Instanciação de personagens
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Luna", "Mago", 1, 80, 12.0);

        // Chamada do método para exibir o status dos personagens
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
