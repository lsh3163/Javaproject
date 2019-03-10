import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int time = sc.nextInt();
    	char[][] c = new char[x][y];
    	int[][] boomSite = new int[x*y][2];
    	sc.nextLine();
    	for(int i=0; i<x; i++) {
    			c[i] = sc.nextLine().toCharArray();
    	}
    	
    	if(time % 2 == 0) {
    		for(int i=0; i<x; i++) {
    			for(int j=0; j<y; j++) {
    				System.out.print("O");
    			}
    			System.out.println();
    		}
    	}else if(time % 2 == 1) {
			char[][] tmpSite = c;
    		for(int t=0; t<(time-1)/2; t++) {
    	    	int index = 0;
    	    	for(int i=0; i<x; i++) {
    	    		for(int j=0; j<y; j++) {
    	    			if(tmpSite[i][j] == 'O') {
    	    				boomSite[index][0] = i;
    	    				boomSite[index][1] = j;
    	    				index++;
    	    			}
    	    		}
    	    	}
        		for(int i=0; i<x; i++) {
        			Arrays.fill(tmpSite[i], '0');
        		}
        		for(int i=0; i<index; i++) {
            		if((x>boomSite[i][0] && boomSite[i][0]>=0) && y > boomSite[i][1] && boomSite[i][1] >=0){
           				tmpSite[boomSite[i][0]][boomSite[i][1]] = '.';
           			}
           			if((x>boomSite[i][0]-1 && boomSite[i][0]-1>=0) && (y > boomSite[i][1] && boomSite[i][1] >=0)){
           				tmpSite[boomSite[i][0]-1][boomSite[i][1]] = '.';
           			}
           			if(((x>boomSite[i][0]+1) && boomSite[i][0]+1>=0) && y > boomSite[i][1] && boomSite[i][1] >=0){
           				tmpSite[boomSite[i][0]+1][boomSite[i][1]] = '.';
           			}
           			if(((x>boomSite[i][0]) && boomSite[i][0]>=0) && y > boomSite[i][1]-1 && boomSite[i][1]-1 >=0){
           				tmpSite[boomSite[i][0]][boomSite[i][1]-1] = '.';
           			} 
           			if(((x>boomSite[i][0]) && boomSite[i][0]>=0) && y > boomSite[i][1]+1 && boomSite[i][1]+1 >=0){
           				tmpSite[boomSite[i][0]][boomSite[i][1]+1] = '.';
           			}
           		}
    		}//fort
        		for(int i=0; i<x; i++) {
        			System.out.println(tmpSite[i]);
        		} 
    		}
    		
    }

}