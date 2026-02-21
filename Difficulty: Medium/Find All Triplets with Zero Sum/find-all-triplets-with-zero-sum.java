import java.util.*;

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n - 2; i++) {

            HashMap<Integer, List<Integer>> map = new HashMap<>();

            for(int j = i + 1; j < n; j++) {

                int req = -arr[i] - arr[j];

                if(map.containsKey(req)) {

                    for(int k : map.get(req)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(i);
                        temp.add(k);
                        temp.add(j);

                        Collections.sort(temp);

                        if(!ans.contains(temp)) {
                            ans.add(temp);
                        }
                    }
                }

                map.putIfAbsent(arr[j], new ArrayList<>());
                map.get(arr[j]).add(j);
            }
        }

        return ans;
    }
}