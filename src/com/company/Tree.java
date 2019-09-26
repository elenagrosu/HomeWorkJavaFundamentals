package com.company;


class Node {

    protected Student iData;
    protected Node leftChild;
    protected Node rightChild;

    public Student getiData() {
        return iData;
    }

    public Node(Student id ){
        this.iData=id;
    }
    @Override
    public String toString() {
        return " "+iData;
    }
}


public class Tree {

    protected Node root;
    private int size;
    private Object[] arr;

    public Tree(){
        root=null;
    }

    public void insert(Student id) {
        Node newNode=new Node(id);
        if (root==null){
            root=newNode;
        }else {
            Node current=root;
            Node parent;
            while(true){
                parent=current;
                String a=id.getName();
                String b=current.getiData().getName();
                int compare = a.compareTo(b);
                if (compare < 0){
                    current = current.leftChild;
                    if(current ==null){
                        parent.leftChild=newNode;
                        return;
                    }
                }else {
                    current=current.rightChild;
                    if(current == null){
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }

    }


    public boolean find(Student id){
        Node current = root;
        if(root!=null){
            while(current.iData != id) {
                    if(id.getName().compareTo(current.iData.toString()) < 0)
                        current = current.leftChild;
                    else
                        current = current.rightChild;
                    if(current == null)
                        return false;
            }
            return true;
        }
        return false;
    }

    public Node deleteTreeNode(Node root, Student data) {
        Node cur = root;
        if(cur == null){
            return cur;
        }
        if(cur.iData.getName().compareTo(data.toString())>0){
            cur.leftChild = deleteTreeNode(cur.leftChild, data);
        }else if(cur.iData.getName().compareTo(data.toString())<0){
            cur.rightChild = deleteTreeNode(cur.rightChild, data);
        }else{
            if(cur.leftChild == null && cur.rightChild == null){
                cur = null;
            }else if(cur.rightChild == null){
                cur = cur.leftChild;
            }else if(cur.leftChild == null){
                cur = cur.rightChild;
            }else{
                Node temp  = findMinFromRight(cur.rightChild);
                cur.iData = temp.iData;
                cur.rightChild = deleteTreeNode(cur.rightChild, temp.iData);
            }
        }
        return cur;
    }

    public Node findMinFromRight(Node node) {
        while (node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    void traverseInorder(Node node) {
        if (node == null)
            return;
        size++;
        traverseInorder(node.leftChild);
        traverseInorder(node.rightChild);
    }

    int traverseInorder()    {   size=0; traverseInorder(root);  return size;  }

    public boolean isEmpty(){
        if(root == null) return true;
        else return false;
    }

    public void clearTree() {
        root=null;
    }

    public Node min(Node student1, Node student2){
        String a=student1.getiData().getName();
        String b=student2.getiData().getName();
        int compare = a.compareTo(b);
        if(compare<0) return  student1;
        else return student2;
    }

    public void treetoArray(Node node ){
        if (node == null)
            return;
        treetoArray(node.leftChild);
        arr[size++]=node.iData;
        treetoArray(node.rightChild);
    }
    public Object[] getArray(){
        arr=new Object[traverseInorder()];
        size=0;
        treetoArray(root);
        showArray();
        return arr;
    }

    public void showArray(){
        System.out.println();
        for(Object o:arr){
            System.out.print(o+" ;");
        }
        System.out.println();

    }

}
