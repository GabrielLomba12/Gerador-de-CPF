import javax.swing.JOptionPane;
import controler.Creator;
import controler.Verifier;

public class App {
    public static void main(String[] args) throws Exception {
        
        String num = JOptionPane.showInputDialog(null,"Digite 1 para criar um CPF \n ou\n Digite 2 para verificar");
        int numInt = Integer.parseInt(num); 
            
        if(numInt == 1){
            Creator creator = new Creator();
        
        }else if(numInt == 2){
            Verifier verifier = new Verifier();

        }else{
            JOptionPane.showMessageDialog(null,"Opção inválida");
        }

    }
}                              