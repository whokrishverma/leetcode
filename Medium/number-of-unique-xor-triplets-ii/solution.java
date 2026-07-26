class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        boolean[] a = new boolean[8192];

        for (int x : nums) {
            a[x] = true;
        }

        boolean[] b = new boolean[8192];

        for (int i = 0; i < 8192; i++) {
            if (a[i]) {
                for (int j = 0; j < 8192; j++) {
                    if (a[j]) {
                        b[i ^ j] = true;
                    }
                }
            }
        }

        boolean[] c = new boolean[8192];

        for (int i = 0; i < 8192; i++) {
            if (b[i]) {
                for (int j = 0; j < 8192; j++) {
                    if (a[j]) {
                        c[i ^ j] = true;
                    }
                }
            }
        }

        int ans = 0;
        for (boolean x : c) {
            if (x) ans++;
        }

        return ans;
    }
}