import model.Caminhao;
import model.Moto;
import model.Pacote;
import model.Rota;

public class Principal {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 6);

        Moto moto = new Moto("XYZ5678", 100.0, true);

        Pacote pacote = new Pacote("PKT001", 20.0, "Em preparação");

        Rota rotaCaminhao = new Rota(pacote, caminhao);
        rotaCaminhao.realizarEntrega();

        Rota rotaMoto = new Rota(pacote, moto);
        rotaMoto.realizarEntrega();

        pacote.setStatus("Em transporte");

        System.out.println("Status do pacote: " + pacote.getStatus());
    }
}