import model.Caminhao;
import model.Moto;
import model.Pacote;
import model.Rota;

public class Principal {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 6);
        Pacote pacoteCaminhao = new Pacote(
                "PKT001",
                20.0,
                "Em preparaçao");

        Rota rotaCaminhao = new Rota(pacoteCaminhao, caminhao);

        if (rotaCaminhao.realizarEntrega()) {
            pacoteCaminhao.setStatus("Entregue");
        }

        Moto moto = new Moto("XYZ5678", 100.0, true);
        Pacote pacoteMoto = new Pacote(
                "PKT002",
                10.0,
                "Em preparaçao");

        Rota rotaMoto = new Rota(pacoteMoto, moto);

        if (rotaMoto.realizarEntrega()) {
            pacoteMoto.setStatus("Entregue");
        }

        System.out.println(
                "Status do pacote " + pacoteCaminhao.getCodigo()
                        + ": " + pacoteCaminhao.getStatus());

        System.out.println(
                "Status do pacote " + pacoteMoto.getCodigo()
                        + ": " + pacoteMoto.getStatus());
    }
}