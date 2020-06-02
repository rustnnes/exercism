class ResistorColor {
    int colorCode(String color) {
        return java.util.Arrays.asList(colors()).indexOf(color);
    }

    String[] colors() {
        return new String[] {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"};
    }
}
