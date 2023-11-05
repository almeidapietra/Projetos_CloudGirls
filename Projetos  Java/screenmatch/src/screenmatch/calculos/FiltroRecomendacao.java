package screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos no momento");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado no momento");
        } else{
            System.out.println("Adicione à sua lista para assistir depois");
        }
    }
}
