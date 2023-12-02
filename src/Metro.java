public class Metro extends MeioTransporte {
    private String linha;

    public Metro(String numeroIdentificacao, int capacidadePassageiros, String linha) {
        super(numeroIdentificacao, capacidadePassageiros);
        this.linha = linha;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    @Override
    public String informacoesTransporte(){
        return super.informacoesTransporte() + ", Linha: " + linha;
    }
}


