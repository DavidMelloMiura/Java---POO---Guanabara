package aula_04;

public class aula_04 {
	
	public static void main(String[] args) {
		
		CanetaNova c1 = new CanetaNova("Nic", "Vermelha", 0.5f);
//		c1.setModelo("Bic"); //Quando o atributo esta como private só atraves dos getter e setter 
//		c1.modelo = "BIC"; //Atributo public acessa assim
//		c1.setPonta(0.5f);
		c1.ponta = 0.3f;
		c1.status();
		
		System.out.println("\nCaneta 2");
		
		CanetaNova c2 = new CanetaNova("Faber", "Preta", 0.7f);
		c2.status();
				

	}
	
}
