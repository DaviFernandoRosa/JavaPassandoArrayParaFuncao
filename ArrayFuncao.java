import java.util.ArrayList;


public class App {

    public static void main (String [] args){
     

       int [] numeros={10,4,5,7,8,9,12,24};

       parImpar(numeros);
     
        }

       public static void parImpar(int [] num){
          String res;
         for(int n:num){
           if(n%2==0){
               res="Par"
           } else{
               res="Impar"
           }
           System.out.printf("%d:%s%n" ,n,res);
            
         }

       }
    }
