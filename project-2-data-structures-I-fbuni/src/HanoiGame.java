public class HanoiGame {
    private Tower towerA;
    private Tower towerB;
    private Tower towerC;
    private int numberOfDisks;

    public HanoiGame(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
        this.towerA = new Tower();
        this.towerB = new Tower();
        this.towerC = new Tower();
        initializeGame();
    }

    private void initializeGame() {
        // Inicializa a Torre A com o número de discos escolhido,
        // em ordem decrescente de tamanho (o maior na base)
        for (int i = numberOfDisks; i >= 1; i--) {
            towerA.push(i);
        }
    }

    public void moveDisk(char source, char destination) {
        Tower sourceTower = getTower(source);
        Tower destinationTower = getTower(destination);

        if (sourceTower == null || destinationTower == null) {
            System.out.println("Torre inválida.");
            return;
        }

        Node diskToMove = sourceTower.peek();

        if (sourceTower.isEmpty()) {
            System.out.println("Não há discos na Torre " + source + " para mover.");
            return;
        }

        if (!destinationTower.isEmpty() && diskToMove.getData() > destinationTower.peek().getData()) {
            System.out.println("Movimento inválido: Não se pode colocar um disco maior sobre um menor.");
            return;
        }

        // Realiza o movimento
        Node movedDisk = sourceTower.pop();
        destinationTower.push(movedDisk.getData());
        System.out.println("Movendo disco " + movedDisk.getData() + " da Torre " + source + " para a Torre " + destination + ".");
    }

    private Tower getTower(char towerName) {
        switch (towerName) {
            case 'A':
                return towerA;
            case 'B':
                return towerB;
            case 'C':
                return towerC;
            default:
                return null;
        }
    }

    public void printGameState() {
        towerA.printTower("A");
        towerB.printTower("B");
        towerC.printTower("C");
    }

    public boolean isGameWon() {
        // O jogo é ganho quando todos os discos estão na Torre C
        return towerC.getSize() == numberOfDisks;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Bem-vindo ao Jogo da Torre de Hanói!");
        System.out.print("Digite o número de discos (3 a 5): ");
        int numDisks = scanner.nextInt();

        if (numDisks < 3 || numDisks > 5) {
            System.out.println("Número de discos inválido. Usando 3 discos.");
            numDisks = 3;
        }

        HanoiGame game = new HanoiGame(numDisks);
        game.printGameState();

        while (!game.isGameWon()) {
            System.out.print("Digite a torre de origem (A, B ou C) e a torre de destino (A, B ou C), separadas por espaço (ex: A B): ");
            String move = scanner.next().toUpperCase();

            if (move.length() < 2) {
                System.out.println("Entrada inválida. Por favor, digite duas letras (origem e destino).");
                continue; // Volta para o início do loop para pedir a entrada novamente
            }

            char source = move.charAt(0);
            char destination = move.charAt(1);
            game.moveDisk(source, destination);
            game.printGameState();
        }

        System.out.println("Parabéns! Você resolveu a Torre de Hanói!");
        scanner.close();
    }
}