class Hamming {

    private int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {
        validateInput(leftStrand, rightStrand);

        this.hammingDistance = calculateHammingDistance(leftStrand, rightStrand);
    }

    private void validateInput(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length())
            return;
        if (!leftStrand.isEmpty() && !rightStrand.isEmpty() &&
                leftStrand.length() - rightStrand.length() != 0)
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        else if (leftStrand.isEmpty() && !rightStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");
        else if (rightStrand.isEmpty() && !leftStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");
    }

    static int calculateHammingDistance(String leftStrand, String rightStrand){
        int distance = 0;
        for (int i = 0; i < leftStrand.length(); i++)
            distance += leftStrand.charAt(i) != rightStrand.charAt(i) ? 1 : 0;
        return distance;
    }

    int getHammingDistance() {
        return hammingDistance;
    }

}
