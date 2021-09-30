import java.util.Arrays;
public class Sortstring 
{    
   private static String[] strngs = {"Rose", "lilly", "lotus", "jasmine", "Dahlia", "Marygold", "Hibiscus", "Sunflower", "Tulip"};
    
    public enum sort{
       ASC, DESC
   }
    
       public static void main(String[] args) {
       System.out.println("\nUnsorted order: " + Arrays.toString(strngs));
       sort_array_by_length(strngs, sort.ASC);
	   System.out.println("\nSorted order (ascending order): " + Arrays.toString(strngs)); 
	   sort_array_by_length(strngs, sort.DESC);
       System.out.println("\nSorted order (descending order): " + Arrays.toString(strngs));
                 
   }
   public static void sort_array_by_length(String[] strngs, sort direction) {
      
       if (direction.equals(sort.ASC)) {
           Arrays.sort(strngs, (String str1, String str2)
                   -> Integer.compare(str1.length(), str2.length()));
       } else if (direction.equals(sort.DESC)) {
           Arrays.sort(strngs, (String str1, String str2)
                   -> (-1) * Integer.compare(str1.length(), str2.length()));
       }
   }
}
