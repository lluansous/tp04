public class array{

        int [] arrayA = new int[10];	// Atributo arrayA
	int [] arrayB = new int[10];    // Atributo arrayB
        
         public int [] getArrayA(){
		return arrayA;
	}
	
	public int [] getArrayB() {
		return arrayB;
	}
	//métodos set
	public void SetArrayA (int [] arrayA) {
		this.arrayA = arrayA;
	}
	
	public void SetArrayB (int [] arrayB) {
		this.arrayB = arrayB;
	}
	
	public void setArrayANaPosicao(int valor, int posicao){
		arrayA[posicao] = valor;
		
               if (posicao < 0 || posicao > 9) {
			System.out.println("Essa posição está fora do arrayB");
			return;
			}

}			
        public void calcula(int a, int b, int divisor){
		//Tratamento de exceção
		try {
		int r = (a + b)/divisor;
		System.out.println("Valor da divisão:" + r);
		}catch (ArithmeticException e){
			System.out.println("Não pode ser dividido por 0.");	
			}
			
			

}
}



			


