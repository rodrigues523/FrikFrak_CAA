# Relatório do trabalho sobre o jogo FrikFrak

## Introdução

Este projeto consiste em uma implementação de um jogo que é chamado FrikFrak  não utilizei **Java** com a biblioteca **Swing** para criar a interface gráfica . O objetivo do jogo é permitir que dois jogadores participem de uma partida em um tabuleiro 3x3, onde os jogadores se alternam para colocar suas peças (X ou O) até que um deles vença ou o jogo termine em empate.

## Funcionalidades

O jogo possui as seguintes funcionalidades:

- **Tabuleiro 3x3**: O tabuleiro é composto por uma grade de 3x3, onde cada célula é representada por um botão.
- **Alternância de jogadores**: O jogador "X" começa o jogo, e os jogadores se alternam a cada jogada.
- **Verificação de vitória**: O jogo verifica automaticamente se um jogador completou uma linha, coluna ou diagonal com suas peças, declarando um vencedor.
- **Verificação de empate**: O jogo verifica se o tabuleiro está cheio e não houve vencedor, declarando um empate.
- **Reinício automático**: Após uma vitória ou empate, o jogo reinicia automaticamente, limpando o tabuleiro.

## Estrutura do Jogo

A estrutura do código segue a lógica de um jogo de **Jogo da Velha** clássico mas o FrikFrak nós temos só 3 peças podemos movimentar só as 3 peças se movimentarmos e as peças tiverem acabado o jogo fica empate. 


### Funcionalidades e Métodos

#### 1. **Criação do Tabuleiro**
   - O método `criarTabuleiro()` cria o tabuleiro e inicializa os botões com valores vazios (' ').
   
#### 2. **Fazer Jogada**
   - O método `fazerJogada(int linha, int coluna)` permite que o jogador faça uma jogada. 
   - Após cada jogada, o jogo verifica se há um vencedor ou se o jogo terminou em empate.

#### 3. **Verificação de Vitória**
   - O método `verificarVitoria(char peca)` verifica se o jogador atual fez uma linha, coluna ou diagonal completa com suas peças.
   - Caso haja vitória, o jogo exibe uma mensagem de vitória e reinicia o tabuleiro.

#### 4. **Verificação de Empate**
   - O método `verificarEmpate()` verifica se o tabuleiro está cheio, mas não houve vencedor, resultando em um empate.

#### 5. **Reinício do Jogo**
   - O método `reiniciarJogo()` limpa o tabuleiro, reseta os valores e reinicia o estado do jogo.


## Fluxo de Jogo

1. O jogo começa com o jogador "X" e alterna entre "X" e "O" a cada jogada.
2. Cada jogador escolhe uma célula vazia clicando em um dos botões.
3. O jogo verifica se algum jogador completou uma linha, coluna ou diagonal. Caso sim, o jogo declara um vencedor e reinicia o tabuleiro.
4. Se não houver vencedor e o tabuleiro estiver cheio, o jogo declara um empate e também reinicia.
5. Após cada partida, o tabuleiro é limpo e o jogo começa novamente.

## Como Jogar


1. O jogador "X" começa a partida. Clique nas células do tabuleiro para colocar sua peça.
2. Após cada jogada, o tabuleiro será atualizado, e o jogo verificará se alguém venceu ou se houve empate.
3. Quando o jogo terminar (vitória ou empate), uma mensagem será exibida e o tabuleiro será limpo automaticamente para iniciar uma nova partida.




## Exemplos de Execução

### Exemplo 1: Vitória do Jogador 1 (X)

## Desafios
Tive muitos desafios pelo caminho por exemplo com a interface gráfica o meu programa ficou sem interface e para coloca-lo a funcionar foi um desafio.