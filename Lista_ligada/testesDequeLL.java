
public class testesDequeLL{
    public static void main(String[] args){
    //Testes para inserção e remoção do inicio
       DequeLL deque = new DequeLL();
       for(int i = 10; i<20; i++){
        deque.inserirInicio(i);
       }
       System.out.println("Tamanho: " + deque.size());
       deque.verDeque();
      try {
        deque.removerInicio();
        } 
        catch (DequeExcecao e) {
            System.out.println("Erro: " + e.getMessage());
            }
       System.out.println("Tamanho: " + deque.size());
       deque.verDeque();
       
       //Testes para inserção e remoção do final
        for(int i = 30; i<50; i++){
            deque.inserirFinal(i);
        }
        System.out.println("Tamanho: " + deque.size());
        try {
            deque.removerFinal();
            } catch (DequeExcecao e) {
                System.out.println("Erro: " + e.getMessage());
                }
        System.out.println("Tamanho: " + deque.size());
    
        //Testando métodos auxiliares
        try {
            System.out.println("Primeiro elemento: " + deque.primeiro());
            } catch (DequeExcecao e) {
                System.out.println("Erro: " + e.getMessage());
            }
        try {
            System.out.println("Último elemento: " + deque.ultimo());
            } catch (DequeExcecao e) {
                System.out.println("Erro: " + e.getMessage());  
            }
    }
}