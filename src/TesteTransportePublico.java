public class TesteTransportePublico {
    public static void main(String args[]){
       Onibus onibus = new Onibus("1237896",50,"66");
       Metro metro = new Metro("648953", 200, "EXPRESSO SÃO PAAULO - GUARULHOS");
       BicicletaCompartilhada bicicletaCompartilhata1 = new BicicletaCompartilhada("150", 1, true);
       BicicletaCompartilhada bicicletaCompartilhada2 = new BicicletaCompartilhada("240", 1, false);
       GerenciamentoTransporte gerenciamento = new GerenciamentoTransporte();
       gerenciamento.adicionarMeioTransporte(onibus);
       gerenciamento.adicionarMeioTransporte(metro);
       gerenciamento.adicionarMeioTransporte(bicicletaCompartilhata1);
       gerenciamento.adicionarMeioTransporte(bicicletaCompartilhada2);
       gerenciamento.listarInformacoesTransportes();
       gerenciamento.verificarDisponibilidadeBicicletas();
       bicicletaCompartilhata1.realizarManutencao();
       bicicletaCompartilhada2.realizarManutencao(true);
       gerenciamento.verificarDisponibilidadeBicicletas();
    }
}
