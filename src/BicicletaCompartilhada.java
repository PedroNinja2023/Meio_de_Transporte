public class BicicletaCompartilhada extends MeioTransporte{
    private boolean disponivel;
    public BicicletaCompartilhada(String numeroIdentificacao, int capacidadePassageiros, boolean disponivel){
        super(numeroIdentificacao, capacidadePassageiros);
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    @Override
    public String informacoesTransporte(){
        return super.informacoesTransporte() + ", Disponibilidade: " + disponivel;
    }
    public void realizarManutencao(){
        System.out.println("A bicicleta está passadno por amanuntecao.");
        this.disponivel = disponivel;
    }
    public void realizarManutencao(boolean agendada){
        if(agendada){
            System.out.println("A manutenção da bicicleta foi agendada.");
        }
        else {
            System.out.println("A manutenção da bicicleta está sendo realizada sem agendamento prévio.");
        }
        this.disponivel = false;
    }

}
