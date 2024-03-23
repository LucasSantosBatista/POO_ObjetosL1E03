/**
 * 
 */
package model;

import javax.swing.JOptionPane;

/**
 * @author Lucas Batista 23 de mar. de 2024
 */
public class FuncionarioObj {
	private String nome;
	private double salario;
	private String cargo;

	private final double  salarioMinimo = 1412;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < salarioMinimo) {
			this.salario = salarioMinimo;
		} else {
			this.salario = salario;
		}
	
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void Funcionario() {
		System.out.println(
				"Nome do Funcionário: " + getNome() + " | Salário: " + getSalario() + " | Cargo: " + getCargo());
	}

	public double getSalarioLiquido(double descontos, double beneficios) {
		double salarioLiquido = this.salario - descontos + beneficios;
        return salarioLiquido;
	}

}
