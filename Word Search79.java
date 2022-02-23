class Solution{

    boolean isFound = false;
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == word.charAt(0) && !isFound){
                    boolean[][] isUsed = new boolean[board.length][board[0].length];
                    helper(isUsed, 0, i,j, board,word);
                }
            }
        }

        return isFound;

    }

    private void helper(boolean[][] isUsed, int index, int i, int j, char[][] board,String word) {
        if (isFound) return;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || isUsed[i][j] || word.charAt(index) != board[i][j]) return;

        if (index == word.length() - 1){
            isFound = true;
            return;
        }
        isUsed[i][j] = true;
        index++;

        helper(isUsed,index,i-1, j,board, word);
        helper(isUsed,index,i+1, j,board, word);
        helper(isUsed,index,i, j-1,board, word);
        helper(isUsed,index,i, j+1,board, word);

        isUsed[i][j] = false;
    }

}
