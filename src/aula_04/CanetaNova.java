package aula_04;

public class CanetaNova {
	
	private String modelo;
	public float ponta;
	private String cor;
	private boolean tampada;
	

	
	public CanetaNova(String m, String c, float p) { //Metodo Construtor
		this.modelo = m;
		this.cor = c;
		setPonta(p);
		this.tampar();
		this.cor = "Azul";
		
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	
	public void status() {
		System.out.println("Sobre a Caneta");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada?: " + this.tampada);
		
		System.out.println("\nSobre a Caneta 2");
		System.out.println("Marca: " + this.getModelo());
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.getPonta());
		
	}

}