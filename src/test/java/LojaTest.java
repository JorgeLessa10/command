import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void deveLocarJogo()
    {
        Loja loja = new Loja();
        Jogo jogo = new Jogo("FIFA 22");
        ITarefa locarJogo = new LocarJogo(jogo);
        assertEquals("Jogo indisponivel", loja.executarTarefa(locarJogo));
    }

    @Test
    void deveCancelarLocacaoJogo()
    {
        Loja loja = new Loja();
        Jogo jogo = new Jogo("FIFA 22");
        ITarefa locarJogo = new LocarJogo(jogo);
        assertEquals("Jogo disponivel", loja.cancelarTarefa(locarJogo));
    }

    @Test
    void deveDisponibilizarJogo()
    {
        Loja loja = new Loja();
        Jogo jogo = new Jogo("FIFA 22");
        ITarefa dispinibilizarJogo = new DisponibilizarJogo(jogo);
        assertEquals("Jogo disponivel", loja.executarTarefa(dispinibilizarJogo));
    }

    @Test
    void deveCancelarDisponibilizacaoJogo()
    {
        Loja loja = new Loja();
        Jogo jogo = new Jogo("FIFA 22");
        ITarefa dispinibilizarJogo = new DisponibilizarJogo(jogo);
        assertEquals("Jogo indisponivel", loja.cancelarTarefa(dispinibilizarJogo));
    }

}