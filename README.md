# Caixa Eletrônico

## Descrição

Este projeto implementa a lógica de um caixa eletrônico que calcula a quantidade mínima de cédulas necessárias para um valor de saque dado. O algoritmo suporta cédulas de 100, 50, 20, 10, 5 e 2 reais.

## Funcionalidades

- Solicitar ao usuário o valor do saque desejado.
- Calcular a quantidade mínima de cédulas necessárias para o saque.
- Exibir a quantidade de cédulas de cada valor utilizadas.
- Indicar se há um valor restante que não pode ser sacado devido à indisponibilidade de cédulas de menor valor.

## Estrutura do Projeto

O projeto contém um único arquivo Java:

- `Main.java`: Contém a implementação do algoritmo e a lógica de interação com o usuário.
- Decidi usar Java pois é a linguagem que tenho mais afinidade e teria mais facilidade para implementar a lógica que pensei. Inicialmente pensei em usar o Python ou TypeScript, mas devido ao "curto prazo" decidi usar a linguagem que sou mais familiarizado já que não era obrigatório o uso de linguagem específica.

## Desafios

Os principais desafios enfrentados durante o desenvolvimento do projeto foram:


1. **Cálculo das Cédulas:** Garantir que a quantidade mínima de cédulas fosse usada para o valor de saque desejado.
2. **Manutenção da Simplicidade do Código:** Inicialmente tentei criar o algoritmo utilizando arrays e estruturas de repetição, porém tive algumas dificuldades na implementação da lógica. Então decidi usar somente variáveis indiduais para cada denominação de cédula e estruturas de decisão, mantendo o código funcional, legível e fácil de entender.
3. **Tratamento de Valores Inválidos:** Garantir que o valor de saque fosse um inteiro positivo, fornecendo feedback adequado ao usuário.

## Como Executar o Projeto

### Pré-requisitos

- JDK (Java Development Kit) instalado. Você pode baixar e instalar o JDK a partir do [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) ou utilizar o [OpenJDK](https://openjdk.java.net/).
- IDE de sua preferência. No meu caso usei o IntelliJ.
- Você pode baixar a versão Community do IntelliJ no [site oficial da JetBrains](https://www.jetbrains.com/idea/download/) pois a versão Ultimate é paga.

### Passos para executar no IntelliJ IDEA

1. **Clone o repositório:**

   ```sh
   git clone https://github.com/miqbritto/desafio-estagio-morada.git
   cd desafio-estagio-morada

2. **Abra com IntelliJ IDEA:**
   
  - Após instalar e configurar os pré requisitos, clique com o botão direito na pasta do repositório baixado e selecione a opção "Open Folder as a IntelliJ IDEA Community Edition Project".
  - Execute o código.


