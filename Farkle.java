
/**
 * Farkle functionality.
 *
 * @Lily Baer
 * @November 4, 2021
 */
public class Farkle
{
    private Player currplayer = new Player();
    private Object[] dice = new Object[6];
    private int[] tally = new int[7];
    private static final int WINNING_SCORE = 10000;
    private static final int STRAIGHT = 3000;
    private static final int THREE_PAIRS = 1500;
    private static final int FOUR_OF_A_KIND = 1300;
    private static final int FIVE_OF_A_KIND = 2000;
    private static final int SIX_OF_A_KIND = 3000;
    private static final int THREE_ONES = 1000;
    private static final int THREE_TWOS = 200;
    private static final int THREE_THREES = 300;
    private static final int THREE_FOURS = 400;
    private static final int THREE_FIVES = 500;
    private static final int THREE_SIXES = 600;
    private static final int ONES = 100;
    private static final int FIVES = 50;

    public Farkle()
    {
        dice = new GVdie[6];
        for(int i = 0; i < dice.length(); ++i){
            dice[i]= new GVdie();
            
        }
        tally = new int[7];
        currplayer.setName("Lily");
        resetGame();
    }

    public Player getActivePlayer(){
        return currplayer;
    }
    
    public boolean gameOver(){
        if(currplayer.getScore() >= WINNING_SCORE){
            return true;
        }
        else{
            return false;
        }
    }
    
    public GVdie[] getDice(){
        return dice[];
    }
    
    private void tallySelectedDice(){
        for(int i = 0; i < tally.length; ++i){
            tally[i] = 0;
        }
        
        if(dice.isSelected()){
            for(int i = 0; i < dice.length; ++i) {
                int val = dice[i].getValue();
                if (val = 1) {
                    tally[1]++;
                } else if (val = 2) {
                    tally[2]++;
                } else if (val = 3) {
                    tally[3]++;
                } else if (val = 4) {
                    tally[4]++;
                } else if (val = 5) {
                    tally[5]++;
                } else {
                    tally[6]++;
                }
            }
        }
    }

    private void tallyUnscoredDice(){
        for(int i = 0; i < tally.length; ++i){
            tally[i] = 0;
        }
        if(!dice.isScored()){
            for(int i = 0; i < dice.length; ++i) {
                int val = dice[i].getValue();
                if (val = 1) {
                    tally[1]++;
                } else if (val = 2) {
                    tally[2]++;
                } else if (val = 3) {
                    tally[3]++;
                } else if (val = 4) {
                    tally[4]++;
                } else if (val = 5) {
                    tally[5]++;
                } else {
                    tally[6]++;
                }
            }
        }
    }

    private boolean wereDiceSelected(){
        for(int i = 0; i < dice.length; ++i){
            if(dice[i].isSelected()){
                return true;
            }
        }
    }

    private boolean hasStraight() {
        for(int i = 1; i < tally.length; ++i) {
            if (tally[i] = 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean hasThreePairs(){
        int pairs = 0;
        int four = 0;
        for(int i = 1; i < tally.length; ++i){
            if(tally[i]==2){
                pairs++;
            }
            if(tally[i]==4){
                four++;
            }
        }
        if(pairs >= 3){
            return true;
        }
        else if(pairs == 1 && four ==1){
            return true;
        }
        else{
            return false;
        }
    }

    private boolean hasMultiples(int numberTimes){
        for(int i = 1; i < tally.length; ++i){
            if(tally[i] == numberTimes){
                return true;
            }
        }
    }

    private void diceSelectedToScored(){
        for(int i = 0; i < dice.length; ++i){
            if(dice.isSelected()){
                dice[i].setScored(true);
            }
        }
    }

    private void nextTurn(){
        for(int i = 0; i < dice.length; ++i){
            dice[i].setBlank();
            dice[i].setSelected(false);
            dice[i].setScored(false);
        }
    }

    public void resetGame(){
        currplayer.newGame();
        currplayer.nextTurn();
    }

    public void scoreSelectedDice() {
        currplayer.tallySelectedDice();
        if(hasStraight(true)){
            subtotal += STRAIGHT;
        }
        if(hasThreePairs(true)){
            subtotal += THREE_PAIRS;
        }
        if(tally[1] == 3){
            subtotal += THREE_ONES;
        }
        if(tally[2] == 3){
            subtotal += THREE_TWOS;
        }
        if(tally[3] == 3){
            subtotal += THREE_THREES;
        }
        if(tally[4] == 3){
            subtotal += THREE_FOURS;
        }
        if(tally[5] == 3){
            subtotal += THREE_FIVES;
        }
        if(tally[6] == 3){
            subtotal += THREE_SIXES;
        }

        for(i = 1; i < tally.length; ++i){
            if(tally[i] == 4){
                subtotal += FOUR_OF_A_KIND;
            }
            else if(tally[i] == 5){
                subtotal += FIVE_OF_A_KIND;
            }
            else if(tally[i] == 6){
                subtotal += SIX_OF_A_KIND;
            }
        }
    }

    public void rollDice(){
        currplayer.scoreSelectedDice();
        for(i = 0; i < dice.length; ++i){
            if (dice[i].isScored(true)) {

            }
            if(dice[i].isScored(false)){
                dice[i].roll();
            }
        }

    }

    public void passDice(){
        scoreSelectedDice();
        currplayer.updateScore();
        nextTurn();
    }

    public void setAllDice(int [] values){
        for(i = 0; i < values.length; ++i){
            if(values[i]>6){
                values[i] = 1;
            }
        }
        for(i = 0; i < dice.length; ++i){
            while(dice[i] != values[i]){
                dice[i].roll();
            }
        }
    }

    public void selectDie(int id){
        dice[id-1].setSelected(true);
    }

    public String diceToString(){
        return dice.toString();
    }
}
