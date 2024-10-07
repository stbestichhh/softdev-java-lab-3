import java.util.Arrays;

public class Lab3 {

  public static void main(String[] args) {
    SeaBoat[] boats = new SeaBoat[]{
      new SeaBoat("Boat1", "Cargo", 2.0, 3.0, 30),
      new SeaBoat("Boat2", "Passanger", 1.0, 2.0, 100),
      new SeaBoat("Boat3", "Cargo", 1.0, 3.0, 20),
      new SeaBoat("Boat4", "Passanger", 4.0, 2.0, 250),
      new SeaBoat("Boat5", "Cargo", 1.0, 1.0, 10),
    };

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

  private static void printArray(SeaBoat[] boats) {
    for (SeaBoat boat : boats) {
      System.out.println(boat.name + " length: " + boat.length + " passangers amount: " + boat.passangersAmount);
      System.out.println();
    }
  }

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
