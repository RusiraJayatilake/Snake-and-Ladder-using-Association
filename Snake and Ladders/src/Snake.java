public class Snake {
    private BoardSquare tail;

    public Snake(BoardSquare head, BoardSquare tail){
        setTail(tail);
        head.addSnake(this);
    }

    //Getter and Setter
    public void setTail(BoardSquare tail) {
        this.tail = tail;
    }
    public BoardSquare getTail() {
        return tail;
    }

    public void movePlayerPiece(PlayerPiece counter){
        System.out.println("Up the ladder to " + getTail().getPosition());
        counter.setCurrentPosition(getTail());
    }
}
