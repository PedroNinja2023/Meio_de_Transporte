import java.util.ArrayList;
import java.util.List;

public class GerenciamentoTransporte {

    private List<MeioTransporte> meiosDeTransporte;

    public GerenciamentoTransporte() {
        this.meiosDeTransporte = new ArrayList<>();
    }

    public void adicionarMeioTransporte(MeioTransporte meioTransporte) {
        meiosDeTransporte.add(meioTransporte);
    }

    public void listarInformacoesTransportes() {
        for (MeioTransporte transporte : meiosDeTransporte) {
            System.out.println(transporte.informacoesTransporte());
        }
    }

    public void verificarDisponibilidadeBicicletas() {
        int bicicletasDisponiveis = 0;
        for (MeioTransporte transporte : meiosDeTransporte) {
            if (transporte instanceof BicicletaCompartilhada) {
                BicicletaCompartilhada bicicleta = (BicicletaCompartilhada) transporte;
                if (bicicleta.isDisponivel()) {
                    bicicletasDisponiveis++;
                }
            }
        }
        System.out.println("Total de bicicletas disponíveis: " + bicicletasDisponiveis);
    }
}
