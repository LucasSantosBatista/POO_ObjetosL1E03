/**
 * 
 */
package view;

import javax.swing.JOptionPane;

import model.FuncionarioObj;

/**
 * @author Lucas Batista 23 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		FuncionarioObj Lucas = new FuncionarioObj();
		Lucas.setNome("Lucas");
		Lucas.setCargo("Programador");
		Lucas.setSalario(1);
		
		
		Object[] options = { "Exibir funcionário", "Calcular salário liquido", "Encerra" };
		int opcao;

		do {
			opcao = JOptionPane.showOptionDialog(null, "Escolha o que deseja fazer:", "Sistema Funcionário",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

			switch (opcao) {
			case 0:
				Lucas.Funcionario();
				break;
			case 1:
				double descontos;
				double beneficios;

				descontos = Lucas.getSalario() * (Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de descontos (em decimal): ")) / 100);
				beneficios = Lucas.getSalario() * (Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de beneficios (em decimal) ")) / 100);

				double salarioLiquido = Lucas.getSalarioLiquido(descontos, beneficios);
				System.out.println("Descontos: R$" + descontos + "\nBenefícios: R$" + beneficios + "\nSalario Liquido: R$" + salarioLiquido);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Encerrando o programa.");
				break;
			}
		} while (opcao != 2);

	}

}
