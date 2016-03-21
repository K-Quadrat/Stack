package stack;
import java.io.*;

public class Stack {
    int pointer;
    int stack[];
    
    

    public Stack(int laenge){
        stack = new int [laenge];
        pointer = -1;
    }
    


    public static void main(String[] args) throws IOException {
        
        //try {}catch (Exception e);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Bitte geben Sie die gewünschte Array Größe an: \n");
        String eingabe = br.readLine();
        int eingelesen = Integer.parseInt(eingabe);
       
        Stack StackObjekt = new Stack(eingelesen);
        
        int ende = 0;
        //while(ende == 0){
        System.out.print("1 für push \n 2 für pop \n  3 für print \n 9 für Ende \n");
        String eingabe2 = br.readLine();
        int menue = Integer.parseInt(eingabe);
                
        switch(menue){
            
            case 1:
                StackObjekt.push(55);
                System.out.println("Push");
                break;
                
            case 2:
                StackObjekt.pop();
                
                break;
                
            case 3:
                StackObjekt.print();
                break;
                
            case 9:
                ende = 1;
                break;
        //}
        }
        
        
        
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
