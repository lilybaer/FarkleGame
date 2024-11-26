
/**
 * Class used to store information on player
 *
 * @Lily Baer
 * @November 2, 2021
 */

public class Player
{
    private String name;
    private int score;
    private int subtotal;
    private int numTurns;

    /*****************************************************************
     Constructor creates a player object and sets the name to @param n
     and sets instance variables to zero.
     *****************************************************************/
    public Player(String n)
    {
        name = n;
        score = 0;
        subtotal = 0;
        numTurns = 0;
    }

    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    public int getSubtotal(){
        return subtotal;
    }
    
    public int getTurns(){
        return numTurns;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setScore(int s){
        score = s;
    }
    
    public void setSubtotal(int s){
        subtotal = s;
    }
    
    public void setTurns(int t){
        numTurns = t;
    }
    
    public void addToSubtotal(int amt){
        subtotal += amt;
    }

    /*****************************************************************
     Method used to update a player's score. Subtotal is added to score
     and then reset back to 0. Number of turns is increased one turn.
     *****************************************************************/
    public void updateScore(){
        score += subtotal;
        subtotal = 0;
        numTurns++;
    }

    /*****************************************************************
     Method used to start new game, resets all instance variables to
     zero.
     *****************************************************************/
    public void newGame(){
        score = 0;
        subtotal = 0;
        numTurns = 0;
    }
}
