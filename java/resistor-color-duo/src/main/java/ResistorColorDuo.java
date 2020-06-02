class ResistorColorDuo {
    int value(String[] colors) {
        int result = 0, i = colors.length;
        if (i >= 2) i = 1;
        for (String color : colors)
            result += i >= 0 ? Math.pow(10, i--) * colorCode(color) : 0;
        return result;
    }

    int colorCode(String color) {
        return java.util.Arrays.asList(colors()).indexOf(color);
    }

    String[] colors() {
        return new String[] {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"};
    }
}
