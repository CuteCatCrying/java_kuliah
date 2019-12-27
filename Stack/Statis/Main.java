package Statis;
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

class Stack{
    private int top;
    private NilaiMatkul[] data = new NilaiMatkul[10];
    
    Stack(){
        for(int i=0; i<10; i++){
            data[i] = new NilaiMatkul();
        }
    }
    
    void setTop(int top){
        this.top = top;
    }
    int getTop(){
        return top;
    }
    
    void createEmpty(){
        top = -1;
    }
    
    boolean isEmpty(){
        boolean hasil;
        hasil = false;
        
        if(top == -1){
            hasil = true;
        }
        return hasil;
    }
    
    boolean isFull(){
        boolean hasil;
        hasil = false;
        
        if(top == 9){
            hasil = true;
        }
        return hasil;
    }
    
    void push(String nim, String nama, double nilai){
        if(isFull() == true){
            System.out.println("Stack penuh");
        }else{
            if(isEmpty() == true){
                top = 0;
                data[top].setNim(nim);
                data[top].setNama(nama);
                data[top].setNilai(nilai);
            }else{
                top = top + 1;
                data[top].setNim(nim);
                data[top].setNama(nama);
                data[top].setNilai(nilai);
            }
        }
    }
    
    void pop(){
        if(top == 0){
            top = -1;
        }else{
            if(top != -1){
                top = top - 1;
            }
        }
    }
    
    void printStack(){
        int i;
        if(top != -1){
            System.out.println("\nIsi Stack");
            for(i=top; i>=0; i--){
                System.out.println("-------------");
                System.out.println("Elemen ke : "+(i+1));
                System.out.println("Nim  : "+data[i].getNim());
                System.out.println("Nama : "+data[i].getNama());
                System.out.println("Nilai: "+data[i].getNilai());
            }
        }else{
            System.out.println("Stack kosong");
        }
    }
}


public class CobaStackStatis {
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.createEmpty();
        s.push("123", "Saya", 90);
        s.push("873", "Dia", 82);
        s.push("312", "Kamu", 67);
        s.printStack();
        
        s.pop();
        s.pop();
        s.printStack();
    }
}
