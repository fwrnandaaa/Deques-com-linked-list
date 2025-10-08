
public class testesDequeLL{
    public static void main(String[] args){
    //Testes para inserção e remoção do inicio
       DequeLL deque = new DequeLL();
       for(int i = 10; i<20; i++){
        deque.inserirInicio(i);
       }
       System.out.println("Tamanho: " + deque.size());
       deque.verDeque();
       deque.removerInicio();
       System.out.println("Tamanho: " + deque.size());
       deque.verDeque();
       
       //Testes para inserção e remoção do final
        for(int i = 30; i<50; i++){
            deque.inserirFinal(i);
        }
        System.out.println("Tamanho: " + deque.size());
        deque.removerFinal();
        System.out.println("Tamanho: " + deque.size());

        //Testando métodos auxiliares
        System.out.println("Primeiro elemento: "+deque.primeiro());
        System.out.println("Ultimo elemento: "+deque.ultimo());
    }
}