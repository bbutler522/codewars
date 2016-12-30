public class Kata {
  public static String findNeedle(Object[] haystack) {
    int position = 0;
      for(int x = 0; x < haystack.length; x++) {
        if (haystack[x] == "needle") {
          position = x;
          break;
        }
      }
    return "found the needle at position " + position;
  }
}
