package ordenacaoporinsercao;

public class OrdenacaoPorInsercao {

    public static void main(String[] args) {
       int v1[]= {5,2,6,1,9,8,3};
       int k=v1.length;
           for(int i=1 ; i<k; i++){
                int n = v1[i];
                int j = i-1;
                while(j>=0 && v1[j]>n){
                        v1[j+1]= v1[j];
                        j--;
           }
           v1[j+1] = n;
       }
           
      for(int i = 0; i<=k; i++){
        System.out.print(v1[i] + " ");
      } 
      
    }
   public int Mediana(int n){
       if(k%2==0){
               
           }
       return n;
   } 
}
