public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotcom dot = new SimpleDotcom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String UserGuess = "2";
        String result = dot.checkYourself(UserGuess);
    }
}
