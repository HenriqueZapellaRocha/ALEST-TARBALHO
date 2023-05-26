public class Pessoa{

int rodada;
int numeroSorteado;
boolean ouvidoria;

public Pessoa() {
    this.rodada = 0;
    this.ouvidoria = false;
}



public Pessoa(int rodada) {
    this.rodada = rodada;
}



public int getRodada() {
    return rodada;
}

public int getNumeroSorteado() {
    return numeroSorteado;
}

public boolean isOuvidoria() {
    return ouvidoria;
}

    
    
}