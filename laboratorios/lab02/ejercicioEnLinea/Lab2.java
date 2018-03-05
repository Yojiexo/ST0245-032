/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

/**
 *
 * @author Tavo_
 */
public class Lab2 {

    //ARRAY-2
    
    //pre4
    public int[] pre4(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) count++;
            else break;
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++)
            result[i] = nums[i];
        return result;
}
    
    //notAlone
    public int[] notAlone(int[] nums, int val) {
    for (int i = 1; i < nums.length - 1; i++)
        if (nums[i] == val && nums[i - 1] != val
            && nums[i + 1] != val)
            nums[i] = Math.max(nums[i - 1], nums[i + 1]);
    return nums;
}
    
    //isEverywhere
    public boolean isEverywhere(int[] nums, int val) {
    boolean flag1 = true;
    boolean flag2 = true;
 
    for (int i = 0; i < nums.length; i += 2)
        if (nums[i] != val) flag1 = false;
 
    for (int i = 0; i < nums.length - 1; i += 2)
        if (nums[i + 1] != val) flag2 = false;
 
    return flag1 || flag2;
}
    
    //sameEnds
    public boolean sameEnds(int[] nums, int len) {
    for (int i = 0, j = nums.length - len; i < len; i++, j++)
        if (nums[i] != nums[j]) return false;
    return true;
}
    
    
   //no14
    public boolean no14(int[] nums) {
    int ones = 0;
    int fours = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) ones++;
        if (nums[i] == 4) fours++;
    }
    return ones == 0 || fours == 0;
}
    //centeredAverage
    public int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int sum = 0;
 
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        if (nums[i] > max) max = nums[i];
        if (nums[i] < min) min = nums[i];
    }
    return (sum - (max + min)) / (nums.length - 2);
}
    
 //only14
    public boolean only14(int[] nums) {
    for (int i = 0; i < nums.length; i++)
        if (nums[i] != 1 && nums[i] != 4) return false;
    return true;
}
    ////////////////////////////////////////////////////////////////////
    
    //ARRAY-3
    //countClups
    public int countClumps(int[] nums) {
    int count = 0;
    for (int i = 0; i &lt; nums.length - 1; i++)
        if (nums[i] == nums[i + 1]) {
            count++;
            for (int j = i + 1; j &lt; nums.length; j++)
                if (nums[j] == nums[i]) i++;
                else break;
        }
    return count;
}
    
    //maxMirror
    public int maxMirror(int[] nums) {
    int[] numsCopy = new int[nums.length];
    for (int i = nums.length - 1, j = 0; i &gt;= 0; i--, j++)
        numsCopy[j] = nums[i];
 
    int max = 0;
 
    for (int i = 0; i &lt; nums.length; i++) {
        int count = 0;
        int pos1 = i;
        int pos2 = 0;
        boolean flag = false;
 
        while (pos1 &lt; nums.length &amp;&amp; pos2 &lt; nums.length) {
            if (!flag) {
                if (nums[pos1] != numsCopy[pos2]) pos2++;
                else {
                    flag = true;
                    count = 1;
                    pos1++;
                    pos2++;
                }
            } else {
                if (nums[pos1] == numsCopy[pos2]) {
                    count++;
                    pos1++;
                    pos2++;
                } else {
                    if (count &gt; max) max = count;
                    pos1 = i;
                    flag = false;
                }
            }
            if (count &gt; max) max = count;
        }
    }
    return max;
}
    
    //maxSpan
    public int maxSpan(int[] nums) {
    if (nums.length > 0) {
        int maxSpan = 1;
        for (int i = 0; i < nums.length; i++)
            for (int j = nums.length - 1; j > i; j--)
                if (nums[j] == nums[i]) {
                    int count = (j - i) + 1;
                    if (count > maxSpan) maxSpan = count;
                    break;
                }
        return maxSpan;
    } else return 0;
}
    //linearIn
    public boolean linearIn(int[] outer, int[] inner) {
    int indexInner = 0;
    int indexOuter = 0;
    while (indexInner < inner.length && indexOuter < outer.length) {
        if (outer[indexOuter] == inner[indexInner]) {
            indexOuter++;
            indexInner++;
        } else indexOuter++;
    }
    return (indexInner == inner.length);
}
    
    //fix45
    
    public int[] fix45(int[] nums) {
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 5 && i == 0
            || nums[i] == 5 && nums[i - 1] != 4) {
            int pos5 = i;
            for (int j = 0; j < nums.length; j++)
                if (nums[j] == 4 && nums[j + 1] != 5) {
                    int temp = nums[j + 1];
                    nums[j + 1] = 5;
                    nums[pos5] = temp;
                    break;
                }
    }
    return nums;
}
    
    
}
