public class Main {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        String titulo = "Esse é o Screen Match";
        boolean incluidoNoPlano = true;
        double media = (9.8+6.3+8.0) / 3;
        double notaDoFilme = media;
        String nomeFilme = "Top Gun: Maverick";
        String sinopse = """ 
                Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, 
                Pete "Maverick" Mitchell está de volta, rompendo os limites como um piloto de testes corajoso. 
                No mundo contemporâneo das guerras tecnológicas, Maverick enfrenta 
                drones e prova que o fator humano ainda é essencial.
                Filme de ação com galã dos anos 80.
                """;
        String textoFilme = """
                #%s#
                
                Nome do Filme: %s
                
                Sinopse: %s
                Ano Lançamento: %d
                
                Nota do Filme: %.2f
                """.formatted(titulo, nomeFilme, sinopse,anoLancamento, notaDoFilme);
       /* System.out.println("Esse é o Screen Match");
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Nota do Filme: " + notaDoFilme);
        System.out.println("Sinopse: " + sinopse);*/
        System.out.println(textoFilme);


        int classificacao;
        classificacao = (int) (media/ 2);
        System.out.println(classificacao);
    }
}