package stack;

public class Stack {
    int pointer = -1;
    int stack[] = new int[50];


    public static void main(String[] args) {
        // TODO code application logic here
        //Commit.2
    }
    
    
    public int push(int wert){
        if (pointer < 50){
            stack[pointer+1] = wert;
            pointer = pointer+1;
            return 0;           
        } else
            return -1;
    }
    
    public int pop(){
        int wert;
        if (pointer >= 0){
            wert = stack[pointer];
            stack[pointer] = 0;
            pointer = pointer-1;
            return wert;
        } else
            return -1;
    }
    
    public void print(){
        for (int i=-1; i>=pointer; i++){
            System.out.println("stack[i]");
        }
    }
    
    
    
    
}
