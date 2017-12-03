//Written by: Riley Kalb This program uses built in stack class.
import java.util.*;

class JavaStackClass {
    
    static Stack<String> strStack = new Stack<>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp   = null; 
        System.out.println("Please enter in your "
              + "phrase with DONE as the sentinel");
        
        while(input.hasNext()) {
            temp = input.next();
            if (temp.equals("DONE")) {
                System.out.println("Doing calculations...Beep...Beep...Beep");
                break;
            } else {
                strStack.push(temp);
            }
        }
        printStacks();
    }
    static void place_at_bottom(String X){
 
        if(strStack.isEmpty())
            strStack.push(X);
        else {
            String a = strStack.peek();
            strStack.pop();
            place_at_bottom(X);
            strStack.push(a);
        }
    }
    static void  reverseStack() {
        if(strStack.size() > 0) {
            String b = strStack.peek();
            strStack.pop();
            reverseStack();
            place_at_bottom(b);
        }
    }
    static void printStacks() {
        System.out.println("Original Input Stack In:");
        System.out.println(strStack);
        reverseStack();
        System.out.println("Reversed Stack from Input:");
        System.out.println(strStack);
    } 
}