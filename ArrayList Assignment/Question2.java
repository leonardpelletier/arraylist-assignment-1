import java.util.ArrayList;

class Question2 {

    public static void removeSmallest(ArrayList<Integer> nums) {
        if (nums.size() == 0) return;
        int smallest = nums.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if (n < smallest) {
                smallest = n;
                smallestIndex = i;
            }
        }
        nums.remove(smallestIndex);
    }

    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }

        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }

}
