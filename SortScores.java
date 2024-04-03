public class SortScores {
   public static <T extends Comparable<T>> T mScore(T scr1, T scr2, T scr3) {
      T matchScore = scr1;
      if (scr2.compareTo(matchScore) > 0) {
         matchScore = scr2;
      }
      if (scr3.compareTo(matchScore) > 0) {
         matchScore = scr3;
      }
      return matchScore;
   }

   public static void main(String[] args) {
      // Example usage of mScore method
      int intScore = mScore(27, 89, 15);
      System.out.println("Highest integer score: " + intScore);

      char charScore = mScore('d', 'e', 'f');
      System.out.println("Highest character score: " + charScore);
   }
}
