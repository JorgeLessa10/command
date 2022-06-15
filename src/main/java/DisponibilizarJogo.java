/*
 ** created by: jorge.lessa
 */
public class DisponibilizarJogo implements ITarefa{

    private Jogo jogo;

    public DisponibilizarJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    @Override
    public String executar() {
        return jogo.disponibilizarJogo();
    }

    @Override
    public String cancelar() {
        return jogo.locarJogo();
    }
}
