package model;

/**
 * Representa uma moto utilizada nas entregas.
 * Herda os dados comuns aos diferentes tipos de veículos.
 */
public class Moto extends Veiculo {

    private boolean bau;

    public Moto(String placa, double capacidade, boolean bau) {
        super(placa, capacidade);
        this.setBau(bau);
    }

    public boolean isBau() {
        return this.bau;
    }

    private void setBau(boolean bau) {
        this.bau = bau;
    }

    @Override
    public String getTipoVeiculo() {
        return "moto";
    }

    @Override
    public String getMensagemVeiculoInvalido() {
        return "Erro: A moto " + this.getPlaca()
                + " possui dados inválidos. Entrega nao realizada.";
    }
}