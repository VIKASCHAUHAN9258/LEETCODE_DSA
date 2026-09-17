class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int i = 0;
        int j = 0;

        long sum = 0;
        long ans = 0;

        int[] freq = new int[100001];
        int distinct = 0;

        while (j < nums.length) {

            sum += nums[j];

            if (freq[nums[j]] == 0) {
                distinct++;
            }

            freq[nums[j]]++;

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {

                if (distinct == k) {
                    ans = Math.max(ans, sum);
                }

                freq[nums[i]]--;

                if (freq[nums[i]] == 0) {
                    distinct--;
                }

                sum -= nums[i];

                i++;
                j++;
            }
        }

        return ans;
    }
}