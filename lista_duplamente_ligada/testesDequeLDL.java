public class testesDequeLDL {
    public static void main(String[] args) {
        // Testes para inserção e remoção no início
        DequeLDL deque = new DequeLDL();
        for (int i = 10; i < 20; i++) {
            deque.inserirInicio(i);
        }
        System.out.println("Tamanho: " + deque.size());
        deque.verDeque();

        deque.removerInicio();
        System.out.println("Tamanho: " + deque.size());
        deque.verDeque();

        // Testes para inserção e remoção no final
        for (int i = 30; i < 40; i++) {
            deque.inserirFinal(i);
        }
        System.out.println("Tamanho após inserções no final: " + deque.size());
        deque.verDeque();

        deque.removerFinal();
        System.out.println("\nApós remover do final:");
        System.out.println("Tamanho: " + deque.size());
        deque.verDeque();

        // Testando métodos auxiliares
        System.out.println("Primeiro elemento: " + deque.primeiro());
        System.out.println("Último elemento: " + deque.ultimo());

        
    }
}
