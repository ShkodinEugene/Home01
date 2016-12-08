
public class MatrixFactory {
	public static Matrix createRandomized (int sizeN, int sizeM){
		Matrix matrix = new Matrix (sizeN,sizeM);
		for(int  i = 0; i < sizeN; i++){
			for(int j = 0; j < sizeM; j++){
				matrix.setElement(i, j, (int)(Math.random() * sizeM * sizeM));
			}
		}
		return matrix;
	}
}
