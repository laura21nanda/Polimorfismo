package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
	
		Lobo lobo = new Lobo("Romeu","M","Qualquer");
		lobo.emitirSom();
		
		Leao leao = new Leao("Simba","M","Qualquer");
		leao.emitirSom();

		Tigre tigre = new Tigre("Tigresa","F","Qualquer");
		tigre.emitirSom();
	
		Cachorro dog = new Cachorro("Slink","M","Qualquer");
		dog.emitirSom();
		
		Gato gato  = new Gato ("Tiana","F","Qualquer");
		gato.emitirSom();
	}

}
