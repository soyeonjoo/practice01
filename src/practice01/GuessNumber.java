package practice01;//수맞추기 무한루프로 돌리기2번 맞추면 break

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		while(true){
		int count=1;
		int max =100;
		int min =1;
		Random r = new Random();
		int number = r.nextInt(100)+1;
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		
		Scanner in = new Scanner(System.in);
	
		while(true){
			System.out.println(min+"-"+max);
			System.out.print(count +">>");
			int value = in.nextInt();
			count++;
			
			
			if(number!=value){//틀릴 경우
				if(value<number){
					System.out.println("더 높게");
					min = value;
				}else{
					System.out.println("더 낮게");
					max = value;
				}
			}else{//맞을경우

				System.out.println("맞았습니다.");
				break;
			}
		}
		System.out.print("다시하시겠습니까(y/n)>>");
		String answer = in.next();
		if(answer.equals("n")||answer.equals("N")){//끝낼경우
			break;
			}
			else if(answer.equals("y")||answer.equals("Y")){//다시할경우
			continue;
			}
		in.close();
		} 
	}
}


	
