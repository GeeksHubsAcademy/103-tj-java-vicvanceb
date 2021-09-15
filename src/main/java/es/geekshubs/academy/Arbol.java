package es.geekshubs.academy;

public class Arbol {

  /**
   * Apply Method
   * @param input
   * @return
   */
  public String apply(final Integer input) {
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i <= input; i++) {
          for (int j = input; j >= 1; j--) {
              if (j <= i) {
                  sb.append('*');
              } else {
                  sb.append(' ');
              }
          }
          sb.append('\n');
      }
      return sb.toString();
  }

}
