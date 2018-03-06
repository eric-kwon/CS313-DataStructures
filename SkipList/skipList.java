import java.util.*;


public class skipList {
	
  public skipListEntry head;    // Head
  public skipListEntry tail;  	// Tail
  public int n;					// # of Entries
  public int h;      		 	// Height
  public Random r;   		 	// Promotion chance

  public skipList() {
	  
     skipListEntry p1, p2;

     p1 = new skipListEntry(skipListEntry.negInf, null);
     p2 = new skipListEntry(skipListEntry.posInf, null);

     head = p1;
     tail = p2;
     p1.right = p2;
     p2.left = p1;
     n = 0;
     h = 0;
     r = new Random();
  }

  public int size() { 
    return n; 
  }

  public boolean isEmpty() { 
    return (n == 0); 
  }

  public skipListEntry findEntry(String k) {
	  
     skipListEntry p;
     p = head;

     while ( true ) {

        while ( p.right.key != skipListEntry.posInf && p.right.key.compareTo(k) <= 0 ) {
        	
           p = p.right;
        }
	if ( p.down != null ) {
           p = p.down;
        }
        else break;	
     }
     return(p);     
  }

  public Integer skipSearch (String k) {
	  
     skipListEntry p;
     p = findEntry(k);
     if ( k.equals( p.getKey() ) )
        return(p.value);
     else
        return(null);
  }
  
  public void skipRemove (String k) {
	  
	  skipListEntry p;
	  p = findEntry(k);
	  
	  if (p.key != k)
		  return;
	  
	  while (p != null){
		  p.left.right = p.right;
		  p.right.left = p.left;
		  p = p.up;
	  }
  }
  
  public skipListEntry insertAfter(skipListEntry p, skipListEntry q, String k) {
	  
     skipListEntry e;
     e = new skipListEntry(k, null);

     e.left = p;
     e.right = p.right;
     e.down = q;
     p.right.left = e;
     p.right = e;
     q.up = e;

     return(e);
  }

  public Integer skipInsert (String k, Integer v) {
	  
     skipListEntry p, q;
     int i;
     p = findEntry(k);

     if (k.equals(p.getKey())) {    	 
        Integer old = p.value;
        p.value = v;
    	return(old);
     }

     q = new skipListEntry(k, v);
     q.left = p;
     q.right = p.right;
     p.right.left = q;
     p.right = q;
     i = 0; 

     while ( r.nextDouble() < 0.5 ) {

        if ( i >= h ) {
        	
           skipListEntry p1, p2;
           h = h + 1;
           
           p1 = new skipListEntry(skipListEntry.negInf,null);
           p2 = new skipListEntry(skipListEntry.posInf,null);
   
           p1.right = p2;
           p1.down  = head;
           p2.left = p1;
           p2.down = tail;
           head.up = p1;
           tail.up = p2;
           head = p1;
           tail = p2;
	}

	while ( p.up == null ) {
		
		p = p.left;
	}
	p = p.up;
   	skipListEntry e; 		 
   	e = new skipListEntry(k, null);
   	e.left = p;
   	e.right = p.right;
   	e.down = q;
   	p.right.left = e;
   	p.right = e;
   	q.up = e;
   	q = e;	
    i = i + 1;	
    }
    n = n + 1;
    return(null);
    }

  public void printSkipList() {
	  
     String s = "";
     int i;
     skipListEntry p;
     p = head;
     
     while ( p.down != null ) {
        p = p.down;
     }
     
     i = 0;
     
     while ( p != null ) {
        p.pos = i++;
        p = p.right;
     }

     p = head;

     while ( p != null ) {
        s = getOneRow( p );
        System.out.println(s);
        p = p.down;
     }
  }

  public String getOneRow(skipListEntry p) {
	  
     String s;
     int a, b, i;
     a = 0;
     s = "" + p.key;
     p = p.right;

     while ( p != null ) {
    	 
        skipListEntry q;
        q = p;
        while (q.down != null)
        q = q.down;
        b = q.pos;
        s = s + " -";
        
        for (i = a+1; i < b; i++){
           s = s + "-----";
        }
 
        s = s + " " + p.key;
        a = b;
        p = p.right;
     }
     return(s);
  }
} 
