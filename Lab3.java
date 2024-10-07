import java.util.Arrays;

public class Lab3 {

  /**
   * @param args Programm command line arguments (not used)
   */
  public static void main(String[] args) {
    SeaBoat[] boats = new SeaBoat[]{
      new SeaBoat("Boat1", "Cargo", 2.0, 3.0, 30),
      new SeaBoat("Boat2", "Passanger", 1.0, 2.0, 100),
      new SeaBoat("Boat3", "Cargo", 1.0, 3.0, 20),
      new SeaBoat("Boat4", "Passanger", 4.0, 2.0, 250),
      new SeaBoat("Boat5", "Cargo", 1.0, 1.0, 10),
    };

    // Sort boats array by it's length in increasing order and by it's passangers amount in decreasing order
    Arrays.sort(boats, (boat1, boat2) -> {
      int lengthCompare = Double.compare(boat1.length, boat2.length);

      if (lengthCompare != 0) {
        return lengthCompare;
      }

      return Integer.compare(boat2.passangersAmount, boat1.passangersAmount);
    });

    printArray(boats);
    findEqualBoat(boats, new SeaBoat("TargetBoat", "Cargo", 2.0, 3.0, 30));
  }

  /**
   * Prints all boats from SeatBoat array
   *
   * @param boats all boats array
   * @return void
   */
  private static void printArray(SeaBoat[] boats) {
    for (SeaBoat boat : boats) {
      System.out.println(boat.name + " length: " + boat.length + " passangers amount: " + boat.passangersAmount);
      System.out.println();
    }
  }

  /**
   * Compares target boat properties with properties of each boat in boats array and then return the same boat as target one
   *
   * @param boats array of all boats
   * @param targetBoat boat to compate properties of boat from array with
   * @return void
   */
  private static void findEqualBoat(SeaBoat[] boats, SeaBoat targetBoat) {
    SeaBoat foundBoat = null;

    for (SeaBoat boat : boats) {
      if (boat.length == targetBoat.length &&
          boat.type == targetBoat.type &&
          boat.width == targetBoat.width &&
          boat.passangersAmount == targetBoat.passangersAmount) {
        foundBoat = boat;
        break;
      }
    }

    if (foundBoat != null) {
      System.out.println("Same boat as " + targetBoat.name + " found in array: " + foundBoat.name);
    } else {
      System.out.println("Not found same boat as " + targetBoat.name);
    }
  }
}
