public class Game {

  public static void main(String[] args) {

    GamePiece myQueen = new GamePiece(1, 2, false, "queen", "black", "daniel");

    myQueen.printCoordinates();
    myQueen.move(1,2);
    myQueen.freeze();
    myQueen.move(-2,-3);
    myQueen.unfreeze();
    myQueen.move(5,10);
  }
}