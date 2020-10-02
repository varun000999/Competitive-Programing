import java.util.*;
class Node{
	int key;
	Node left,right;
	Node(int element)
	{
		key=element;
		left=right=null;
	}
}
public class Treetraversal {
		Node root;
		Treetraversal()
		{
			root=null;
		}
		static void preorder(Node temp)
		{
			if(temp==null)
			{
				return;
			}
			System.out.println(temp.key);
			preorder(temp.left);
			preorder(temp.right);
		}
		static void Inorder(Node temp)
		{
			if(temp==null)
			{
				return;
			}
			Inorder(temp.left);
			System.out.println(temp.key);
			Inorder(temp.right);
		}
		static void postorder(Node temp)
		{
			if(temp==null)
			{
				return;
			}
			postorder(temp.left);
			postorder(temp.right);
			System.out.println(temp.key);
		}
	
	public static void main(String[] args)
	{
		Treetraversal tree=new Treetraversal();
		tree.root = new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		preorder(tree.root);
		Inorder(tree.root);
		postorder(tree.root);
	}

}
