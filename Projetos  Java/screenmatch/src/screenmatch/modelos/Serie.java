package screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epsodiosPorTemporada;
    private int minutosEp;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public int getMinutosEp() {
        return minutosEp;
    }

    public void setMinutosEp(int minutosEp) {
        this.minutosEp = minutosEp;
    }

    @Override // override é sobrescrita do método (a classe mãe titulo já tem esse método,e queremos reescrever para esta clase Serie)
    public int getDuracaoEmMinutos(){
        return temporadas * epsodiosPorTemporada * minutosEp;
    }
}
