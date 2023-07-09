package controler;
import java.util.Random;
import javax.swing.JOptionPane;

public class Creator {

    public static int[] cpf = new int[11];
    public static int digitOne,digitTwo,plus,rest;
    
    public static void Creator1(){
        Random random = new Random();
        for (int i = 0; i < 9; i++){
            cpf[i] = random.nextInt(9);
            
        }
            
      plus = (cpf[0] * 2 + cpf[1] * 3 + cpf[2] * 4 + cpf[3] * 5 + cpf[4] * 6 + cpf[5] * 7 + cpf[6] * 8 + cpf[7] * 9 + cpf[8] * 10)/11;
     rest = plus % 11;
        
        if(rest < 2){
        digitOne = 0;

        } else {
        digitOne = 11 - rest;
        }

    }

    public static void Creator2(){

            
         plus = (cpf[0] * 2 + cpf[1] * 3 + cpf[2] * 4 + cpf[3] * 5 + cpf[4] * 6 + cpf[5] * 7 + cpf[6] * 8 + cpf[7] * 9 + cpf[8] * 10)/11;
         rest = plus % 11;
        
        if(rest < 2){
            digitTwo = 0;

        } else {
            digitTwo = 11 - rest;
        }

    }
    
    public  Creator(){
        JOptionPane.showMessageDialog(null, cpf[0]+""+cpf[1]+""+cpf[2]+""+cpf[3]+""+cpf[4]+""+cpf[5]+""+cpf[6]+""+cpf[7]+""+cpf[8]+""+digitOne+""+digitTwo);
    }
    
}
