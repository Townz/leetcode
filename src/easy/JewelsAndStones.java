package easy;

import java.util.Arrays;

public class JewelsAndStones
{
    public int numJewelsInStones(String J, String S) {
        return (int) Arrays.asList(S.split("")).stream().filter(stone -> Arrays.asList(J.split("")).contains(stone)).count();
    }
}
