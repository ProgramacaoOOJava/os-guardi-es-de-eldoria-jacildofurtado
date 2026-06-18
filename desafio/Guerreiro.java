package desafio;

public class Guerreiro extends Personagem {
    double forca;

    // Construtor para inicializar os atributos do guerreiro
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, double forca) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + super.nome + " usou Espada de Fogo!" );
    }
}
