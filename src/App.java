public class App {
    public static void main(String[] args)  {

     LinkedList lista = new LinkedList();

     lista.adicionar(new Pessoa());
     System.out.println(lista);
     lista.percorrerNumeroDeRodada();
    
     lista.adicionar(new Pessoa());
     System.out.println(lista);
     lista.percorrerNumeroDeRodada();
     lista.adicionar(new Pessoa());
     System.out.println(lista);
     lista.percorrerNumeroDeRodada();
     lista.adicionar(new Pessoa(10));
     System.out.println(lista);
     lista.percorrerNumeroDeRodada();
     lista.adicionar(new Pessoa());
     System.out.println(lista);
     lista.percorrerNumeroDeRodada();
  

     lista.removerComoFila();
     System.out.println(lista);
     lista.removerComoFila();
     System.out.println(lista);
     lista.removerComoFila();
     System.out.println(lista);
     lista.removerComoFila();
     System.out.println(lista);
     lista.adicionar(new Pessoa());
     System.out.println(lista);

     
     
    }
}
