/*
 ** created by: jorge.lessa
 */
public class LocarJogo implements ITarefa{

    private Jogo jogo;

    public LocarJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    @Override
    public String executar() {
        return jogo.locarJogo();
    }

    @Override
    public String cancelar() {
        return jogo.disponibilizarJogo();
    }
}
