package fase3;

public class Main {

	public static void main(String[] args) {
		
		/*
		DelReves giraParaula = new DelReves() {

			@Override
			public String reverse(String paraula) {
				StringBuilder girada = new StringBuilder(paraula);
				paraula = girada.reverse().toString();
				return paraula;
			}
			
			
		};
		*/
		
		DelReves giraParaula = (s)-> new StringBuilder(s).reverse().toString();
		
		System.out.println(giraParaula.reverse("Esternocleidomastoideo"));
		
	}

}
