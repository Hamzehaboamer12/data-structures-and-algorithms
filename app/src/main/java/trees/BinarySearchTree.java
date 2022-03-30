package trees;

public class BinarySearchTree {

    node root;

    public void add(int key){
        if(root == null){
            root = new node(key );
        } else{
            node curr = root;
            traverseAdd(curr, key);
        }
    }

    public boolean contain(int key){
        node curr = root;
        return traverseContain(curr, key) != null;
    }

    public void traverseAdd(node curr, int key){
        if(key > curr.getKey()){
            if(curr.getRight() == null){
                curr.setRight(new node(key));
                return;
            }

            curr = curr.getRight();
        }else{
            if(curr.getLeft() == null){
                curr.setLeft(new node(key));
                return;
            }

            curr = curr.getLeft();
        }
        traverseAdd(curr, key);
    }

    public node traverseContain(node curr, int key){
        if(curr == null || curr.getKey() == key){
            return curr;
        }

        if(curr.getKey() > key){
            return traverseContain(curr.getLeft(), key);
        }

        return traverseContain(curr.getRight(), key);
    }
}
