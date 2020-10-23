public class Dice
{
  private double diceValue;

  // Constructor
  public Dice()
  {
    diceValue = 0.0;
  }

  public double roll()
  {
    diceValue = Math.random();
    return diceValue;
  };
}