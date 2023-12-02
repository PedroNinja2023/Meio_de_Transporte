public class Onibus extends MeioTransporte {
    private String rota;
    public Onibus(String numeroIdentificacao, int capacidadePassageiros, String rota){
        super(numeroIdentificacao, capacidadePassageiros);
        this.rota = rota;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
    @Override
    public String informacoesTransporte() {
        return super.informacoesTransporte() + ", Rota: " + rota;
    }

}
