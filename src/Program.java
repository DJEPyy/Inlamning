import javax.swing.*;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Plant> myPlants = List.of(
        new Palm("Laura", 5),
        new Palm("Putte", 1),
        new Cactus("Igge", 0.2),
        new Carnivore("Meatloaf", 0.7));

    String selectedPlantName = (String) JOptionPane.showInputDialog(
        null,
        "Välj vilken växt du vill mata",
        "Välj växt",
        JOptionPane.QUESTION_MESSAGE,
        null,
        myPlants.stream().map(plant -> plant.getName()).toArray(),
        myPlants.get(0).getName());

    Plant selectedPlant = myPlants.stream()
          .filter(plant -> plant.getName().equals(selectedPlantName))
          .findFirst()
          .orElseThrow();

      JOptionPane.showMessageDialog(null, selectedPlant.getFeedingInstructions());
  }
}

