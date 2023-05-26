public class Nodo {

    private Pessoa pessoa;
    private Nodo proximo;


    public Nodo(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.proximo = null;
    }

    public Nodo(Pessoa pessoa, Nodo proximo) {
        this.pessoa = pessoa;
        this.proximo = proximo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Nodo getProximo() {
        return proximo;
    }
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "\nNodo [pessoa=" + pessoa + ", proximo=" + proximo + "]";
    }

    

    
    
}
