package kelasGrafDinamis;

class Simpul{
    private char kontainer;
    private Simpul next;
    private Jalur arc;
    
    Simpul(){
    }   
    void setKontainer(char kontainer){
        this.kontainer = kontainer;
    }
    char getKontainer(){
        return kontainer; 
    }
    void setNext(Simpul next){
        this.next = next;
    }        
    Simpul getNext(){
        return next;
    }
    void setArc(Jalur arc){
        this.arc = arc;
    }
    Jalur getArc(){
        return arc;
    }
      
}

class Jalur{
    private int kontainer;
    private Jalur next_jalur;
    private Simpul tujuan;
    
    Jalur(){
    }

    void setKontainer_Jalur(int kontainer){
        this.kontainer = kontainer;
    }

    int getKontainer_Jalur(){
        return kontainer;
    }

    void setNext_Jalur(Jalur next_jalur){
        this.next_jalur = next_jalur;
    }

    Jalur getNext_Jalur(){
        return next_jalur;
    }

    void setTujuan(Simpul tujuan){
        this.tujuan = tujuan;
    }

    Simpul getTujuan(){
        return tujuan;
    }
}

class Graph{
    Simpul first;
    
    Graph(){
    }

    void setFirst(Simpul first){
        this.first = first;
    }

    Simpul getFirst(){
        return first;
    }

    void createEmpty(){
        
        first = null;
    }

    void addSimpul(char c){
       Simpul baru;

       baru = new Simpul();
       baru.setKontainer(c);
       baru.setNext(null);
       baru.setArc(null);
       
       if(first == null){
           /*jika graf kosong*/
           first = baru;
       }
       else{
           /*menambahkan simpul baru pada akhir graph*/
           
           Simpul last = first;
           
           while(last.getNext() != null){
               last = last.getNext();
           }
           last.setNext(baru);
       }
    }

    void addJalur(Simpul awal,Simpul tujuan, int beban){
        Jalur baru;

        baru = new Jalur();
        baru.setKontainer_Jalur(beban);
        baru.setNext_Jalur(null);
        baru.setTujuan(tujuan);
        
        if(awal.getArc()== null){
            /*jika list jalur kosong*/
            awal.setArc(baru);
        }
        else{
            /*menambahkan jalur baru pada akir list jalur*/
            
            Jalur last = awal.getArc();
            
            while(last.getNext_Jalur() != null){
                last = last.getNext_Jalur();
            }
            last.setNext_Jalur(baru);
        }
    }
    
