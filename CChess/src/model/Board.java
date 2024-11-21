package model;

public class Board {
    Piece grid[][] = new Piece[8][8];

    public Board(){
        int x,y;
        boolean iswhite = true;
        for(y=0;y<8;y++){
            for(x=0;x<8;x++){
                if(iswhite==true){
                    grid[x][y] = new Piece('w', "empty", false);
                    if(x!=7){
                        iswhite = false;
                    }
                }
                else{
                    grid[x][y] = new Piece('b', "empty", false);
                    if(x!=7){
                        iswhite = true;
                    }
                }
            }
        }
    }

    public void showBoard(){
        int x,y;
        for(y=0;y<8;y++){
            System.out.println("");
            for(x=0;x<8;x++){
                if(grid[x][y].getColor()=='w'){
                    System.out.print(" O ");
                }
                else{
                    System.out.print(" X ");
                }
            }
        }
    }

    public void movePiece(String[] inicial, String[] next){
        Integer x,y;
        x = Integer.parseInt(inicial[0]);
        y = Integer.parseInt(inicial[1]);
        Piece memo = grid[x][y];
        grid[x][y].Empty(memo.getColor());
        x = Integer.parseInt(next[0]);
        y = Integer.parseInt(next[1]);
        grid[x][y] = memo;
    }
}
