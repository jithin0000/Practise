package org.example.search.st.bst;

public class BinarySearchTree<Key extends  Comparable<Key>, Value> {
    private Node root;
    private int N;

    class Node{
       private  Node left,right;
       private final Key key; Value value; int N=0;

        public Node(Key key, Value v, int n) {
            this.key = key;
            this.value= v;
            N = n;
        }
    }

    public Value get(Key k)
    {
        return get(root,k);
    }

    public int size() {
        return size(root);
    }

    public void put(Key k, Value v)
    {
        root = put(root,k,v);
    }
    private Node put(Node x, Key k, Value v)
    {
        if(x==null)x= new Node(k,v,1);
        int cmp = k.compareTo(x.key);
        if(cmp<0)x.left=put(x.left,k,v);
        else if (cmp > 0) x.right=put(x.right,k,v);
        else x.value=v;
        x.N = size(x.left)+size(x.right)+1;
        return x;
    }

    private int size(Node x) {
        if(x==null)return 0;
        return x.N;
    }

    private Value get(Node x, Key k)
    {
        if(x==null)return null;
        int cmp = k.compareTo(x.key);
        if(cmp<0)return get(x.left,k);
        else if (cmp > 0) return get(x.right,k);
        else return x.value;
    }

    public Key min(){
        if(root==null)return null;
        return min(root).key;
    }
    private Node min(Node x){
        if(x.left==null)return x;
        return min(x.left);
    }

    public Key floor(Key k)
    {
        Node f =  floor(root,k);
        if(f==null)return null;
        return f.key;
    }
    private Node floor(Node x, Key k)
    {
        if(x==null)return null;
        int cmp = k.compareTo(x.key);
        if (cmp==0)return x;
       if(cmp<0)return floor(x.left,k) ;
       Node t  = floor(x.right,k);
       if(t!=null) return t;
       else return x;

    }




}
