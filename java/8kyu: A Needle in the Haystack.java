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

/*
Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle

So

findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
should return

"found the needle at position 5"
*/
