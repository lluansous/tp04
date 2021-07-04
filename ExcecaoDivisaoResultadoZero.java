public class ExcecaoDivisaoResultadoZero{
    public void calcula(int a, int b, int divisor) {
		int r = (a + b)/divisor;
		if(r == 0) {
			throw new ArithmeticException("Resultado 0 não é permitido!");
		}
}
}

