public class PlayerPiece {
    private BoardSquare currentPosition;
    

    private String color;

    public PlayerPiece(String color){
        setColor(color);
    }

    //Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Methods to move the player piece in board -> boardsquare 
    public void moveTo(BoardSquare newPosition){
        newPosition.movePlayerPiece(this);
    }

    public BoardSquare getCurrentPosition() {
        return currentPosition;
    }
    

    public void setCurrentPosition(BoardSquare newPosition){
        this.currentPosition = newPosition;
    }
}
