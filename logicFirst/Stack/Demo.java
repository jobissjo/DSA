public class Demo{
    public static void main(String args[]){
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        stack.push(2);
        stack.push(4);
        System.out.println(stack.pop());
        stack.pop();
        System.out.println(stack.pop());

    }
}