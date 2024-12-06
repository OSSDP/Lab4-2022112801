import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class L2022112801_7_Test {

    // 测试用例设计原则：
    // 1. 等价类划分：将输入划分为若干等价类，每个等价类选取一个代表性测试用例。
    // 2. 边界值分析：测试输入的边界值情况。
    // 3. 特殊值测试：测试一些特殊值的情况，如空字符串、无交换对等。

    /**
     * 测试方法：testSmallestStringWithSwaps1 测试目的：测试一般情况 测试用例：输入字符串 "dcab"，交换对 [[0,3],[1,2]]，期望输出 "bacd"
     */
    @Test
    public void testSmallestStringWithSwaps1() {
        Solution7 solution = new Solution7();
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
        String result = solution.smallestStringWithSwaps(s, pairs);
        assertEquals("bacd", result);
    }

    /**
     * 测试方法：testSmallestStringWithSwaps2 测试目的：测试多个交换对的情况 测试用例：输入字符串 "dcab"，交换对 [[0,3],[1,2],[0,2]]，期望输出 "abcd"
     */
    @Test
    public void testSmallestStringWithSwaps2() {
        Solution7 solution = new Solution7();
        String s = "dcab";
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2));
        String result = solution.smallestStringWithSwaps(s, pairs);
        assertEquals("abcd", result);
    }

    /**
     * 测试方法：testSmallestStringWithSwaps3 测试目的：测试所有字符都可以交换的情况 测试用例：输入字符串 "cba"，交换对 [[0,1],[1,2]]，期望输出 "abc"
     */
    @Test
    public void testSmallestStringWithSwaps3() {
        Solution7 solution = new Solution7();
        String s = "cba";
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2));
        String result = solution.smallestStringWithSwaps(s, pairs);
        assertEquals("abc", result);
    }

    /**
     * 测试方法：testSmallestStringWithSwaps4 测试目的：测试空字符串的情况 测试用例：输入字符串 ""，交换对 []，期望输出 ""
     */
    @Test
    public void testSmallestStringWithSwaps4() {
        Solution7 solution = new Solution7();
        String s = "";
        List<List<Integer>> pairs = Collections.emptyList();
        String result = solution.smallestStringWithSwaps(s, pairs);
        assertEquals("", result);
    }

    /**
     * 测试方法：testSmallestStringWithSwaps5 测试目的：测试无交换对的情况 测试用例：输入字符串 "abc"，交换对 []，期望输出 "abc"
     */
    @Test
    public void testSmallestStringWithSwaps5() {
        Solution7 solution = new Solution7();
        String s = "abc";
        List<List<Integer>> pairs = Collections.emptyList();
        String result = solution.smallestStringWithSwaps(s, pairs);
        assertEquals("abc", result);
    }
}
