package stack;

public class Zusatzoperationen extends Stack{
    
    public Zusatzoperationen(int laenge, int wert) {
        super(laenge);
        for(int i=0; i<laenge; i++){
            push(i+wert);
        }
    }


    public boolean check(){
        boolean merken;
        merken = false;
        for(int i=0; i<=stack.length; i++){
        if(stack[i]!=0){
            merken = true;
        }
    }
    return merken;
}
    
    
    
    
    public int push(int[] werte){

        if ((getPointer()+werte.length) < stack.length){
            for (int i=0; i<werte.length; i++){
                push(werte[i]);
            }
            return 0;           
        } else
            return -1;  
}
    
    
    
    
}
