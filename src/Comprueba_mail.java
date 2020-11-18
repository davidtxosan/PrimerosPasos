import javax.swing.JOptionPane;


public class Comprueba_mail {

	public static void main(String[] args) {
		
		int arroba=0;
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("introduce tu mail");
		
		for(int i=0;i<mail.length();i++){
			
			if(mail.charAt(i)=='@'){
				
				arroba++;
			}
			if(mail.charAt(i)=='.'){
				
				punto=true;
			}
			
			
		}
		if (arroba==1 && punto==true){
			
			JOptionPane.showMessageDialog(null, "El mail es correcto.");
			//System.out.println("el mail es correcto");
			
		}
		else{
			
			
			JOptionPane.showMessageDialog(null, "Escriba nuevamente su mail.",
				    "Error!", JOptionPane.ERROR_MESSAGE);
			//System.out.println("el mail no contiene una @ o tiene mas de una y no es correcto");
		}
		
	}
}
