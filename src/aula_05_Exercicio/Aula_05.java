package aula_05_Exercicio;

public class Aula_05 {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(11111);
		p1.setDono("Jubileu");
		p1.abrirConta("cc");
		p1.depositar(300);
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(22222);
		p2.setDono("Creuza");
		p2.abrirConta("cp");
		p2.depositar(500);
		p2.sacar(100);
		
		
		p1.estadoAtual();
		p2.estadoAtual();
		
		
		
		

	}

}
