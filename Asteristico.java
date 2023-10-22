package asteristico;



public class Asteristico {
  int n; 
   void status(){

    if(n>4){
       for(int i=-1;i<n;i++){
         for(int k = n-i;k>-1;k--){
          System.out.print(" ");
         }
          for(int k=-1;k<i;k++){
            System.out.print("*");
          }
        
            System.out.println("");


       }
      }
      else {
      System.out.println("digite um numero maior ou iguaal a 5");
      }     
    } 
     
  
    
} 