    Simpul findSimpul(char c){
        
        Simpul hasil = null;
        Simpul bantu = first;
        
        boolean ketemu = false;
        while((bantu != null) && (ketemu == false)){
            if(bantu.getKontainer()== c){
                hasil = bantu;
                ketemu = true;
            }
            else{
                bantu = bantu.getNext();
            }
        }
        return hasil;
    }
    void delJalur(char ctujuan, Simpul awal){
        
        Jalur hapus = awal.getArc();
        
        if(hapus != null){
            
            Jalur prev = null;
            /*mencari jalur yang akan dihapus*/
            
            boolean ketemu = false;
            while((hapus != null) && (ketemu == false)){
                if(hapus.getTujuan().getKontainer() == ctujuan){
                    ketemu = true;
                }
                else{
                    prev = hapus;
                    hapus = hapus.getNext_Jalur();
                }
            }
            if(ketemu == true){
                if(prev == null){
                    /*hapus simpul pertama*/
                    awal.setArc(hapus.getNext_Jalur());
                    hapus.setNext_Jalur(null);
                }
                else{
                    if(hapus.getNext_Jalur() == null){
                        /*hapus jalur terakhir*/
                        prev.setNext_Jalur(null);
                    }
                    else{
                        /*hapus jalur ditengah*/
                        prev.setNext_Jalur(hapus.getNext_Jalur());
                        hapus.setNext_Jalur(null);
                    }
                }
                hapus = null;
            }
            else{
                System.out.println("tidak ada jalur dengan simpul tujuan");
            }
        }
    }
    void delAllJalur(Simpul awal){
        
        Jalur bantu;
        bantu = awal.getArc();
        Jalur hapus;
        
        while(bantu != null){
            hapus = bantu;
            bantu = bantu.getNext_Jalur();
            awal.setArc(bantu);
            hapus.setNext_Jalur(null);
            hapus = null;
        }  
        
    }
    void delSimpul(char c){
        
        Simpul hapus = first;
        if(hapus != null){
            Simpul prev = null;
            /*menacari simpul yang akan dihapus*/
            
            boolean ketemu = false;
            while((hapus != null) && (ketemu == false)){
                if(hapus.getKontainer() == c){
                    ketemu = true;
                }
                else{
                    prev = hapus;
                    hapus = hapus.getNext();
                }
            }
            if(ketemu == true){
                /*jika simpul yang akan dihapus ada*/
                /*hapus semua jalur dari simpul lain yang mengarah pada simpul yang dihapus*/
                
                Simpul bantu;
                bantu = first;
                
                /*memeriksa semua simpul dalam graf*/
                while(bantu != null){
                    /* jika semua simpul yang ditelusuri tidak sma dengan yang dihapus*/
                    if(bantu != hapus){
                        /*hapus semua jalur yang mengarah pada simpul yang akan dihapus */
                        delJalur(hapus.getKontainer(),bantu);
                    }
                    bantu = bantu.getNext();
                }
                /*hapus semua jalur */
                delAllJalur(hapus);
                
                if(prev == null){
                    /*hapus simpul pertama*/
                    first = hapus .getNext();
                }
                else{
                    if(hapus.getNext() == null){
                        /*hapus simpul terakhir*/
                        prev.setNext(null);
                    }
                    else{
                        /*hapus simpul ditengah*/
                        prev.setNext(bantu.getNext());
                        hapus.setNext(null);
                    }
                }
                hapus = null;
            }
            else{
                System.out.println("tidak ada simpul dengan kontainer karakter masukan");
            }
        }
        else{
            System.out.println("tidak ada simpul dengan kontainer karakter masukan");
        }
    }
    void printGraph(){
        
        Simpul bantu = first;
        
        if(bantu != null){
            while(bantu != null){
                System.out.println("Simpul : " +bantu.getKontainer());
                
                Jalur bantu_jalur = bantu.getArc();
                
                while(bantu_jalur != null){
                    System.out.println("- ada jalur ke simpul : "+ bantu_jalur.getTujuan().getKontainer()+ " dengan beban :"+bantu_jalur.getKontainer_Jalur());
                   bantu_jalur = bantu_jalur.getNext_Jalur();
                }
                bantu = bantu.getNext();
            }
        }
        else{
            System.out.println("graf kosong");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph G =new Graph();
        
        G.createEmpty();
        G.addSimpul('A');
        G.addSimpul('B');
        G.addSimpul('C');
        G.addSimpul('D');
        G.addSimpul('E');
        G.addSimpul('F');
        
        Simpul begin = G.findSimpul('A');
        
        Simpul end = G.findSimpul('B');
        if((begin != null) && (end != null)){
            G.addJalur(begin, end, 3);
        }
        
        begin = G.findSimpul('B');
        end = G.findSimpul('D');
         if((begin != null) && (end != null)){
            G.addJalur(begin, end, 3);
        }
        end = G.findSimpul('E');
        if((begin != null) && (end != null)){
            G.addJalur(begin, end, 7);
        }
        begin = G.findSimpul('C');
        end = G.findSimpul('A');
         if((begin != null) && (end != null)){
            G.addJalur(begin, end, 3);
        }
        begin = G.findSimpul('D');
        if((begin != null) && (end != null)){
            G.addJalur(begin, end, 8);
        }
        end = G.findSimpul('C');
        if((begin != null) && (end != null)){
            G.addJalur(begin, end, 3);
        }
        begin = G.findSimpul('E');
        end = G.findSimpul('D');
        if((begin != null) && (end != null)){
            G.addJalur(begin, end, 4);
        }
        end = G.findSimpul('B');
        if((begin != null) && (end != null)){
            G.addJalur(begin, end, 4);
        }
        begin = G.findSimpul('F');
        end = G.findSimpul('D');
        if((begin != null) && (end != null)){
            G.addJalur(begin, end, 2);
        }
        System.out.println("==========================");
        G.printGraph();
        System.out.println("==========================");
        begin = G.findSimpul('A');
        if(begin != null){
            G.delJalur('B',begin);
            
        }
        System.out.println("==========================");
        System.out.println("setelah dihapus");
        G.printGraph();
        System.out.println("==========================");
            
    }
    
}
