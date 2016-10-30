
public class Ex1 {

	public static void main(String[] args) {
		int [] mas=new int[]{7, 0,6,5,0,6,8,3,0};
		int kol=0;
		for(int i=0;i<mas.length;i++){
			if(mas[i]==0){
				kol++;
			}
			int mas2[]=new int[kol];
			for(int i=0;i<mas.length;i++){
				for(int j=0;j<kol;j++){
			
				if(mas[i]==0){
					mas2[j]=i;
					System.out.println(mas[j]);
				}
		}
			}
		}

}
}
