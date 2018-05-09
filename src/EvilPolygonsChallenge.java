import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {


	public static void main(String[] args) {
		
		// 1. Create a robot
		Robot bob = new Robot();
		bob.setWindowSize(2000, 2000);
		int i = 0;
		int j = 0;
		int k = 0;

		// 2. Set the speed to 100
		bob.setSpeed(10);
		int colorChoice = JOptionPane.showOptionDialog(null, "What color would you like?", "Color Choice",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Red", "Green", "Blue" }, 0);
		if (colorChoice == 0) {
			i = 255;
			j = 0;
			k = 0;
		}
		if (colorChoice == 1) {
			i = 0;
			j = 255;
			k = 0;
		}
		if (colorChoice == 2) {
			i = 0;
			j = 0;
			k = 255;
		}
		// 3. Set the pen color of the robot according to the value of the colorChoise
		// variable
		bob.setPenColor(i, j, k);
		// 4. Ask the use how many polygons they want to be drawn.
		String polygon = JOptionPane.showInputDialog("How many polygons do you want drawn?");
		int polygons = Integer.parseInt(polygon);
		// 5. Use the robot to draw the number of polygons the user requested.
		for (int l = 0; l < polygons; l++) {

			bob.penDown();
			bob.setAngle(270);
			bob.move(100);		
			bob.turn(90);
			bob.move(100);
			bob.turn(90);
			bob.move(100);
			bob.turn(90);
			bob.move(100);
			bob.penUp();
			bob.move(150);

			
		}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}

// TODO Auto-generated method stub
