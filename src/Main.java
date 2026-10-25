void main() {
    BinarySearchTree tree = new BinarySearchTree();

    tree.addNode(5);
    tree.addNode(7);
    tree.addNode(3);
    tree.addNode(11);
    tree.addNode(10);

    System.out.print("Percurso em pré-ordem: [ ");
    tree.preOrder();
    System.out.print("]\nPercurso em ordem: [ ");
    tree.inOrder();
    System.out.print("]\nPercurso em pós-ordem: [ ");
    tree.postOrder();
    System.out.print("]\nQuantidade de folhas: " + tree.countLeaves());
    System.out.println();
}