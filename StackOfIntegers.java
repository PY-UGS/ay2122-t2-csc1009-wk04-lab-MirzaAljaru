public class StackOfIntegers {

    private int[] elements;
    private int size;

    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = -1;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
        this.size = -1;
    }

    public boolean empty(){
        if (this.size == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){
        return this.elements[size];
    }

    public void push(int value){
        this.size += 1;
        this.elements[size] = value;
    }

    public int pop(){
        int value = this.elements[size];
        this.size -= 1;
        return value;
    }

    public int getSize(){
        return (this.size + 1);
    }

}