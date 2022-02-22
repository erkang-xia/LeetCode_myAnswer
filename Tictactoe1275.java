class Solution {
    public String tictactoe(int[][] moves) {
        int[] row = new int[3];
        int r;
        int[] col = new int[3];
        int c;
        int dia = 0;
        int reverseDia = 0;
        boolean isA = true; 
        for (int i = 0; i < moves.length ; i++){
            r = moves[i][0];
            c = moves[i][1];
            if (isA) {
                isA = false;
                row[r]++;
                col[c]++;
                if (r == c){
                    dia++;
                }
                if (r + c == 2){
                    reverseDia++;
                }

            }else{
                isA = true;
                row[r]--;
                col[c]--;
                if (r == c){
                    dia--;
                }
                if (r + c == 2){
                    reverseDia--;
                }
                
            }
            if(row[r] == 3 || col[c] == 3 || dia == 3 || reverseDia == 3){
            return "A";
        }else if(row[r] == -3 || col[c] == -3 || dia == -3 || reverseDia == -3){
            return "B";
        }
        }
        
        if (moves.length < 9) return "Pending";

        return "Draw";
        
        
  
    }
}
