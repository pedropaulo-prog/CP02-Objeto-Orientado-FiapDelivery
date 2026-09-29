package model;

/**
 * Representa uma rota de entrega, associando um pacote a um veículo.
 */
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public Pacote getPacote() {
        return this.pacote;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    /**
     * Realiza a entrega do pacote utilizando o veículo associado à rota.
     */
    public void realizarEntrega() {
        System.out.println(
            "Levando pacote " + pacote.getCodigo()
            + " no veículo " + veiculo.getPlaca()
        );
    }
}