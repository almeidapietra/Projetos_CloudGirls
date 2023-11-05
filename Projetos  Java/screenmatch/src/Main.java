import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Epsodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filmeDoOtelo = new Filme();
        filmeDoOtelo.setNome("Otelo e os 3 mosqueteiros");
        filmeDoOtelo.setAnoDeLancamento(2021);
        filmeDoOtelo.setIncluidoNoPlano(true);
        filmeDoOtelo.setDuracaoEmMinutos(180);

        filmeDoOtelo.exibeFichaTecnica();
        filmeDoOtelo.avalia(8);
        filmeDoOtelo.avalia(9);
        filmeDoOtelo.avalia(10);
        System.out.println("Total de avaliações: " + filmeDoOtelo.getTotalDeAvaliacoes());
        System.out.println(filmeDoOtelo.pegaMedia());

        Filme filmeDoGui = new Filme();
        filmeDoGui.setNome("Senhorzinho em hibernação");
        filmeDoGui.setAnoDeLancamento(2022);
        filmeDoGui.setIncluidoNoPlano(true);
        filmeDoGui.setDuracaoEmMinutos(90);

        Serie serieDaPeppa = new Serie();
        serieDaPeppa.setNome("Peppa pig e os 7 anões");
        serieDaPeppa.setAnoDeLancamento(2018);
        serieDaPeppa.exibeFichaTecnica();
        serieDaPeppa.setTemporadas(8);
        serieDaPeppa.setEpsodiosPorTemporada(10);
        serieDaPeppa.setMinutosEp(50);
        System.out.println("Tempo para maratonar Peppa Pig e os 7 anões: " + serieDaPeppa.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeDoOtelo);
        calculadora.inclui(filmeDoGui);
        calculadora.inclui(serieDaPeppa);
        System.out.println("Tempo para maratonar todos os títulos selecionados: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmeDoOtelo);

        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setSerie(serieDaPeppa);
        epsodio.setTotalVisualizacoes(300);
        filtro.filtra(epsodio);
    }
}