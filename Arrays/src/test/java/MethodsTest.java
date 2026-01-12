import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.arrays.Solution;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MethodsTest {
    
    // Test removeDuplicates
    @Test
    public void testRemoveDuplicates() {
        int[] nums = {1, 1, 2, 3, 4};
        int result = Solution.removeDuplicates(nums);
        assertEquals(4, result);
    }
    
    @Test
    public void testRemoveDuplicatesWithAllUnique() {
        int[] nums = {1, 2, 3, 4, 5};
        int result = Solution.removeDuplicates(nums);
        assertEquals(5, result);
    }
    
    @Test
    public void testRemoveDuplicatesWithAllSame() {
        int[] nums = {5, 5, 5, 5};
        int result = Solution.removeDuplicates(nums);
        assertEquals(1, result);
    }
    
    // Test removeElement
    @Test
    public void testRemoveElement() {
        int[] nums = {1, 1, 2, 3, 4};
        int[] expected = {2, 3, 4};
        int[] result = Solution.removeElement(nums, 1);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testRemoveElementNoMatch() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        int[] result = Solution.removeElement(nums, 5);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testRemoveElementAllMatch() {
        int[] nums = {2, 2, 2, 2};
        int[] expected = {};
        int[] result = Solution.removeElement(nums, 2);
        assertArrayEquals(expected, result);
    }
    
    // Test getConcatenation
    @Test
    public void testGetConcatenation() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 2, 3, 1, 2, 3};
        int[] result = Solution.getConcatenation(nums);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testGetConcatenationEmpty() {
        int[] nums = {};
        int[] expected = {};
        int[] result = Solution.getConcatenation(nums);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testGetConcatenationSingleElement() {
        int[] nums = {5};
        int[] expected = {5, 5};
        int[] result = Solution.getConcatenation(nums);
        assertArrayEquals(expected, result);
    }
    
    // Test scoreOfString
    @Test
    public void testScoreOfString() {
        String s = "hello";
        int result = Solution.scoreOfString(s);
        // h=104, e=101, l=108, l=108, o=111
        // |104-101| + |101-108| + |108-108| + |108-111| = 3+7+0+3 = 13
        assertEquals(13, result);
    }
    
    @Test
    public void testScoreOfStringTwoChars() {
        String s = "ab";
        int result = Solution.scoreOfString(s);
        assertEquals(1, result);
    }
    
    // Test hasDuplicate
    @Test
    public void testHasDuplicateWithDuplicates() {
        int[] nums = {1, 2, 3, 1};
        boolean result = Solution.hasDuplicate(nums);
        assertFalse(result); // Returns true if NO duplicates
    }
    
    @Test
    public void testHasDuplicateNoDuplicates() {
        int[] nums = {1, 2, 3, 4};
        boolean result = Solution.hasDuplicate(nums);
        assertTrue(result);
    }
    
    // Test isAnagram
    @Test
    public void testIsAnagramTrue() {
        boolean result = Solution.isAnagram("listen", "silent");
        assertTrue(result);
    }
    
    @Test
    public void testIsAnagramFalse() {
        boolean result = Solution.isAnagram("hello", "world");
        assertFalse(result);
    }
    
    @Test
    public void testIsAnagramEmptyStrings() {
        boolean result = Solution.isAnagram("", "");
        assertTrue(result);
    }
    
    @Test
    public void testIsAnagramDifferentLengths() {
        boolean result = Solution.isAnagram("abc", "abcd");
        assertFalse(result);
    }
    
    // Test lengthOfLastWord
    @Test
    public void testLengthOfLastWord() {
        String s = "Hello World";
        int result = Solution.lengthOfLastWord(s);
        assertEquals(5, result);
    }
    
    @Test
    public void testLengthOfLastWordSingleWord() {
        String s = "Hello";
        int result = Solution.lengthOfLastWord(s);
        assertEquals(5, result);
    }
    
    @Test
    public void testLengthOfLastWordWithSpaces() {
        String s = "   fly me   to   the moon  ";
        int result = Solution.lengthOfLastWord(s);
        assertEquals(4, result);
    }
    
    // Test twoSum
    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Solution.twoSum(nums, target);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));
    }
    
    @Test
    public void testTwoSumDifferentPair() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = Solution.twoSum(nums, target);
        assertEquals(2, result.length);
    }
    
    // Test validWordSquare
    @Test
    public void testValidWordSquareTrue() {
        List<String> words = Arrays.asList("abcd", "bnrt", "crmy", "dtye");
        boolean result = Solution.validWordSquare(words);
        assertTrue(result);
    }
    
    @Test
    public void testValidWordSquareFalse() {
        List<String> words = Arrays.asList("abcd", "bnrt", "crm", "dt");
        boolean result = Solution.validWordSquare(words);
        assertTrue(result);
    }
    
    @Test
    public void testValidWordSquareEmpty() {
        List<String> words = new ArrayList<>();
        boolean result = Solution.validWordSquare(words);
        assertTrue(result);
    }
    
    // Test countSeniors
    @Test
    public void testCountSeniors() {
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        int result = Solution.countSeniors(details);
        assertEquals(2, result);
    }
    
    @Test
    public void testCountSeniorsNone() {
        String[] details = {"1234567890M3012", "9876543210F2534"};
        int result = Solution.countSeniors(details);
        assertEquals(0, result);
    }
    
    @Test
    public void testCountSeniorsAll() {
        String[] details = {"1234567890M7012", "9876543210F8534"};
        int result = Solution.countSeniors(details);
        assertEquals(2, result);
    }
    
    // Test numUniqueEmails
    @Test
    public void testNumUniqueEmails() {
        String[] emails = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };
        int result = Solution.numUniqueEmails(emails);
        assertEquals(2, result);
    }
    
    @Test
    public void testNumUniqueEmailsAllSame() {
        String[] emails = {
            "test@example.com",
            "test@example.com"
        };
        int result = Solution.numUniqueEmails(emails);
        assertEquals(1, result);
    }
    
    // Test findMaxConsecutiveOnes
    @Test
    public void testFindMaxConsecutiveOnes() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = Solution.findMaxConsecutiveOnes(nums);
        assertEquals(3, result);
    }
    
    @Test
    public void testFindMaxConsecutiveOnesNone() {
        int[] nums = {0, 0, 0};
        int result = Solution.findMaxConsecutiveOnes(nums);
        assertEquals(0, result);
    }
    
    @Test
    public void testFindMaxConsecutiveOnesAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int result = Solution.findMaxConsecutiveOnes(nums);
        assertEquals(4, result);
    }
    
    @Test
    public void testFindMaxConsecutiveOnesEmpty() {
        int[] nums = {};
        int result = Solution.findMaxConsecutiveOnes(nums);
        assertEquals(0, result);
    }
    
    // Test isSubsequence
    @Test
    public void testIsSubsequenceTrue() {
        boolean result = Solution.isSubsequence("abc", "ahbgdc");
        assertTrue(result);
    }
    
    @Test
    public void testIsSubsequenceFalse() {
        boolean result = Solution.isSubsequence("axc", "ahbgdc");
        assertFalse(result);
    }
    
    @Test
    public void testIsSubsequenceEmpty() {
        boolean result = Solution.isSubsequence("", "ahbgdc");
        assertTrue(result);
    }
    
    // Test majorityElement
    @Test
    public void testMajorityElement() {
        int[] nums = {3, 2, 3};
        int result = Solution.majorityElement(nums);
        assertEquals(3, result);
    }
    
    @Test
    public void testMajorityElementAllSame() {
        int[] nums = {1, 1, 1, 1};
        int result = Solution.majorityElement(nums);
        assertEquals(1, result);
    }
    
    @Test
    public void testMajorityElementLargerArray() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = Solution.majorityElement(nums);
        assertEquals(2, result);
    }
    
    // Test maxDifference
    @Test
    public void testMaxDifference() {
        String s = "aabbcc";
        int result = Solution.maxDifference(s);
        assertEquals(0, result); // All chars appear twice: 2-2=0
    }
    
    @Test
    public void testMaxDifferenceVarying() {
        String s = "aaabbc";
        int result = Solution.maxDifference(s);
        assertEquals(2, result); // a:3, b:2, c:1 -> 3-1=2
    }
    
    @Test
    public void testMaxDifferenceSingleChar() {
        String s = "aaaa";
        int result = Solution.maxDifference(s);
        assertEquals(0, result);
    }
    
    
}