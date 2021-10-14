import java.util.Stack;

public class TP2_2 {
    public static void printData(Stack<Integer> stack) {
        for(Integer item : stack) {
            System.out.println(item);
        } 
    }
    
    public static void main(String args[]) {
        Stack<Integer> data = new Stack<Integer>();
        System.out.println("STACK IS FULL");

        System.out.println("--- PUSH ---");
        data.push(5);
        data.push(3);
        data.push(2);
        printData(data);
        
        System.out.println("--- POP ---");
        data.pop();
        printData(data);
    }
}