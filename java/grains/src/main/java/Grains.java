import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64)
            throw new IllegalArgumentException("square must be between 1 and 64");

//        return BigInteger.valueOf(2).pow(square - 1);
//        return BigInteger.ONE.shiftLeft(square - 1);
        return BigInteger.ZERO.setBit(square - 1);
    }

    BigInteger grainsOnBoard() {
//        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
//        return BigInteger.ONE.shiftLeft(64).subtract(BigInteger.ONE);
        return BigInteger.ZERO.setBit(64).subtract(BigInteger.ONE);
    }
}
