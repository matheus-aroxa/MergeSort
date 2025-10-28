# MergeSort Interativo em Java

Este projeto é uma implementação interativa do algoritmo de ordenação **Merge Sort** em Java, executada via console.

Seu principal objetivo é educacional: além de ordenar um array fornecido pelo usuário, a aplicação permite **visualizar o passo a passo** do algoritmo. Ela demonstra o processo de "divisão e conquista" exibindo quando as chamadas recursivas são "empilhadas" (divisão) e "desempilhadas" (conquista), bem como o processo de "merge" (intercalação) de cada sub-array.

## ✨ Funcionalidades Principais

* **Menu Interativo:** Uma interface de console simples para interagir com o algoritmo.
* **Array Definido pelo Usuário:** Permite que o usuário insira seu próprio array de inteiros (separados por espaço) para ser ordenado.
* **Visualização de Passos:** Um modo opcional que imprime no console:
    * O empilhamento das chamadas recursivas (`Merge Sort <início><fim> empilhado`).
    * O desempilhamento das chamadas (`Merge Sort <início><fim> desempilhado`).
    * O momento da intercalação (`Aplicando merge<início><meio><fim>`).
    * O estado do vetor após cada intercalação.
* **Algoritmo Eficiente:** Implementa o Merge Sort clássico com complexidade de tempo $O(n \log n)$.

## 🛠️ Tecnologias

* **Java**
* **Scanner:** Para leitura da entrada do usuário no console.

## 📂 Estrutura do Projeto

O projeto é composto por três classes principais:

* `Main.java`: Ponto de entrada da aplicação. Responsável por iniciar o `Menu`.
* `Menu.java`: Controla todo o fluxo da aplicação, exibindo as opções, lendo a entrada do usuário e gerenciando o estado (array e exibição de passos).
* `MergeSort.java`: Contém a lógica estática do algoritmo, incluindo os métodos `mergeSort` (recursivo) e `merge` (intercalação), que recebem o booleano `exibirPassosIntermediarios` para controlar a verbosidade.

## 🚀 Como Compilar e Executar

Você precisará ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) instalado.

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/matheus-aroxa/MergeSort.git](https://github.com/matheus-aroxa/MergeSort.git)
    cd MergeSort
    ```

2.  **Compile os arquivos `.java`:**
    ```bash
    javac Main.java
    ```

3.  **Execute a classe principal:**
    ```bash
    java Main
    ```
