/*
 ** created by: jorge.lessa
 */
public class Jogo {

    private String nome;

    public Jogo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String locarJogo()
    {
        return "Jogo indisponivel";
    }


    public String disponibilizarJogo()
    {
        return "Jogo disponivel";
    }
}
