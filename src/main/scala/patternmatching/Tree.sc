// Define a set of case classes for representing binary trees.
sealed abstract class Tree
case class Node(elem: Int, left: Tree, right: Tree) extends Tree
case object Leaf extends Tree

// Return the in-order traversal sequence of a given tree.
def inOrder(t: Tree): List[Int] = t match {
  case Node(e, l, r) => inOrder(l) ::: List(e) ::: inOrder(r)
  case Leaf          => List()
}

//    t1:
//          1
//        /  \
//       2   3
//      / \ / \
//     4  - -  -
//    / \
//   -   -

val t1 = Node(1, Node(2, Node(4, Leaf, Leaf), Leaf), Node(3, Leaf, Leaf))

inOrder(t1)

