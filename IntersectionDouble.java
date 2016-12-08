
public class IntersectionDouble {
	static double [] intersection(double[] one, double[] two){
		int intersectionnamber = 0 ;
		for(int sizeNamberone = 0; sizeNamberone < one.length; sizeNamberone++ ){
			for(int sizeNambertwo = 0; sizeNambertwo < two.length; sizeNambertwo++){
				if(one[sizeNamberone]== two[sizeNambertwo]){
					intersectionnamber++; 
				}
			}
		}
		double [] rezilt = new double[intersectionnamber];
		int sizeNamberrezilt = 0; 
		for(int sizeNamberone = 0; sizeNamberone < one.length; sizeNamberone++ ){
			for(int sizeNambertwo = 0; sizeNambertwo < two.length; sizeNambertwo++){
				if(one[sizeNamberone]== two[sizeNambertwo]){
					rezilt[sizeNamberrezilt] = one[sizeNamberone];
					 sizeNamberrezilt++;
					 
				}
			}
		}
		return rezilt;
	}
		


	public static void main(String[] args) {
		double[] one = null;
		double[] two = null;
		int size = 10;
		one = new double [size];
		two = new double [size];
		for(int i = 0; i < one.length; i++ ){
			one [i] = (double) (Math.random() );
		}
		for(int i = 0; i < two.length; i++ ){
			two[i] = (double) (Math.random() );
		}  
		double[] rezilt =IntersectionDouble.intersection(one,two);
		for(int i=0; i < rezilt.length; i++){
			System.out.println(" " + rezilt[i]);
		}
		for(int i=0; i < one.length; i++){
			System.out.println(" " + one[i]);
		}
		for(int i=0; i < two.length; i++){
			System.out.println(" " + two[i]);
		}
	}
}

