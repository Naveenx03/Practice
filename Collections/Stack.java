class Stack{
    private int stack[];
    private int maxSize;
    private int top;
    Stack(int size){
        stack = new int[size];
        maxSize = size;
        top = -1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return top;
        }
        return stack[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stach is empty");
            return top;
        }
        return stack[top];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        for(int i=top; i>=0; i--){
            System.out.print(stack[i]+" ");
        }
    }
    public boolean isFull(){
        return maxSize==top;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public int len(){
        return maxSize;
    }
}