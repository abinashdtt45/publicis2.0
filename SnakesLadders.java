public class SnakesLadders {
    private int p1;
    private int p2;
    private boolean p1Turn;
    
    public SnakesLadders() {
      p1 = 0;
      p2 = 0;
      p1Turn = true;
    }
    
    public String play(int die1, int die2) {
      if(p1 == 100 || p2 == 100){
        return "Game over!";
      }
      
      if(p1Turn){
        p1 = checkSquare(p1 + die1 + die2);
        
        if (die1 != die2){
          p1Turn = false;
        }
        
        if (p1 == 100){
          return "Player 1 Wins!";
        }
        
        return "Player 1 is on square " + p1;
      }
      p2 = checkSquare(p2 + die1 + die2);
        
      if (die1 != die2){
        p1Turn = true;
      }
      
      if (p2 == 100){
        return "Player 2 Wins!";
      }
        
      return "Player 2 is on square " + p2;
    }
      
    private int checkSquare(int pos){
      //Ladders
      if (pos == 2){return 38;}
      if (pos == 7){return 14;}
      if (pos == 8){return 31;}
      if (pos == 15){return 26;}
      if (pos == 21){return 42;}
      if (pos == 28){return 84;}
      if (pos == 36){return 44;}
      if (pos == 51){return 67;}
      if (pos == 71){return 91;}
      if (pos == 78){return 98;}
      if (pos == 87){return 94;}
      
      //Snakes
      if (pos == 16){return 6;}
      if (pos == 46){return 25;}
      if (pos == 49){return 11;}
      if (pos == 62){return 19;}
      if (pos == 64){return 60;}
      if (pos == 74){return 53;}
      if (pos == 89){return 68;}
      if (pos == 92){return 88;}
      if (pos == 95){return 75;}
      if (pos == 99){return 80;}
      
      //Overshoot
      if(pos > 100){
        return checkSquare(100 - (pos - 100));
      }
      
      //Regular square
      return pos;
    }
}