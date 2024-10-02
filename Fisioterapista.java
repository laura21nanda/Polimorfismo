package Polimorfismo;

public class Fisioterapista extends ProfissionalSaude {
	
private String crj;
	
	public Fisioterapista(String nome, String especialidade, int valorConsulta,String crj) {
		super(nome, especialidade, valorConsulta);
		this.crj = crj;
	}
	@Override
	public void agendarConsulta() {
		System.out.println("Agendado");
	}

}
