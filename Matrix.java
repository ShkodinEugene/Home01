
public class Matrix {// класс хранения матрицы
	private int[][] MatriX;

	public  Matrix (int sizeN, int sizeM){
		MatriX=new int[sizeN][sizeM];
	}
	public int getVerticalSize (){
		return MatriX.length;
	}
	public int getHorizontalSize(){
		return MatriX[0].length;
	}
	public int getElement(int i, int j){
		return MatriX[i][j];
	}
	public void setElement (int i, int j, int networkElement){
		MatriX[i][j]=networkElement;
	}
	public String toString(){
		String LineItems ="\nMatrix :"+ MatriX.length + "x"+ MatriX[0].length+"\n";
		for (int[] vector : MatriX){
			for(int networkElement :vector ){
				LineItems+=networkElement+" ";
			}
			LineItems+="\n";
		}
		return LineItems;
	}
}
