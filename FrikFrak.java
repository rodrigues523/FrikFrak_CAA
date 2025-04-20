import java.util.Scanner;

public class FrikFrak {
    private static char[][] tab = new char[3][3];

    // Criar o tabuleiro
    public static void criar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = ' ';
            }
        }
    }

    // Colocar a peça no tabuleiro
    public static void jogar(char peca, int linha, int coluna) {
        tab[linha][coluna] = peca;
    }

    // Mostrar o tabuleiro
    public static void mostrar() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.err.println("+---+---+---+");
        System.out.println("| " + tab[0][0] + " | " + tab[0][1] + " | " + tab[0][2] + " |");
        System.err.println("+---+---+---+");
        System.out.println("| " + tab[1][0] + " | " + tab[1][1] + " | " + tab[1][2] + " |");
        System.err.println("+---+---+---+");
        System.out.println("| " + tab[2][0] + " | " + tab[2][1] + " | " + tab[2][2] + " |");
        System.err.println("+---+---+---+");
    }

    // Verificar se há vitória
    public static boolean verificarVitoria(char peca) {
        // Verificar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tab[i][0] == peca && tab[i][1] == peca && tab[i][2] == peca) return true;
            if (tab[0][i] == peca && tab[1][i] == peca && tab[2][i] == peca) return true;
        }
        // Verificar diagonais
        if (tab[0][0] == peca && tab[1][1] == peca && tab[2][2] == peca) return true;
        if (tab[0][2] == peca && tab[1][1] == peca && tab[2][0] == peca) return true;
        return false;
    }

    // Verificar se há empate
    public static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab[i][j] == ' ') {
                    return false;  // Tem espaço vazio, não é empate
                }
            }
        }
        return true;  // Não tem mais espaços vazios, é empate
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        criar();

        char jogadorAtual = 'x';  // Começar com o jogador 1
        boolean jogoEmAndamento = true;

        while (jogoEmAndamento) {
            mostrar();
            
            System.out.println("Jogador " + (jogadorAtual == 'x' ? "1 (X)" : "2 (O)") + ", sua vez!");
            System.out.print("Linha (0-2): ");
            int linha = ler.nextInt();
            System.out.print("Coluna (0-2): ");
            int coluna = ler.nextInt();

            // Verificar se a posição já está ocupada
            if (tab[linha][coluna] != ' ') {
                System.out.println("Essa posição já está ocupada! Tente novamente.");
                continue;  // Se a posição já foi ocupada, o jogador tenta novamente
            }

            // Fazer a jogada
            jogar(jogadorAtual, linha, coluna);

            // Verificar vitória
            if (verificarVitoria(jogadorAtual)) {
                mostrar();
                System.out.println("Jogador " + (jogadorAtual == 'x' ? "1 (X)" : "2 (O)") + " venceu!");
                jogoEmAndamento = false;  // Fim do jogo
            } else if (verificarEmpate()) {
                mostrar();
                System.out.println("Empate! O jogo terminou.");
                jogoEmAndamento = false;  // Fim do jogo
            } else {
                // Alternar o jogador
                jogadorAtual = (jogadorAtual == 'x') ? 'o' : 'x';
            }
        }

        ler.close();
    }
}
