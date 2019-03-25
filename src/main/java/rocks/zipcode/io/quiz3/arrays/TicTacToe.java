package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this(null);
    }

    public String[] getRow(Integer value) {


        return board[value];
    }

    public String[] getColumn(Integer value) {

        String ans = "";

        for(int i = 0; i < 3; i++){
            ans += board[i][value];
        }

        return ans.split("");
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);


       return isHomogeneous(row);


    }

    public Boolean isHomogeneous(String[] arr){
        String type = arr[0];
        Boolean b = true;
        for(int i = 1; i < arr.length; i++){
            if(!arr[i].equals(type)){
                return false;
            }
        }
        return b;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        String[] column = getColumn(columnIndex);

        return isHomogeneous(column);
    }

    public String getWinner() {
        //im sorry this is ugly

        for(int i = 0; i < 3; i++){

            String[] diagonal1 = {board[0][0],board[1][1],board[2][2]};
            String[] diagonal2 = {board[0][2],board[1][1],board[2][0]};

            if(isRowHomogenous(i)){
                return board[i][i];
            } else if(isColumnHomogeneous(i)){
                return board[i][i];
            } else if(isHomogeneous(diagonal1)){
                return diagonal1[i];
            } else if(isHomogeneous(diagonal2)){
                return diagonal2[i];
            }

        }
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
