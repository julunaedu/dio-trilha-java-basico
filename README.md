# Desafio de Projeto: Simulando Uma Conta Bancária Através Do Terminal/Console
### Desafio do Bootcamp Santander 2025 - Back-End com Java, da plataforma [Digital Innovation One](https://www.dio.me/).
### Informações
Ponha em prática os fundamentos da linguagem e noções de regras de estrutura de sintaxe.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

## Desafio
Exercícios sobre todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.
1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo.

3. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Regras de declaração de variáveis
| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Terminal, main args e a classe Scanner
3. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

   * Programa: "Por favor, digite o número da Agência !"
   * Usuário: 1021 *(depois ENTER para o próximo campo)* 

###### Concatenação e classe String com método concat
4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

   * *"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*
   * Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
