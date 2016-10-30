


public class Mas {
public int sum;
	 public static void enterArrayWithRandom(int[] a){
	 
	 for(int i=0;i<a.length;i++){
		a[i]= (int)(Math.random()*10);
	 }
	 }
	 public static int Sum(int [] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
		if(a[i]==i){
			sum=sum+a[i];
		}
	 }
		return sum;
	 }
}

