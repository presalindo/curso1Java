public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        String titulo = "Esse é o Screen Match";
        boolean incluidoNoPlano = true;
        double media = (9.8+6.3+8.0) / 3;
        double notaDoFilme = media;
        String nomeFilme = "Top Gun: Maverick";
        String tipoPlano = "normal";
        if(anoLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que devemos assistir!");
        }
        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve realizar locação");
        }

    }
}