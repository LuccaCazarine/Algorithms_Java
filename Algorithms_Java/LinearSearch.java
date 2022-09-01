public class LinearSearch {
    public int LinearSearch(int arr[], int size, int key){
    int i;
    
    for(i = 0; i < size; i++)
    
        if(arr[i] == key)
            return 1;     
            
    return 0;
  }     
   public static void main (String args[]){
        int arr[] = {86,91,34,50,0}; // search list
        int key = 50; // 30 ; // search number
        
        LinearSearch obj = new LinearSearch();
        
        if(obj.LinearSearch(arr, arr.length, key) == 1)
            System.out.println("Search found " +key);
        else 
            System.out.println("Search not found ");
  }
}
