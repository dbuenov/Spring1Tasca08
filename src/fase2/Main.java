package fase2;

public class Main {

	public static void main(String[] args) {
		
		/*
		Pi valorPi = new Pi() {

			@Override
			public double getPiValue() {
				return 3.1415;
			}
			
		};
		*/
		
		Pi valorPi = () -> 3.1415;
			
		System.out.println(valorPi.getPiValue());
				
	}

}
