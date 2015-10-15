import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.SortedMap;

public class TextAnalyse {
    private static SortedMap<String, ArrayList<Integer>> map;
    private static Integer line;
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
           if (c == '\n')
           {
             ++line;
           }
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
    	   BufferedReader f=new BufferedReader(new FileReader("TextAnalyse.class"));
    	   String s;
         map = new TreeMap<String, ArrayList<Integer>>();
         line = 1;

           while ((s=TextAnalyse.readWord(f))!=null) {
        	  if (map.containsKey(s))
        	  {
              ArrayList<Integer> l = map.get(s);
              l.add(line);
        	    map.put(s, l);
        	  }
            else
            {
              map.put(s, new ArrayList<Integer>());
              (map.get(s)).add(line);
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
