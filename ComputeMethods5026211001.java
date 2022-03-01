import java.util.Random;

public class ComputeMethods5026211001 {
    
    public double fToC (double degreeF) { 
        double degreeC = 5.0/9* (degreeF-32);
        return degreeC;
    }

    public double hypotenuse (int a, int b) {
        double hypo = Math.sqrt((Math.pow(a, 2)) + (Math.pow(a, 2)));   
        return hypo;
    }

    public int roll() {
        Random dice = new Random();
        int diceRoll = dice.nextInt(12)+1;
        return diceRoll;
    }
}   
