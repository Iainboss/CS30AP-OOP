public class Search {

    //Binary Search

    public static int binarySearch(int[] arr, int searchTerm){


        int start = 0;
        int end = arr.length-1;

        while(  start<=end){

            int mid = (start + end)/2; //Integer math will always round down!!
            if(   searchTerm == arr[mid]){
                return mid;
            }else if(   searchTerm > arr[mid]){
                start = mid +1;
            }else {
                end =mid -1;
            }

        }

        return -1;
    }//binary search

}