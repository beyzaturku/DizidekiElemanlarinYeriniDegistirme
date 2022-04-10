package ciftbastateksonda;

public class CiftBastatekSonda {

 
    public static void main(String[] args) {
        
        int[] dizi = {20,13,23,17,7,8,10,2,1,0,78,15,16,100,105};
        int i=0;
        int[] tekDizi = new int[dizi[i]];
        int[] ciftDizi = new int[dizi[i]];
        
        for(i=0; i<dizi.length; i++)
        {
            if(dizi[i]%2==0)
            {
                ciftDizi[i] = dizi[i];
                System.out.print(ciftDizi[i] + ",");
            }
        }
        System.out.println();
        for( i=0; i<dizi.length; i++)
        {
            if(dizi[i]%2!=0)
            {
                tekDizi[i] = dizi[i];
                System.out.print(tekDizi[i] + ",");
            }
            
        }
        
 
        
       
        
      
       
        
       
    }
    
}
