public class BinarySearch {
    public int binarySearch(int arr[], int start, int end, int key){
        while(start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return 1;
            if(arr[mid] < key)
                start = mid + 1;
            else
                end = mid + 1;
        }
       return 0; 
    }
    
    public static void main(String args[]){
      int arr[] = {11, 23, 45, 70, 90, 100, 111, 123}; //sorted list
      //First search exemple
      int key = 45; // Search number
      
      BinarySearch obj = new BinarySearch();
      
      System.out.println("Searching Element: "+ key);
      
      if(obj.binarySearch(arr, 0, arr.length - 1, key) == 1)
          System.out.println("Search found");
      else
          System.out.println("Search not found");
      //Second search exemple
      key = 150;  //search number
         
      System.out.println("Searching Element: "+ key);
      
      if(obj.binarySearch(arr, 0, arr.length -1, key) == 1)
          System.out.println("Search found");
      else
          System.out.println("Search not found");
    } 
}
