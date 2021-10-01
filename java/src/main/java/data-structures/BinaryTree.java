

class BinaryTreeNode<T> {
  T value;
  BinaryTreeNode<T> left;
  BinaryTreeNode<T> right;

  public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public T getValue() {
    return value;
  }

  public BinaryTreeNode<T> getLeft() {
    return left;
  }

  public BinaryTreeNode<T> getRight() {
    return right;
  }

  public boolean isLeaf() {
    return left == null && right == null;
  }

  public BinaryTreeNode<T> clone() {
    return new BinaryTreeNode<T>(value, left, right);
  }

  // operations
  public BinaryTreeNode<T> invert() {
    BinaryTreeNode<T> invertedLeft = left.invert();
    BinaryTreeNode<T> invertedRight = right.invert();
    return new BinaryTreeNode<T>(value, invertedRight, invertedLeft);
  }

}