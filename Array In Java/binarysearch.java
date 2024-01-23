public class binarysearch {
    public static int binarysearch1(int numbers[], int key){
        int index = -1;
        int high = numbers.length - 1;
        int low = 0;
        
        while (low<=high){
            
            int mid = (low + high) / 2;

            if (numbers[mid] == key){
                index = mid;
            }

            if (numbers[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return index;

        
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int index = binarysearch1(num, 10);
        if (index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index: "+index);
    }
}
}
