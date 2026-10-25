# Árvore de Busca Binária

**Aluno:** Renata Toncovitch das Neves

## Descrição do projeto

Este projeto implementa uma Árvore de Busca Binária (Binary Search Tree) em Java. 

A árvore permite inserir valores e contar quantos nós folhas existem.

## Como foi implementada

A estrutura foi implementada em Java utilizando duas classes principais: `Node` e `BinarySearchTree`.

- A classe `Node.java` representa cada nó da árvore e armazena o valor e as referências para os filhos esquerdo e direito.

- A classe `BinarySearchTree.java` controla a árvore e realiza a inserção dos valores de forma recursiva. Na inserção, valores menores que o nó atual são armazenados à esquerda, enquanto valores maiores são armazenados à direita.

- A classe `Main.java` é responsável por instanciar a árvore, inserir diferentes valores e exibir os resultados dos testes.

Na inserção, valores menores ficam à esquerda e valores maiores ficam à direita. Valores repetidos são ignorados.

## Método `countLeaves()`

O método `countLeaves()` é responsável por contar a quantidade de nós folhas presentes na árvore. 

Um nó folha é aquele que não possui filhos (esquerdo ou direito).

Ele chama o método auxiliar recursivo `countLeavesIn()`, que percorre a árvore verificando cada nó.

A contagem funciona da seguinte forma:

1. Se o nó for `null`, o método retorna `0`, pois não existe nó para contar.
2. Se o nó não possuir filho esquerdo nem filho direito, é considerado uma folha e o método retorna `1`.
3. Caso contrário, o método realiza chamadas recursivas para os filhos esquerdo e direito, somando a quantidade de folhas encontradas em cada lado.

Dessa forma, o método percorre toda a árvore e retorna o total de nós folhas.

## Exemplo de utilização

```java
BinarySearchTree tree = new BinarySearchTree();

tree.addNode(5);
tree.addNode(7);
tree.addNode(3);
tree.addNode(11);
tree.addNode(10);

System.out.println(tree.countLeaves());
```

Saída esperada:

```text
2
```

