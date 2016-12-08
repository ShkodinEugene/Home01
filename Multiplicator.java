
public class Multiplicator {// класс произведение двух матриц
	public static Matrix multiply (Matrix MatrixP, Matrix MatrixQ)
		throws MultipleException{
			int VerticalMatrixP = MatrixP.getVerticalSize();
			int HorizontalMatrixQ = MatrixQ.getHorizontalSize();
			int HorizontalMatrixP = MatrixP.getHorizontalSize();
			if(HorizontalMatrixP != MatrixQ.getVerticalSize())
				throw new MultipleException();
			Matrix result = new Matrix(VerticalMatrixP,HorizontalMatrixQ);
		for (int i = 0; i < VerticalMatrixP; i++)
			for (int j = 0;  j < HorizontalMatrixQ; j++){
				int networkElement = 0;
				for(int k = 0; k < HorizontalMatrixP ;k++){
					networkElement += MatrixP.getElement (i, k) * MatrixQ.getElement (k, j);
				}
				result.setElement (i, j, networkElement);
			}
			return result;
		}
			
	}
// i,j,k - это порядковый номер эмелента 
