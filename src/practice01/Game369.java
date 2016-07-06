package practice01;//1~99까지 369 박수 치기

public class Game369 {//string 으로 

	public static void main(String[] args) {
		
		for(int i=1;i<100;i++){
			int count=0;
			String iNumber = String.valueOf(i);
			
			for(int n=0;n<iNumber.length();n++){
				char c= iNumber.charAt(n);
				
				if(c=='3' || c=='6' || c=='9'){
				count++;
				}
			}
			
			if(count>=1){
				System.out.print(iNumber);
			
				for(int j=0; j<count;j++){
					System.out.print(" 짝 ");
				}
				System.out.println();
			}
		}
	}
}	
