class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        addVal(candidates, target, 0, new ArrayList<Integer>());
        return list;

    }

    private void addVal(int[] candidates, int target, int start, List<Integer> rec) {

        for (int i = start; i < candidates.length; i++) {
            List<Integer> temp = new ArrayList<>(rec);
            if (candidates[i] == target) {
                temp.add(candidates[i]);
                list.add(temp);
                break;
            } else if (candidates[i] < target) {
                temp.add(candidates[i]);
                addVal(candidates, target - candidates[i], i, new ArrayList<>(rec));
            } else {
                break;
            }
        }

    }
}