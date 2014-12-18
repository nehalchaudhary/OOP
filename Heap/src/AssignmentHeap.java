
/*
 * Name             :- Nehal Chaudhary
 * OOP Assignment 1 :- Implement Min-Heap
 */

import static java.lang.Math.*;
import java.io.*;
import java.util.*;

public class AssignmentHeap
{
	public class Node //Node class
	{
		Node leftChild; 
		Node rightChild; 
		String nodeData;
		
		public Node(String argNodeData) //parameterized constructors
		{
			leftChild = null;
			rightChild = null;
			nodeData = argNodeData;
		}
	}
	
	Node root; //Root node
	Boolean checkIng;

	AssignmentHeap()// Constructor
	{	
		root = null;
		checkIng = false;
	}
		
	public Boolean addNode(String dataToAdd) // function to add a new node to the existing tree
	{
		dataToAdd.trim(); // remove extra spaces in the data to be added
		if(dataToAdd.length() == 0) // check if the data is null
		{
			return false;
		}
		Node newNode = new Node(dataToAdd); // create a new node with the new data to be added
		if(root == null) // check if the tree is empty
		{
			root = newNode; //if tree is empty the new node becomes the root
			return true;
		}
		else // else traverse the tree to determine where to add the node
		{
			Node traversingPointer = root; // create a pointer to traverse the tree
			Integer leftHeight,rightHeight; 
			String swapNodeData = ""; 
			while(true)
			{
				// calculate the left and the right height of the current node
				leftHeight = calculateHeight(traversingPointer.leftChild); 
				rightHeight = calculateHeight(traversingPointer.rightChild);  
				// compare the data of the current node and the node to be added
					// lexicographically to determine which is the smaller of the two
				if(newNode.nodeData.compareToIgnoreCase(traversingPointer.nodeData) > 0)
				{
					// if the left height is smaller than go to the left child of the current node
					if(leftHeight > rightHeight) 
					{
						if(traversingPointer.rightChild != null) // if right child present then go to the right child
							traversingPointer = traversingPointer.rightChild;
						else // if right child is not present, attach the new node to the to the right of the current node 
						{
							traversingPointer.rightChild = newNode;
							return true;
						}
					}
					// if the right height is smaller than go to the right child of the current node
					else
					{
						if(traversingPointer.leftChild != null) // if left child present then go to the left child
							traversingPointer = traversingPointer.leftChild;
						else // if left child is not present, attach the new node to the to the left of the current node
						{
							traversingPointer.leftChild = newNode;
							return true;
						}
					}
				}
				else // if data to be added is smaller than the current node, swap the data of the two nodes
				{
					swapNodeData = newNode.nodeData;
					newNode.nodeData = traversingPointer.nodeData;
					traversingPointer.nodeData = swapNodeData;
				}
			}
		}
	}
	
	public Integer calculateHeight(Node node)
	{
		if(node == null) //height is negative 1 for null nodes
			return -1;
		else //height is the max of the heights of the left child and right child + 1
			return (max(calculateHeight(node.leftChild),calculateHeight(node.rightChild)) + 1);
	}
		
	public void preorderDisplay(Node Root) // display the nodes of the tree in preorder
	{
		if(Root == null)
			return;
		System.out.print(Root.nodeData + "  ");
		preorderDisplay(Root.leftChild);
		preorderDisplay(Root.rightChild);
	}
	
	public void preorderDisplayIng(Node Root) // display the nodes ending with "ing" of the tree in preorder
	{
		if(Root == null)
			return;
		if(Root.nodeData.endsWith("ing"))
		{
			System.out.print(Root.nodeData + "  ");
			checkIng = true; 
		}
		preorderDisplayIng(Root.leftChild);
		preorderDisplayIng(Root.rightChild);
	}
	
	public static void main(String[] args) throws IOException
	{
        AssignmentHeap heap = new AssignmentHeap(); // create a new heap
        Scanner standardInput = new Scanner(System.in); 
        String newNodeData; // new node to be added
        String toContinue; // variable to ask user if he wants to continue
        int switchCaseChoice; 
        do
        {
        	// MENU
        	System.out.println("Enter choice\n");
        	System.out.println("\t1. Add new node");
        	System.out.println("\t2. Preorder display");
        	System.out.println("\t3. Display words ending with \"ing\" in preorder");
        	System.out.print("Enter Choice : ");
        	switchCaseChoice = standardInput.nextInt();
        	switch(switchCaseChoice)
        	{
        		case 1: // if the user wants to add node to the heap
        			System.out.print("Enter the data : ");
        			newNodeData = standardInput.next();
        			if(!heap.addNode(newNodeData))
        				System.out.println("Invalid data input");;
        			break;
        		case 2: // if the user wants to the heap
        			if(heap.root == null)
        				System.out.println("Tree is empty !");
        			else
        				heap.preorderDisplay(heap.root);
        			break;
        		case 3: // if the user wants to the heap
        			if(heap.root == null)
        				System.out.println("Tree is empty !");         				
        			else
        			{
        				heap.preorderDisplayIng(heap.root);
        				if(heap.checkIng == false)
        					System.out.println("There are no data nodes present ending with \"ing\" !");
        				heap.checkIng = false;
        			}        			
        			break;
        	}
        	System.out.print("\nDo you wish to continue?(y/n) :  ");
        	toContinue = standardInput.next();
        }while(toContinue.equals("y"));
	}
}

	
