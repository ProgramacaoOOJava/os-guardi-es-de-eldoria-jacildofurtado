package desafio;

public class Mago extends Personagem {
    double inteligencia;

    // Construtor para inicializar os atributos do mago
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double inteligencia) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + super.nome + " usou Bola de Fogo!");
    }
}
