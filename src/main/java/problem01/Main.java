package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		int result;
		int cnt = 0;
		
		result = number%10;
		if(result == 3 || result == 6 || result == 9) cnt++;
		result = number/10;
		if(result == 3 || result == 6 || result == 9) cnt++;
		
		number++;
		
		return cnt;
	}
}