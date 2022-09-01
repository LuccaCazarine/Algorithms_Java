public class TimeAndSpaceComplexity{    
    //time complexity
    int sum(int arr [][], int n){  
        int i, j, k, sum = 0;                 // 1
        for (i = 0; i < n; i++){              // n+1
            for(j = 0; j < n; j++){           // n*(n+1)
                for(k = 0; k < n; k++){       // n*n*(n+1)          
                    sum = sum + arr [i][j];   // n*n*n
                }
        }                           // t(x) = 2n^3 + 2n^2 + 2n + 3 --> 0(n^3) 
    }
    return sum;
  }
    //space complexity
    int sum2(int arr2 [][], int n2){           //n*n + 1
        int i, j, k, sum2 = 0;                 //1+1+1+1  
        for (i = 0; i < n2; i++){              
            for(j = 0; j < n2; j++){
                for(k = 0; k < n2; k++){
                    sum2 = sum2 + arr2 [i][j];
                }
        }                                     //s(x) = n^2 + 5  -->  0(n^2)     
    }
    return sum2;
  }
}
   
    
