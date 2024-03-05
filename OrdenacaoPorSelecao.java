
package ordenacaoporselecao;

public class OrdenacaoPorSelecao {

    public static void main(String[] args) {
       int v[] = {4,2,5,0,9,1};
       for(int i= 1; i<v.length; i++){
           int j = i-1;
           int min= v[i];
           while(j>=0 && v[j]>min){
           v[j+1] = v[j];
           j--;
           }
           v[j+1] = min;   
       }
       for(int i=0; i<v.length; i++ ){
           System.out.print(v[i] + " ");
       }
    }    
}
