public class array{

        int [] arrayA = new int[10];	// Atributo arrayA
	int [] arrayB = new int[10];    // Atributo arrayB
        
         public int [] getArrayA(){
		return arrayA;
	}
	
	public int [] getArrayB() {
		return arrayB;
	}
	//m�todos set
	public void SetArrayA (int [] arrayA) {
		this.arrayA = arrayA;
	}
	
	public void SetArrayB (int [] arrayB) {
		this.arrayB = arrayB;
	}
	
	public void setArrayANaPosicao(int valor, int posicao){
		arrayA[posicao] = valor;
		
               if (posicao < 0 || posicao > 9) {
			System.out.println("Essa posi��o est� fora do arrayB");
			return;
			}

}			
        public void calcula(int a, int b, int divisor){
		//Tratamento de exce��o
		try {
		int r = (a + b)/divisor;
		System.out.println("Valor da divis�o:" + r);
		}catch (ArithmeticException e){
			System.out.println("N�o pode ser dividido por 0.");	
			}
			
			

}
}



			


