
public class FerstHomework {
	


	public static void main(String[] args) {
		int sizeN = 3, sizeM = 3, sizeL = 3;
		Matrix MatrixP = MatrixFactory.createRandomized(sizeN, sizeM);
		Matrix MatrixQ = MatrixFactory.createRandomized(sizeM, sizeL);
		System.out.println("Matrix first is : " +MatrixP);
		System.out.println("Matrix first is : " +MatrixQ);
		try{
			Matrix result = Multiplicator.multiply(MatrixP, MatrixQ);
			System.out.println("Matrix product is:" +result);
		} catch (MultipleException e){
			System.err.println("Matrices could" + "not be multiplied:");
		}
		
	}

}
