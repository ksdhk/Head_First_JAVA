public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotComtTestDrive();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String UserGuess = "2";
        String result = dot.checkyourself(userGuess);
        String testResult = "failed";

        if(result.equals("hit")){
            testResult = "passed";
        }

        System.out.println(testReuslt);
    }
}
