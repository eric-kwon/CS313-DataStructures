
public class q3Main {

	public static void main (String args[]){
		System.out.println("\nQUESTION #3: IMPLEMENT A SKIP LIST CLASS");
		System.out.println("IMPLEMENT SKIPINSERT / SKIPREMOVE / SKIPSEARCH");
		System.out.println("- - - - - - - - - -");
		System.out.println("NOTE: 10 HARDCODED INTEGERS WILL BE INSERTED INTO SKIP LIST");
		System.out.println("- - - - - - - - - -");
		
		skipList newList = new skipList();

		System.out.print("INSERTED: ");
		newList.skipInsert("04",0);
		System.out.print("04, ");
		newList.skipInsert("09",1);
		System.out.print("09, ");
		newList.skipInsert("14",2);
		System.out.print("14, ");
		newList.skipInsert("27",3);
		System.out.print("27, ");
		newList.skipInsert("30",4);
		System.out.print("30, ");
		newList.skipInsert("37",5);
		System.out.print("37, ");
		newList.skipInsert("45",6);
		System.out.print("45, ");
		newList.skipInsert("67",7);
		System.out.print("67, ");
		newList.skipInsert("88",8);
		System.out.print("88, ");
		newList.skipInsert("94",9);
		System.out.print("94");
		
		System.out.println("");
		newList.printSkipList();
		System.out.println("- - - - - - - - - -");
		
		int position = newList.skipSearch("14");
		System.out.println("POSITION OF 14 IS: " + position);
		position = newList.skipSearch("30");
		System.out.println("POSITION OF 30 IS: " + position);
		position = newList.skipSearch("67");
		System.out.println("POSITION OF 67 IS: " + position);
		System.out.println("- - - - - - - - - -");
		
		System.out.println("DISPLAY SKIP LIST AFTER REMOVING 14,30,67");
		newList.skipRemove("14");
		newList.skipRemove("30");
		newList.skipRemove("67");
		newList.printSkipList();
		
		
		
	
	}
}