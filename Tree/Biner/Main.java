package kelasTreeBiner;

class Simpul{
    private char kontainer;
    private Simpul right;
    private Simpul left;
    
    Simpul(){
        
    }
    
    void setKontainer(char kontainer){
        this.kontainer = kontainer;
    }
    
    char getKontainer(){
        return kontainer;
    }
    
    void setRight(Simpul right){
        this.right = right;
    }
    
    Simpul getRight(){
        return right;
    }
    
    void setLeft(Simpul left){
        this.left = left;
    }
    
    Simpul getLeft(){
        return left;
    }
}

class Tree{
    private Simpul root;
    
    Tree(){
        root = new Simpul();
    }
    
    void setRoot(Simpul root){
        this.root = root;
    }
    
    Simpul getRoot(){
        return root;
    }
    
    void makeTree(char c){
        Simpul baru;
        
        baru = new Simpul();
        baru.setKontainer(c);
        baru.setRight(null);
        baru.setLeft(null);
        root = baru;
    }
    
    void addRight(char c, Simpul root){
        Simpul baru;
        
        if(root.getRight() == null){
            baru = new Simpul();
            baru.setKontainer(c);
            baru.setRight(null);
            baru.setLeft(null);
            root.setRight(baru);
        }else{
            System.out.println("Sub pohon kanan sudah terisi");
        }
    }
    
    void addLeft(char c, Simpul root){
        Simpul baru;
        
        if(root.getLeft() == null){
            baru = new Simpul();
            
            baru.setKontainer(c);
            baru.setRight(null);
            baru.setLeft(null);
            root.setLeft(baru);
        }else{
            System.out.println("Sub pohon kiri sudah terisi");
        }
    }
    
    void delAll(Simpul root){
        if(root != null){
            delAll(root.getLeft());
            delAll(root.getRight());
            root = null;
        }
    }
    
    void delRight(Simpul root){
        if(root != null){
            if(root.getRight() != null){
                delAll(root.getRight());
                root.setRight(null);
            }
        }
    }
    
    void delLeft(Simpul root){
        if(root != null){
            if(root.getLeft() != null){
                delAll(root.getLeft());
                root.setLeft(null);
            }
        }
    }
    
    void printTreePreOrder(Simpul root){
        if(root != null){
            System.out.print("   "+root.getKontainer()+"  ");
            printTreePreOrder(root.getLeft());
            printTreePreOrder(root.getRight());
        }
    }
    
    void printTreeInOrder(Simpul root){
        if(root != null){
            printTreeInOrder(root.getLeft());
            System.out.print("   "+root.getKontainer()+"   ");
            printTreeInOrder(root.getRight());
        }
    }
    
    void printTreePostOrder(Simpul root){
        if(root != null){
            printTreePostOrder(root.getLeft());
            printTreePostOrder(root.getRight());
            System.out.print("   "+root.getKontainer()+"   ");
        }
    }
    
    Simpul copyTree(Simpul root1){
        Simpul root2;
        
        if(root1 == null){
            return root1;
        }
        
        root2 = new Simpul();
        root2.setKontainer(root1.getKontainer());
        root2.setRight(copyTree(root1.getRight()));
        root2.setLeft(copyTree(root1.getLeft()));
        return root2;
    }
    
    boolean isEqual(Simpul root1, Simpul root2){
        boolean hasil = true;
        
        if(root1 != null && root2 != null){
            // sama-sama tidak kosong
            if(root1.getKontainer() != root2.getKontainer()){
                hasil = false; //Jika root tidak sama
            }else{//jika root sama, periksa simpul lain
                if(root1.getKontainer() == root2.getKontainer() && isEqual(root1.getLeft(),root2.getLeft()) && isEqual(root1.getRight(),root2.getRight())){
                    hasil = true;
                }else{
                    hasil = false;
                }
            }
        }else{
            if(root1 != null || root2 != null){// salah satu kosong
                hasil = false;
            }
        }
        return hasil;
    }
}

public class Main {
    public static void main(String[] args) {
        Tree T = new Tree();
        
        T.makeTree('A');
        T.addLeft('B', T.getRoot());
        T.addRight('C', T.getRoot());
        T.addLeft('D', T.getRoot().getLeft());
        T.addRight('E', T.getRoot().getLeft());
        T.addRight('F', T.getRoot().getRight());
        
        System.out.println("======================================");
        System.out.println("T PreOrder");
        T.printTreePreOrder(T.getRoot());
        System.out.println("\n======================================");
        System.out.println("T InOrder");
        T.printTreeInOrder(T.getRoot());
        System.out.println("\n======================================");
        System.out.println("T PostOrder");
        T.printTreePostOrder(T.getRoot());
        
        Tree T2 = new Tree();
        T2.setRoot(T2.copyTree(T.getRoot()));
        System.out.println("\n======================================");
        System.out.println("T2 PreOrder");
        T2.printTreePreOrder(T2.getRoot());
        System.out.println("\n======================================");
        System.out.println("Periksa kesamaan T dan T2");
        if((T.isEqual(T.getRoot(), T2.getRoot())) == true){
            System.out.println("Kedua pohon sama");
        }else{
            System.out.println("Kedua pohon bebeda");
        }
        
        // T.delRight(T.getRoot())
    }
}