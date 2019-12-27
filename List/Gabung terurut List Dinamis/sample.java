public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Elemen bantu1;
		Elemen bantu2;

		List L1 = new List();
		List L2 = new List();
		List L3 = new List();

		System.out.println("List 1");
		L1.createList();
		L1.addFirst("131","Rere","A");
		L1.addAfter(L1.getFirst(),"192","Lopi","E");
		// L1.addAfter(L1.getFirst(),"153","Frea","A");
		L1.addLast("175","Pio","B");
		L1.printElemen();

		System.out.println("\nList 2");
		L2.createList();
		L2.addFirst("413","Ereree","D");
		L2.addAfter(L2.getFirst(),"864","Freas","D");
		// L2.addAfter(L2.getFirst(),"123","Poli","A");
		L2.addLast("512","Popo","B");
		L2.printElemen();

		System.out.println("\nList 3");
		/*Proses gabung terurut*/
		L3.createList();
		bantu1 = L1.getFirst();
		bantu2 = L2.getFirst();

		System.out.println("\nSampah");
		// System.out.println(Integer.valueOf(bantu1.kontainer.nim).getClass().getName());

		// while(bantu2 != null){
		// 	System.out.println(Integer.valueOf(bantu2.kontainer.nim));
		// 	bantu2 = bantu2.getNext();
		// }

		// while((bantu1 != null) && (bantu2 != null)){
		// 	if(Integer.valueOf(bantu1.kontainer.getNim()) <= Integer.valueOf(bantu2.kontainer.getNim())){
		// 		System.out.printf("(%d)bantu1 > bantu2(%d)\n",Integer.valueOf(bantu1.kontainer.nim),Integer.valueOf(bantu2.kontainer.nim));
		// 		bantu1 = bantu1.getNext();
		// 	}else{
		// 		System.out.printf("(%d)bantu1 < bantu2(%d)\n",Integer.valueOf(bantu1.kontainer.nim),Integer.valueOf(bantu2.kontainer.nim));
		// 		bantu2 = bantu2.getNext();
		// 	}
		// 	// bantu1 = bantu1.getNext();
		// 	// bantu2 = bantu2.getNext();
		// }

		while((bantu1 != null) && (bantu2 != null)){
			if(Integer.valueOf(bantu1.kontainer.getNim()) <= Integer.valueOf(bantu2.kontainer.getNim())){
			// if(bantu1.kontainer.getNim().compareTo(bantu2.kontainer.getNim()) <= 0){
				L3.addLast(bantu1.kontainer.getNim(),bantu1.kontainer.getNama(),bantu1.kontainer.getNilai());
				bantu1 = bantu1.getNext();
			}else{
				L3.addLast(bantu2.kontainer.getNim(),bantu2.kontainer.getNama(),bantu2.kontainer.getNilai());
				bantu2 = bantu2.getNext();
			}
		}

		/*Mendeklarasikan pengulangan untuk menambahkan*/
		/*elemen pada L3 dengan data elemen pada sisa elemen list L1*/
		if(bantu1 != null){
			/*Jika list L1 belum mencapai akhir list*/

			while(bantu1 != null){
				L3.addLast(bantu1.kontainer.getNim(),bantu1.kontainer.getNama(),bantu1.kontainer.getNilai());
				bantu1 = bantu1.getNext();
			}
		}


		/*Mendeklarasikan pengulangan untuk menambahkan*/
		/*elemen pada L3 dengan data elemen pada sisa elemen list L2*/
		if(bantu2 != null){
			/*Jika list L2 belum mencapai akhir list*/

			while(bantu2 != null){
				L3.addLast(bantu2.kontainer.getNim(),bantu2.kontainer.getNama(),bantu2.kontainer.getNilai());
				bantu2 = bantu2.getNext();
			}
		}
		L3.printElemen();
		
	}
}