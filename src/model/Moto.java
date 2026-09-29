package model;

/**
 * Representa uma moto utilizada nas entregas.
 * Herda os dados comuns da classe Veiculo.
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
}