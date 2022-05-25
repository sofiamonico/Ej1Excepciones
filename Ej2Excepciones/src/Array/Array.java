
package Array;

public class Array {
    private int array[];

    public Array() {
        this.array = new int[5];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    public void llenarArray(){
        for (int i = 0; i < 10; i++)
        {
            if(i>this.array.length){
                throw new ArrayIndexOutOfBoundsException();
            }
            this.array[i]=1;
        }
    }
}
