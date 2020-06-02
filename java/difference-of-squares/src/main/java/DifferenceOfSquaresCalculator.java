class DifferenceOfSquaresCalculator {
	
    int computeSquareOfSumTo(int input) {
    	int result = 0;
    	for (int i = 1; i <= input; i++)
    		result += i;
    	return (result * result);
    }

    int computeSumOfSquaresTo(int input) {
    	int result = 0;
    	for (int i = 1; i <= input; i++)
    		result += (i * i);
    	return result;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
