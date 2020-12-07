public class XYBalance {
/*

We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
 */

  //str.indexOf('x') == -1 means that there is no x in the String.
  public boolean xyBalance(String str) {

    return (str.indexOf('x') == -1 || str.lastIndexOf('x') < str.lastIndexOf('y'));
  }
}
