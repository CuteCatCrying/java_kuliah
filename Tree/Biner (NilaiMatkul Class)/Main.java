package kelasTreeBinerNilaiMatkulClass;

class NilaiMatkul{
    private String nim;
    private String nama;
    private double nilai;
    
    NilaiMatkul(){    
    }
    void setNim(String nim){
        this.nim = nim;
    }
    String getNim(){
        return nim;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    void setNilai(double nilai){
        this.nilai = nilai;
    }
    double getNilai(){
        return nilai;
    }
}

class Simpul{
    private NilaiMatkul kontainer;
    private Simpul right;
    private Simpul left;
    
    Simpul(){
        kontainer = new NilaiMatkul();
    }
    
    void setKontainer(NilaiMatkul kontainer){
        this.kontainer = kontainer;
    }
    
    NilaiMatkul getKontainer(){
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
    
    void makeTree(String nim, String nama, double nilai){
        Simpul baru;
        
        baru = new Simpul();
        baru.getKontainer().setNim(nim);
        baru.getKontainer().setNama(nama);
        baru.getKontainer().setNilai(nilai);
        baru.setRight(null);
        baru.setLeft(null);
        root = baru;
    }
    
    void addRight(String nim, String nama, double nilai, Simpul root){
        Simpul baru;
        
        if(root.getRight() == null){
            baru = new Simpul();
            baru.getKontainer().setNim(nim);
            baru.getKontainer().setNama(nama);
            baru.getKontainer().setNilai(nilai);
            baru.setRight(null);
            baru.setLeft(null);
            root.setRight(baru);
        }else{
            System.out.println("Sub pohon kanan sudah terisi");
        }
    }
    
    void addLeft(String nim, String nama, double nilai, Simpul root){
        Simpul baru;
        
        if(root.getLeft() == null){
            baru = new Simpul();
            
            baru.getKontainer().setNim(nim);
            baru.getKontainer().setNama(nama);
            baru.getKontainer().setNilai(nilai);
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
            String cetak = String.format("%s\t%s\t%.2f",root.getKontainer().getNim(),root.getKontainer().getNama(),root.getKontainer().getNilai());
            System.out.println("   "+cetak+"  ");
            printTreePreOrder(root.getLeft());
            printTreePreOrder(root.getRight());
        }
    }
    
    void printTreeInOrder(Simpul root){
        if(root != null){
            String cetak = String.format("%s\t%s\t%.2f",root.getKontainer().getNim(),root.getKontainer().getNama(),root.getKontainer().getNilai());
            printTreeInOrder(root.getLeft());
            System.out.println("   "+cetak+"  ");
            printTreeInOrder(root.getRight());
        }
    }
    
    void printTreePostOrder(Simpul root){
        if(root != null){
            String cetak = String.format("%s\t%s\t%.2f",root.getKontainer().getNim(),root.getKontainer().getNama(),root.getKontainer().getNilai());
            printTreePostOrder(root.getLeft());
            printTreePostOrder(root.getRight());
            System.out.println("   "+cetak+"  ");
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

public class Main{
    public static void main(String[] args) {
        Tree T = new Tree();
        
        T.makeTree("3213","Rezu",54.2);
        T.addLeft("231","Reita",42.2, T.getRoot());
        T.addRight("542","Cecep",92.1, T.getRoot());

        System.out.println("==============================");
        System.out.println("T Pre Order");
        T.printTreePreOrder(T.getRoot());

        System.out.println("==============================");
        System.out.println("T In Order");
        T.printTreeInOrder(T.getRoot());

        System.out.println("==============================");
        System.out.println("T Post Order");
        T.printTreePostOrder(T.getRoot());
    }
}