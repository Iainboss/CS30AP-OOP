public class Search {

    //Binary Search

    public static int binarySearch(int[] arr, int searchTerm) {


        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2; //Integer math will always round down!!
            if (searchTerm == arr[mid]) {
                return mid;
            } else if (searchTerm > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }//binary search

    public static int linearSearch(String[] arr, String searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (searchTerm.equalsIgnoreCase(arr[i])) {
                return i;
            }

        }
        return -1;

    }//linear search


    public static int doubleSearch(Double[] arr, double searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }

        }
        return -1;

    }//linear search


    public static int StringBinarySearch(String[] arr, String searchTerm) {


        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2; //Integer math will always round down!!
            if (searchTerm.equalsIgnoreCase(arr[mid])) {
                return mid;
            } else if (searchTerm.compareToIgnoreCase(arr[mid]) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }//binary search


    public static void SortAlphabetically(String[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareToIgnoreCase(arr[lowestIndex]) < 0) {
                    lowestIndex = j;
                }
            }
//swaps the lowest to the beginning
            String temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;

        }


    }//End Sort alphabetical





    public static void sortAlpha (String names[])
    {
        for (int i = 0 ; i < names.length - 1 ; i++)
        {
            for (int a = 0 ; a < names.length - 1 - i ; a++)
            {

                int length1 = names [a].length ();
                int length2 = names [a + 1].length ();

                int min = 1;

                if (length1 > length2)
                {
                    min = length2;
                }
                else
                {
                    min = length1;
                }

                for (int b = 0 ; b < min ; b++)
                {

                    if ((int) names [a].toLowerCase ().charAt (b) > (int) names [a + 1].toLowerCase ().charAt (b))
                    {
                        String tempName = names [a];

                        // sort:
                        names [a] = names [a + 1];
                        names [a + 1] = tempName;

                        break;
                    }

                }

            }
        }
    }//End
    //THIS ALGORITHM WAS TAKEN FROM https://stackoverflow.com/questions/62046255/using-bubble-sort-to-alphabetically-sort-array-of-names-in-java
}









