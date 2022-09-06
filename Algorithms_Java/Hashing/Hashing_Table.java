public class Hashing_Table {
    static final int SIZE = 5;
    int arr [] = new int[SIZE];
    
    public Hahing_Table(){
        int i;
        for(i = 0; i < SIZE; i++)
            arr[i] = -1;
    }
    
    int insert(int value){
        int key = value % SIZE;
        int index = key;
        
        while (arr [index + 1] != -1){
            index = (index + 1) % SIZE;
            
            if(index == key){
                System.out.println("Hash Table Full");
                return 0;
            }
        }
        
        arr[index] = value;
        return 1;
    }
    
    int delete (int value){
        int key = value % SIZE;
        int index = key;
        
        while (arr[index] != value){
            index = (index + 1) % SIZE;
            
            if(index == key)
            return 0;
        }
        
        arr[index] = -1;
        return 1;
    }
    
    int search(int value){
        int key = value % SIZE;
        int index = key;
        
        while (arr[index] != value){
            index = (index + 1) % SIZE;
            
            if(index == key)
            return 0;
        }
        return 1;
    }
}    

