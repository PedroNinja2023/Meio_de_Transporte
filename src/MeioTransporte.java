public class MeioTransporte {
    private String numeroIdentificacao;
    private int capacidadePassageiros;
    public MeioTransporte(String numeroIdentificacao, int capacidadePassageiros){
        this.numeroIdentificacao = numeroIdentificacao;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
    public String informacoesTransporte() {
        return "Número de Identificação: " + numeroIdentificacao + "\n Capacidade de Passageiros: " + capacidadePassageiros;
    }

}
