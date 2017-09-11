/**
 * Created by daxxon on 9/11/17.
 */
public class GamePiece {

  private int xPosition;
  private int yPosition;
  private boolean frozen;
  private String name;
  private String color;
  private String owner;

  public GamePiece(int xPosition, int yPosition, boolean frozen, String name, String color, String owner) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.frozen = frozen;
    this.name = name;
    this.color = color;
    this.owner = owner;
  }

  public void move (int moveX, int moveY) {
    if (!this.frozen) {
      this.xPosition += moveX;
      this.yPosition += moveY;
    }
    printCoordinates();
  }

  public void freeze () {
    this.frozen = true;
  }

  public void unfreeze () {
    this.frozen = false;
  }

  public void printCoordinates () {
    System.out.println("x position is: " + this.xPosition);
    System.out.println("y position is: " + this.yPosition);
  }
}
