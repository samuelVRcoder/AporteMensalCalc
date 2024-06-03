import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AporteMensalCalc {

	public static void main(String[] args) {
		
		try {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		
		window.setBounds(100, 100, 200, 200);
		
		window.setResizable(false);
		
		JLabel mon = new JLabel("Valor do aporte");
		
		window.add(mon);
		
		JTextArea moneyW = new JTextArea(1,10);
		
		window.add(moneyW);
		
		
		JLabel ta = new JLabel("Taxa mensal");
		
		window.add(ta);
		
		JTextArea taxW = new JTextArea(1,10);
		
		window.add(taxW);
		
		
		JLabel tim = new JLabel("Tempo em meses");
		
		window.add(tim);
		
		JTextArea timeW = new JTextArea(1,10);
		
		
		window.add(timeW);
				
		JButton calc = new JButton("Calcular");
		
		
		
		calc.addActionListener((n)-> {
			
			try {
			
			String tax = taxW.getText().toString();
			
			String money = moneyW.getText().toString();
			
			String time = timeW.getText().toString();
			
			/*String finalMoney = Double.parseDouble(money.replace(',', '.'))*
					(Math.pow(   (   1 + (Double.parseDouble(tax.replace(',', '.'))/100)  ),
					Double.parseDouble(time.replace(',', '.'))))+"";
					
					
					(1+(Double.parseDouble(tax.replace(',', '.'))/100))*((Math.pow(   (   1 + (Double.parseDouble(tax.replace(',', '.'))/100)  ),
					Double.parseDouble(time.replace(',', '.')))-1)/(Double.parseDouble(tax.replace(',', '.'))/100))*Double.parseDouble(money.replace(',', '.'))
			*/
			
			String finalMoney = String.format("%.2f", (1+(Double.parseDouble(tax.replace(',', '.'))/100))*((Math.pow(   (   1 + (Double.parseDouble(tax.replace(',', '.'))/100)  ),
							Double.parseDouble(time.replace(',', '.')))-1)/(Double.parseDouble(tax.replace(',', '.'))/100))*Double.parseDouble(money.replace(',', '.')));
			
			//(1+i)*((((1+i)**t)-1)/i)*c
			
			JOptionPane.showMessageDialog(null, finalMoney);
			
			}catch(Exception ex) {
				
				JOptionPane.showMessageDialog(null, "Algo deu errado\n\n"+ex);
				
			}
			
			});
		
				
		window.add(calc);
		
		window.setVisible(true);
		
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Algo deu errado\n\n"+e);
			
		}
		

	}

}

