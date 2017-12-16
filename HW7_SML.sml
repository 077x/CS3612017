(*Implement the datatype BinaryTree and all the functions that are provided in the lecture notes: 
lookup, inorder, preorder, postorder, left_subtree, right_subtree and label. 
Provide screenshots to show that your code is correct. Provide 2 tests for each function.*)

datatype 'a BinaryTree = btempty | bt of 'a * 'a BinaryTree * 'a BinaryTree;
fun lookup (btempty, _) = false | lookup(bt(root:int,left,right), x:int) =
if (x = root) then true 
else (if (x <= root) then lookup(left,x) 
else lookup(right,x));
fun inorder (btempty) = [] | inorder(bt(root:'a, left, right)) =
inorder(left) @ (root :: inorder(right));
fun preorder (btempty) = [] | preorder(bt(root:'a, left, right)) =
root :: (preorder(left) @ preorder(right));
fun postorder (btempty) = [] | postorder(bt(root:'a, left, right)) =
(postorder(left) @ postorder(right)) @ (root :: []);
fun left_subtree btempty = btempty | left_subtree(bt(_,left,_)) = left;
fun right_subtree btempty = btempty | right_subtree(bt(_,_,right)) = right;
exception label_has_nil_argument;
fun label btempty = raise label_has_nil_argument | label(bt(value,_,_)) = value;
val Tree = bt(2,btempty, bt(3,btempty, bt(7,bt(6,bt(5,btempty,btempty),btempty),
bt(8,btempty,btempty))));
(* More sample binary trees *)
val Tree1 = bt(3,btempty,btempty);
val Tree2 = bt(5,bt(1,btempty,btempty),btempty);
val Tree3 = bt(7,bt(4,btempty,btempty), bt(12,btempty,btempty));
val Tree4 = bt("*", bt("/", bt("-",bt("7",btempty,btempty),
bt("a",btempty,btempty)), bt("5",btempty,btempty)), bt("exp",
bt("+",bt("a",btempty,btempty), bt("b",btempty,btempty)),
bt("3",btempty,btempty)));
lookup(Tree,6);
lookup(Tree,1);
lookup(Tree,9);
lookup(Tree3,12);
lookup(btempty,6);
inorder(Tree);
preorder(Tree);
postorder(Tree);
inorder(Tree4);
label(Tree);
right_subtree(Tree);
left_subtree(Tree);
(* Traversal of expressions *)
val Expression = bt("+", bt("*", bt("+", bt("2",btempty,btempty), 
bt("5",btempty,btempty)), bt("*", bt("3",btempty,btempty), 
bt("4",btempty,btempty))), bt("*", bt("1",btempty,btempty), 
bt("6",btempty,btempty)));
val Expression2 = bt("+", bt("*", bt("+", bt("2",btempty,btempty),
bt("5",btempty,btempty)), bt("*", bt("3",btempty,btempty),
bt("4",btempty,btempty))), bt("*", bt("1",btempty,btempty),
bt("6",btempty,btempty)));
inorder(Expression);
preorder(Expression);
postorder(Expression);
inorder(Expression2);
preorder(Expression2);
postorder(Expression2);
