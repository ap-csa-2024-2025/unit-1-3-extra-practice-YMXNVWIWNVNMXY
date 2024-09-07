public class Fraction
{
  public static void main(String[] args)
  {
    int nume1 = 1;
    int nume2 = 2;
    int deno1 = 3;
    int deno2 = 4;
    System.out.print("The numerator of the first fraction is " + nume1 + ".");
    System.out.print("The denominator of the first fraction is " + deno1 + ".");
    System.out.print("The numerator of the second fraction is " + nume2 + ".");
    System.out.print("The denominator of the second fraction is " + deno2 + ".");
    int topSum = nume1 + deno1 + nume2 + deno2;
    int bottomSum = deno1 + deno2;
    String frac1 = nume1 + "/" + deno1;
    String frac2 = nume2 + "/" + deno2;
    String sum = (nume1 + nume2) + "/" + (deno1 + deno2);
    //"/"
    System.out.print("The sum of " + frac1 + " + " + frac2 + " = " + sum + "." );
  }
}