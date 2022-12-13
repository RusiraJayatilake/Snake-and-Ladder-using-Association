public class Ladder {
    private BoardSquare top;


    public Ladder(BoardSquare top, BoardSquare foot){
        setTop(top);
        foot.addLadder(this);
    }


    public BoardSquare getTop() {
        return top;
    }

    public void setTop(BoardSquare top) {
        this.top = top;
    }

    public void movePlayerPiece(PlayerPiece counter){
        System.out.println("Up the ladder to " + getTop().getPosition());
        counter.setCurrentPosition(getTop());
    }
    
    
    
}
