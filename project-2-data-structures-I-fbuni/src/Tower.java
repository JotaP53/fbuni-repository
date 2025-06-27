class Tower {
    private Node top;

    public Tower() {
        this.top = null; // Inicialmente a torre está vazia
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public Node pop() {
        if (isEmpty()) {
            return null; // Retorna null se a pilha estiver vazia
        }
        Node poppedNode = top;
        top = top.next;
        return poppedNode;
    }

    public Node peek() {
        return top; // Retorna o nó do topo sem remover
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Método auxiliar para visualizar o conteúdo da torre (para testes)
    public void printTower(String name) {
        System.out.print("Torre " + name + ": ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}