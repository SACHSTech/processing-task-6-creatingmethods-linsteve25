import processing.core.PApplet;

/**
 * Prints rows of houses each with a different color and alternating ice cream cones
 * @author Steve Lin
 */

public class Sketch extends PApplet {
	
  /**
   * Setup size plane
   */
  public void settings(){
    size(400, 250);
  }

  /**
   * Setup background color
   */
  public void setup(){
    background(88, 168, 50);
  }
  
  /**
   * Creating the house 
   * @param inHouseX shifts the object to the right
   * @param intHouseY shifts the object down
   */
  public void createHouse(int intHouseX, int intHouseY){

    // print the doorknob
    square(intHouseX + 55, intHouseY + 60, 5);
    
    // print the tirangular roof of the house
    triangle(intHouseX + 52, intHouseY + 20, intHouseX + 40, intHouseY + 40, intHouseX + 64, intHouseY + 40);

    // print the body of thee house
    rect(intHouseX + 40, intHouseY + 40, 24, 25);

    fill(88, 168, 50);
  }

  /**
   * Creating the ice cream cone
   * @param intIceCreamX the x values of the ice cream cone
   * @param intIceCreamY the y values of the ice cream cone
   */
  public void iceCreamCone(int intIceCreamX, int intIceCreamY){

    // print the cone and its color
    stroke(92, 64, 22);
    triangle(intIceCreamX + 21, intIceCreamY, intIceCreamX + 33 , intIceCreamY, intIceCreamX + 27, 30 + intIceCreamY);

    // print the first ice cream scoop and its color
    stroke(255, 255, 255);
    circle(intIceCreamX + 27, intIceCreamY - 5, 12);

    // print the second ice cream scoop and its color
    stroke(255, 255, 255);
    circle(intIceCreamX + 27, intIceCreamY - 15, 12);

  }

  /**
   * Draws houses using for loops with adjustable colors via parameters
   * @param intColumn shifts the object down 
   * @param firstColor the red color code 
   * @param secondColor the green color code
   * @param thirdColor the blue color code
   */
  public void houseColor(int intColumn, int firstColor, int secondColor, int thirdColor){

    stroke(firstColor, secondColor, thirdColor);
    
    // set int i to -50
    int i = -50;

    // while loop that prints repating houses in a row
    while (i < 300){

      // if statement to set restrictions on the amount of houses being print
      if (i < 300){
        i+=50;
      }
      // else statement to end the if statment and print out the house
      else{
        break;
      }
      createHouse(i, intColumn);
    }

  }

  /**
   * Calling the methods to print out the objects
   */
   public void draw(){
    
    // for loop that prints the columns of ice cream cones
      for (int i = 1; i < 5; i++) {
        // if statements if the row is an even number
        if (i % 2 == 0){
          // for loop that assigns parameters to iceCreamCone
          for (int row = 50; row < 300; row +=100){
            iceCreamCone(row, i * 50);
          }
        }
        // else statment of the row is an odd number
        else{
          // for loop that assigns parameters to iceCreamCone
          for (int row = 50; row < 300; row += 100){
            iceCreamCone(row + 50, i * 50);
          }
        }
      }

    // make the houses yellow and shift houses 0 units down
    houseColor(0, 255, 255, 0);

    // make the houses orange and shift houses 50 units down
    houseColor(50, 255, 165, 0);

    // make the houses red and shift houses 100 units down
    houseColor(100, 255, 0, 0);

    // make the houses light blue and shift houses 150 units down 
    houseColor(150, 173, 216, 230);
    
  }
}