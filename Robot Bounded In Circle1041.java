class Solution {
    public boolean isRobotBounded(String instructions) {
            int turned = 0;
            int x = 0;
            int y = 0;
            for (char c : instructions.toCharArray()){
                if (c == 'L'){
                    turned--;
                }
                if(c == 'R'){
                    turned++;
                }
                if(c == 'G'){
                    if(turned / 2 % 2 == 1 || turned / 2 % 2 == -1){
                        y--;
                    }else if (turned / 2 % 2 == 0){
                        y++;
                    }else if ((turned + 1)/2 % 2 == 1 || (turned + 1) / 2 % 2 == -1){
                        x++;
                    }else if ((turned + 1) / 2 % 2 == 0){
                        x--;
                    }
                }


            }
            if (turned % 4 !=0 || (x== 0 && y == 0)){
                return true;
            }
            return false;
        }
}
