public class FilaAmarela {


    private Pessoa[] pessoa;
    private int primeiro;
    private int ultimo;
    private int total;

    


    public FilaAmarela() {
        pessoa = new Pessoa[50];
        this.primeiro = 0;
        this.ultimo = 0;
        this.total = 0;
    }

    public void inserir(Pessoa pessoa) {
        this.pessoa[ultimo] = pessoa;
        ultimo = (ultimo + 1) % this.pessoa.length;
        total++;
    }

    public void retirar() {
    this.pessoa[primeiro] = null;
    primeiro = (primeiro + 1) % this.pessoa.length;
    total--;

    }

    public boolean estaVazia() {
        if (total == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean estaCheia() {
        if(total == 50) {
            return true;
        }
        else {
            return false;
        }
    }
}
