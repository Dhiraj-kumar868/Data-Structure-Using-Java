class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,33,8,90,42};
        int result = searchNumber(arr, 33);
        System.out.println("Result: " + result);
    }

    /*
     * @description : function to search a number in the array
     * @arr : array of integers
     * @target : number to search in the array
     * @Time Complexity : O(n)
     */
    static int searchNumber(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            //check whether the number is equal to target element or not
            if (arr[i] == target) {
                return i;
            }
        }
        //if target element is not present in the array
        return -1;
    }
};