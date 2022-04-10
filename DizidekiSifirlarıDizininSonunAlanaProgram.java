
package javaapplication37;

public class JavaApplication37 {

   
    public static void main(String[] args) {
        
      int[] dizi = {1,5,0,7,8,0,0,4,0,3,12,0};
      int sayac=0;
      int i=0;
      
      for( i=0; i<dizi.length;i++)
      {
          if(dizi[i]!=0)
          {
              dizi[sayac++] = dizi[i];
              
          }
      }
      
      while(sayac < dizi.length)
      {
          dizi[sayac++] = 0;
      }
      System.out.print("Çıktı:");
      for(int j=0; j<dizi.length;j++)
      {
          System.out.print(dizi[j] + ",");
      }
         