package model;

/**
 * Representa um veículo utilizado nas entregas.
 * Contém os dados comuns aos diferentes tipos de veículos.
 */
public class Veiculo {

    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
    }

    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Erro: A placa informada é inválida.");
        }
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    private void setCapacidade(double capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Erro: A capacidade informada é inválida.");
        }
    }
}