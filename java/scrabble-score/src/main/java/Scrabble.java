import java.util.Arrays;

class Scrabble {

    int score;

    Scrabble(String word) {
        score = calculatePoints(word);
    }

    int getScore() { return score;}
    
    int calculatePoints(String word) {
    	int result = 0;
    	for(int i = 0 ; i < word.length() ; i++)
    		result += getPointForLetter(word.charAt(i));
    	
    	return result;
    }
    
    int getPointForLetter(char letter) {
    	String str = String.valueOf(letter).toLowerCase();
    	if(Arrays.asList("A,E,I,O,U,L,N,R,S,T".toLowerCase().split(",")).contains(str))
    		return 1;
    	if(Arrays.asList("D,G".toLowerCase().split(",")).contains(str))
    		return 2;
    	if(Arrays.asList("B,C,M,P".toLowerCase().split(",")).contains(str))
    		return 3;
    	if(Arrays.asList("F,H,V,W,Y".toLowerCase().split(",")).contains(str))
    		return 4;
    	if("K".toLowerCase().equals(str))
    		return 5;
    	if(Arrays.asList("J,X".toLowerCase().split(",")).contains(str))
    		return 8;
    	if(Arrays.asList("Q,Z".toLowerCase().split(",")).contains(str))
    		return 10;
    	return 0;
    }

}
