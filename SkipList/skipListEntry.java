public class skipListEntry 
{
  public String key;			// Key
  public Integer value;			// Value
  public int pos;     			// Position
  public skipListEntry up, down, left, right;

  public static String negInf = new String("-oo"); 
  public static String posInf = new String("+oo");

  public skipListEntry(String k, Integer v) 
  { 
     key = k;
     value = v;

     up = down = left = right = null;
  }

  public Integer getValue() 
  { 
    return value; 
  }

  public String getKey() 
  { return key; 
  }

  public Integer setValue(Integer val) 
  {
    Integer oldValue = value;
    value = val;
    return oldValue;
  }

  public boolean equals(Object o) 
  {
    skipListEntry ent;

    try 
    { 
      ent = (skipListEntry) o; 
    }
    catch (ClassCastException ex) 
    { 
	return false; 
    }

    return (ent.getKey() == key) && (ent.getValue() == value);
  }

  public String toString() 
  {
    return "(" + key + "," + value + ")";
  }
}
