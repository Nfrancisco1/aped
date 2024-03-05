package ordenacao;

public class Ordenacao{

    public static void main(String[] args) {
        // TODO code application logic here
    int []vect = {4,6,9,3,2,1,0,1};
    for(int i=0; i<vect.length; i++){
            for(int j=i+1;j<vect.length; j++){
             if(vect[i]>vect[j]){
                 int aux = vect[i];
                 vect[i]=vect[j];
                 vect[j]=aux;
             }
            }
        }
    for(int i=0;i<vect.length; i++){
       System.out.print(vect[i] + " ");
            
    }
    }  
}
