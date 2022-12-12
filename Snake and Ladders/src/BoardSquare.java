public class BoardSquare {
    private Snake aSnake = null;
    private Ladder aLadder = null;
    private int position;


    public BoardSquare(int position){
        setPosition(position);
    }

    //Getter and setter
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    //Methods to add ladders and snakes
    public void addSnake(Snake s){
        aSnake = s;
    }

    public void addLadder(Ladder l){
        aLadder = l;
    }

    //Method to find out if the square has a ladder or a snake
    private boolean hasSnake(){
        return null != aSnake;
    }
    private boolean hasLadder(){
        return null != aLadder;
    }

    public void movePlayerPiece(PlayerPiece counter){
        counter.setCurrentPosition(this);
        if(hasSnake()){
            aSnake.movePlayerPiece(counter);
        }
        if(hasLadder()){
            aLadder.movePlayerPiece(counter);
        }
    }

    
}
