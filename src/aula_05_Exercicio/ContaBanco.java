package aula_05_Exercicio;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("\n==============================\n");
		System.out.println("Conta :" + this.getNumConta());
		System.out.println("Tipo :" + this.getTipo());
		System.out.println("Dono :" + this.getDono());
		System.out.println("Saldo :" + this.getSaldo());
		System.out.println("Status :" + this.getStatus());
	}
	
	
	
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "cc") {
			this.setSaldo(50);
		} else if (t == "cp") {
			this.setSaldo(150);
			System.out.println("\nConta aberta com sucesso");	 
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}
		else if (this.getSaldo() < 0) {
			System.out.println("Não pode fechar, Conta com DÉBITOS");
		} else {
			this.status = false;
			System.out.println("Conta fechada com sucesso!!!");
		}
	}
	
	
	
	public void depositar(double v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depositado com sucesso!");
		} else {
			System.out.println("Impossivel depositar");
		}
	}

	
	public void sacar(double v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque Realizado");
			} else {
				System.out.println("Não tem saldo suficiente");
			} 
		} else {
			System.out.println("Impossivel sacar, conta inexistente");
		}
	}
	
	public void pagarMensal() {
		int v; 
		if (this.getTipo() == "cc") {
			v = 12;
		}
		else if (this.getTipo() == "cp") {
			v = 20;
		}
		if (this.getStatus()) {
			var vl = 0;
			this.setSaldo(this.getSaldo() - vl);
			System.out.println("Mensalidade paga com sucesso!");
		
			} else {
				System.out.println("Conta fechada - impossivel pagar");
			} 

		
	}
	
//	METODOS GETTERS E SETTERS

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
