package kelasQueueStatis;

class NilaiMatkul{
	String nim;
	String nama;
	double nilai;

	NilaiMatkul(){

	}
}

class Queue{
	private int first;
	private int last;
	private NilaiMatkul[] data = new NilaiMatkul[10];

	Queue(){
		for(int i=0; i<9; i++){
			data[i] = new NilaiMatkul();
		}
	}

	void createEmpty(){
		first = -1;
		last  = -1;
	}
	/*--------------------------------------------------------------------------------------*/
	boolean isEmpty(){
		boolean hasil;

		hasil = false;
		if(first == -1){
			hasil = true;
		}
		return hasil;
	}
	/*--------------------------------------------------------------------------------------*/
	boolean isFull(){
		boolean hasil;

		hasil = false;
		if(last == 9){
			hasil = true;
		}
		return hasil;
	}
	/*--------------------------------------------------------------------------------------*/
	void addQ(String nim, String nama, double nilai){
		if(isEmpty() == true){
			first = 0;
			last = 0;
			data[0].nim = nim;
			data[0].nama = nama;
			data[0].nilai =nilai;
		}else{
			if(isFull() != true){
				last = last + 1;
				data[last].nim = nim;
				data[last].nama = nama;
				data[last].nilai = nilai;
			}else{
				System.out.println("Queue penuh");
			}
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delQ(){
		int i;

		if(last == 0){
			first = -1;
			last  = -1;
		}else{
			for(i=(first+1); i<=last; i++){
				data[i-1].nim = data[i].nim;
				data[i-1].nama = data[i].nama;
				data[i-1].nilai = data[i].nilai;
			}
			last = last - 1;
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void printQueue(){
		int i;

		if(first != -1){
			for(i=last; i>=first; i--){
				System.out.println("Antrian ke : "+i);
				System.out.println("Nim   : "+data[i].nim);
				System.out.println("Nama  : "+data[i].nama);
				System.out.println("Nilai : "+data[i].nilai);
				System.out.println();
			}
		}else{
			System.out.println("Queue kosong");
		}
	}
}

public class Main{
	public static void main(String[] args) {
		Queue Q = new Queue();

		Q.createEmpty();
		Q.addQ("131","Dera",54);
		Q.addQ("412","Zera",90);
		Q.addQ("642","Lopo",71);
		Q.printQueue();

		System.out.println("--------------------------");
		Q.delQ();
		// Q.delQ();
		Q.printQueue();
	}
}