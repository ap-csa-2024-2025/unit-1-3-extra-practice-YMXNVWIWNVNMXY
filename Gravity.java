public class Gravity
{
  public static void main(String[] args)
  {
    final double g = 9.8; // i can change the value of g and time and get no errors
    double time = 23;
    double height = 0.5 * (g * (time * time));
    double velocity = g * time;
    System.out.println("The height of the cliff is " + height + " m.");
    System.out.println("The final velocity of the ball is " + velocity + " m/s");
  }
}