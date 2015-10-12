import java.io.*;
import java.util.TreeMap;
import java.util.SortedMap;

public class TextAnalyse {
    private static SortedMap<String, Integer> map;
    private static boolean isLetter(char c) {
       return ( (('a' <= c) && (c <= 'z')) ||
                (('A' <= c) && (c <= 'Z')) ||
                (c=='ß') ||
                (c=='ä') || (c=='ö') || (c=='ü') ||
                (c=='Ä') || (c=='Ö') || (c=='Ü')
              );
    }
	
    private static String readWord(BufferedReader f) throws IOException {
       String s= new String();
       char c;
       int ci;
       // wait for next letter
       do {ci=f.read();
           c=(char)ci;
          } while (!isLetter(c) && (ci!=-1));
       // wait for end of word
       while (isLetter(c)) {
    	  s += c;
    	  ci=f.read();
    	  c=(char)ci;
       }
       if (s.length()==0)
    	 return null;
       else
    	 return s;
    }
    
    public static void main(String[] args) {
      try {	
    	   BufferedReader f=new BufferedReader(new FileReader("Beispieltext.txt"));
    	   String s;
         map = new TreeMap<String, Integer>();

           while ((s=TextAnalyse.readWord(f))!=null) {
        	  if (map.containsKey(s))
        	  {
              int n = map.get(s);
        	    map.put(s, ++n);
        	  }
            else
            {
              map.put(s, 1);
            }
           }
          } catch (IOException e) {
               System.out.println("Fehler beim Lesen der Datei:" +e.getMessage());	
          }

      // Ausgabe
      for (String s: map.keySet())
      {
        System.out.println(s + ": " + map.get(s));
      }
    }
}
