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
     * A entrega só acontece quando o pacote e o veículo são válidos.
     */
    public boolean realizarEntrega() {

        if (!veiculo.isValido()) {
            System.out.println(veiculo.getMensagemVeiculoInvalido());
            return false;
        }

        if (!pacote.isValido()) {
            System.out.println(
                    "Erro: O pacote " + pacote.getCodigo()
                            + " possui dados inválidos. Entrega nao realizada.");
            return false;
        }

        System.out.println(
                "Levando pacote " + pacote.getCodigo()
                        + " no " + veiculo.getTipoVeiculo()
                        + " " + veiculo.getPlaca());

        System.out.println(
                "Entrega realizada com sucesso pelo "
                        + veiculo.getTipoVeiculo()
                        + " " + veiculo.getPlaca() + ".");

        return true;
    }
}