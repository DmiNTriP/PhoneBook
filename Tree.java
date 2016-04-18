/**
 * Created by Kyler on 4/17/2016.
 */
public class Tree {
    Node rootNode;
    Employee theEmployee;


    public void addNode(Employee anEmployee) {
        //creates a new node and initializes it
        Node newNode = new Node(anEmployee);

        //if there is no root node this becomes the root node
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            //Set root as node we will start with
            Node theFocusNode = rootNode;

            //This will be the future parent for the node we created
            Node parentNode = theFocusNode;
            while (!false) {
                //root is the top parent node so we start the tree at the root
                parentNode = theFocusNode;

                //check to see which side of the parent node theFocusNode should go on
                theFocusNode = theFocusNode.leftChidNode;

                //if left child node has no children
                if (theFocusNode == null) {
                    parentNode.leftChidNode = newNode;
                } else {
                    theFocusNode = theFocusNode.rightChidNode;

                    //if right child node has no children
                    if (theFocusNode == null) {
                        parentNode.rightChidNode = newNode;
                    }
                }


            }
        }
    }

    public void inOrderTraversal(Node theFocusNode) {
        //
        if (theFocusNode != null) {
            inOrderTraversal(theFocusNode.leftChidNode);
        }
        //display the currently focused node
        System.out.println(theFocusNode);
    }

    public Node findTheNode(int empKey) {
        //Start at the root node (topNode) of the tree
        Node theFocusNode = rootNode;

        //while the focused node does not have a matching key
        while (theFocusNode.getKey() != empKey) {
            //
            if (empKey < theFocusNode.getKey()) {
                //focus on the rightNode
                theFocusNode = theFocusNode.rightChidNode;
            } else {
                //focus on the leftNode
                theFocusNode = theFocusNode.leftChidNode;
            }
            //if the node wasn't found
            if (theFocusNode == null) {
                return null;
            }
            //return theFocusedNode back to the program
        }

        return theFocusNode;

    }

    // checking to see if the right and left child node  are empty
    public boolean remove(int empKey) {//TODO: could turn alot of these if and else if into switch statements
        //start at the root of the Bin Tree
        Node theFocusNode = rootNode;
        Node parentNode = rootNode;

        //lets us know if we should search for a node on the right or left
        boolean isALeftChild = true;

        //while we still need to keeep looking for the node
        while (theFocusNode.getKey() != empKey) {
            parentNode = theFocusNode;

            //if we should search to the leftNode
            if (empKey < theFocusNode.getKey()) {
                //it is a leftChildnode
                isALeftChild = true;
                //and shift focus to the left childnode
                theFocusNode = theFocusNode.leftChidNode;
            } else {
                // the node is greater than focus node so shift right
                isALeftChild = false;
                theFocusNode = theFocusNode.rightChidNode;
            }
            //if node wasnt found at all
            if (theFocusNode == null) {
                return false;
            }

            //if focused node has no children delete it
            if (theFocusNode.leftChidNode == null && theFocusNode.rightChidNode == null) {
                //if the focus node is the root node setting it to null will delete it (thats what we want to do here)
                if (theFocusNode == null) {
                    theFocusNode = rootNode;
                    rootNode = null;
                }
                //if the target node was a leftchildnode of the parent delete it in it's parent
                else if (isALeftChild == true) {
                    parentNode.leftChidNode = theFocusNode.leftChidNode;
                }
                //if the target node was a leftchildnode of the parent delete it in it's parent
                else {
                    parentNode.rightChidNode = theFocusNode.rightChidNode;
                }
                // if there are Two Child nodes the deleted nodes will need a replacement

            } else {
                Node replacementNode = getReplacementNode(theFocusNode);
                //if the focusnode is rootnode swap it out for the replacementnode
                if (theFocusNode == rootNode) {
                    rootNode = replacementNode;
                }
                //if deleted node was a leftchildnode make replementnode a leftchildnode
                else if (isALeftChild) {
                    parentNode.leftChidNode = replacementNode;
                }
                //and vice versda if it is a rightchildnode
                else {
                    parentNode.rightChidNode = replacementNode;
                }
                replacementNode.leftChidNode = theFocusNode.leftChidNode;
            }
        }
        return true;

    }
    public Node getReplacementNode(Node replacedNode){
        Node parentReplacementNode =replacedNode;
        Node replacementNode = replacedNode;

        Node theFocusNode = replacedNode.rightChidNode;

        //while no leftchildren nodes are left
        while(theFocusNode != null) {
            parentReplacementNode = replacementNode;
            replacementNode = theFocusNode;
            theFocusNode = theFocusNode.leftChidNode;
        }
        /*if the replacement node isnt the right child node
        move the replacementnode into the parents leftchildnodes slot
        and move the replaced nodes right child node into the replacementnodes
        right childnode
         */
        if(replacementNode != replacedNode.rightChidNode){
            parentReplacementNode.leftChidNode =replacedNode.rightChidNode;
            parentReplacementNode.rightChidNode = replacedNode.rightChidNode;
        }
        return replacementNode;
    }
}


