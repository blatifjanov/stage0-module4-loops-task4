package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int countedSum=0;
        int skippedSum = 0;

        if (numberToSkip == lastInRow) {
            for (int i = 1; i <= lastInRow; i++) {
                skippedSum += i;
            }
            System.out.println("skipped sum is "+skippedSum);
            System.out.println("counted sum is 0");
        } else {

            for (int i = numberToSkip; i <=lastInRow; i++) {
                if (i == numberToSkip) {
                    continue;
                }
                countedSum+=i;
            }
            System.out.println("skipped sum is "+(numberToSkip+lastInRow));
            System.out.println("counted sum is "+countedSum);
        }
    }
}
