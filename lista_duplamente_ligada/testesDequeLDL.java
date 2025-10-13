public class testesDequeLDL {
    public static void main(String[] args) {
        // Testes para inserção e remoção no início
        DequeLDL deque = new DequeLDL();
        for (int i = 10; i < 20; i++) {
            deque.inserirInicio(i);
        }
        System.out.println("Tamanho: " + deque.size());
        deque.verDeque();

        try {
            deque.removerInicio();
        } catch (DequeLDLExcecao e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Tamanho: " + deque.size());
        deque.verDeque();

        // Testes para inserção e remoção no final
        for (int i = 30; i < 40; i++) {
            deque.inserirFinal(i);
        }
        System.out.println("Tamanho após inserções no final: " + deque.size());
        deque.verDeque();

       try {
            deque.removerFinal();
        } catch (DequeLDLExcecao e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Tamanho: " + deque.size());
        deque.verDeque();

        // Testando métodos auxiliares
        try {
            System.out.println("Primeiro elemento: " + deque.primeiro());
        } catch (DequeLDLExcecao e) {
            System.out.println(e.getMessage());
        }
        try {
        System.out.println("Último elemento: " + deque.ultimo());
        } catch (DequeLDLExcecao e) {
            System.out.println(e.getMessage());
        }
        
    }
}
