package Polimorfismo;

public class Horista extends Funcionario{
	
	public Horista(int id,String nome, String telefone, int matricula, String endereco) {
		super(id,nome,telefone,matricula,endereco);
	}
	
	@Override
	public double caucularSalario(double valorHora, double horaTrabalhada) {
		return valorHora*horaTrabalhada;
	}
	

}
