

public class LinkedList {

    private Nodo inicio;
    private Nodo ultimo;
    private int tamanho;



    public void adicionar(Pessoa pessoa) {
        Nodo nodo = new Nodo(pessoa);
        if(this.tamanho == 0) {
            this.inicio = nodo;
        }
        else {
            this.ultimo.setProximo(nodo);
        }
        this.ultimo = nodo;
        this.tamanho++;
    }

    


    public Nodo getInicio() {
        return inicio;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void percorrerNumeroDeRodada(){
        Nodo atual = this.inicio;
        while(atual.getProximo() != null) {
            atual = atual.getProximo();
            if(atual.getPessoa().getRodada() == 10) {
                System.out.println("ACHEI");
            }

        }
        
    }

    public void removerComoFila() {
        Nodo primeiro = this.inicio;
        inicio = primeiro.getProximo();

    }

    @Override
    public String toString() {
        return "LinkedList [inicio=" + inicio + "]\n";
    }

    
    
}
