package model;

/**
 * Representa um pacote que será transportado em uma entrega.
 */
public class Pacote {

    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        this.setCodigo(codigo);
        this.setPeso(peso);
        this.setStatus(status);
    }

    public String getCodigo() {
        return this.codigo;
    }

    private void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Erro: O código do pacote é inválido.");
        }
    }

    public double getPeso() {
        return this.peso;
    }

    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro: O peso do pacote deve ser maior que zero.");
        }
    }

    public String getStatus() {
        return this.status;
    }

    /**
     * Atualiza o status do pacote após uma mudança na entrega.
     */
    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        } else {
            System.out.println("Erro: O status informado é inválido.");
        }
    }
}