class Darts {
    int score;

    Darts(double x, double y) {
        double distance = Math.abs(x*x) + Math.abs(y*y);
        int[] radii = {1, 5, 10};
        for(int i = 0 ; i < radii.length; i++){
            double r = Math.pow(radii[i], 2);
            if(distance <= Math.pow(radii[i], 2)){
                score = 2-i == 0 ? 1 : 5 * (2-i);
                break;
            }
        }
    }

    int score() {
        return score;
    }

}
