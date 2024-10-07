public class SeaBoat {
  public final String name;
  public final String type;
  public final double length;
  public final double width;
  public final int passangersAmount;

  /**
   * Constructor
   *
   * @param name
   * @param type Cargo or Passanger
   * @param length
   * @param width
   * @param passangersAmount
   */
  public SeaBoat(String name, String type, double length, double width, int passangersAmount) {
    this.name = name;
    this.type = type;
    this.length = length;
    this.width = width;
    this.passangersAmount = passangersAmount;
  }
}
