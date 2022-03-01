import javax.swing.*;

public class TestClass5026211001 {
    public static void main(String[] args) {
        
        String degreeF, a, b;
        int intA, intB, diceRoll;
        double douDegreeF, degreeC, hypo;

        degreeF = JOptionPane.showInputDialog(null, "Type the temperature here! (Fahrenheit)" , "Temperature Converter", 3);
        douDegreeF = Double.parseDouble(degreeF);
        ComputeMethods5026211001 cm = new ComputeMethods5026211001();
        degreeC = cm.fToC(douDegreeF);
        JOptionPane.showMessageDialog(null, "Temperature in celcius is " +degreeC+"\u00B0C", "Temperature Converter", 1);

        a = JOptionPane.showInputDialog(null, "Type side length of a triangle! (cm)", "Hypotenuse Calculator", 3);
        intA = Integer.parseInt(a);
        b = JOptionPane.showInputDialog(null, "Type another side length! (cm)", "Hypotenuse Calculator", 3);
        intB = Integer.parseInt(b);
        hypo = cm.hypotenuse(intA, intB);
        JOptionPane.showMessageDialog(null, "Hypotenuse is " +hypo+ "cm\u00B2", "Hypotenuse Calculator", 1);

        diceRoll = cm.roll();
        JOptionPane.showMessageDialog(null, "The sum of the dice values is " +diceRoll+ ".");
    }
    
}
