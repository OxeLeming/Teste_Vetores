public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro");
        Aluno a2 = new Aluno("Thiago");
        Aluno a3 = new Aluno("Maria"); //Aluna não adicionada na lista

        Vetor lista = new Vetor();

        //teste tamanho e adiciona
        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        //imprime lista
        System.out.println(lista);

        //Teste método contem
        System.out.println(lista.contem(a1));
        System.out.println(lista.contem(a3)); //Testar aluna não adicionada

        //Teste posição
        Aluno x = lista.pega(1);
        System.out.println(x);
        lista.adiciona(1, a3);
        System.out.println(lista);

        //Testando o remove (Irá remover Maria, que foi adicionada na posição 1 no código acima)
        lista.remove(1);
        System.out.println(lista);

    }
}