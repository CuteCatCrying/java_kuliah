package Dinamis;

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

class Elemen{
    private NilaiMatkul kontainer;
    private Elemen next;
    
    Elemen(){
        kontainer = new NilaiMatkul();
    }
    
    NilaiMatkul getKontainer(){
        return kontainer;
    }
    
    void setNext(Elemen next){
        this.next = next;
    }
    
    Elemen getNext(){
        return next;
    }
}

class Stack{
    private Elemen top;
    
    Stack(){
        
    }
    
    void setTop(Elemen top){
        this.top = top;
    }
    
    Elemen getTop(){
        return top;
    }
    
    void createEmpty(){
        top = null;
    }
    
    boolean isEmpty(){
        boolean hasil = false;
        if(top == null){
            hasil = true;
        }
        return hasil;
    }
    
    int countElemen(){
        Elemen bantu;
        int hasil = 0;
        
        if(top != null){
            bantu = top;
            while(bantu != null){
                hasil += 1;
                bantu = bantu.getNext();
            }
        }
        return hasil;
    }
    
    void push(String nim, String nama, double nilai){
        Elemen baru;
        baru = new Elemen();
        
        baru.getKontainer().setNim(nim);
        baru.getKontainer().setNama(nama);
        baru.getKontainer().setNilai(nilai);
        
        if(top == null){
            baru.setNext(null);
        }else{
            baru.setNext(top);
        }
        
        top = baru;
        baru = null;
    }
    
    void pop(){
        Elemen hapus;
        
        if(top != null){
            hapus = top;
            if(countElemen() == 1){
                top = null;
            }else{
                top = top.getNext();
            }
            hapus.setNext(null);
        }else{
            System.out.println("Stack kosong");
        }
    }
    
    void printStack(){
        int i;
        Elemen bantu;
        
        if(top != null){
            System.out.println("ISI STACK");
            bantu = top;
            i = 1;
            
            while(bantu != null){
                System.out.println("===============");
                System.out.println("Elemen ke : "+i);
                System.out.println("Nim  : "+bantu.getKontainer().getNim());
                System.out.println("Nama : "+bantu.getKontainer().getNama());
                System.out.println("Nilai: "+bantu.getKontainer().getNilai());
                i += 1;
            }
            System.out.println("------------");
        }else{
            System.out.println("Stack kosong!!");
        }
    }
}

public class CobaStackDinamis {
    public static void main(String[] args) {
        
    }
}
