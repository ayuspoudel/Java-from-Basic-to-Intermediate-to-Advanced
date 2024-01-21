public class array_linearsearch {
    public static int linearsearch(int arr[], int num){
        for (int i = 0; i<=arr.length; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,7,10,11,15,19};
        int key = 10;
        int index = linearsearch(numbers, key);
        if (index == -1){
            System.out.println("The key is not found");
        }
        else{
            System.out.println("The "+key+" is in index "+index);
        }
    }

}
