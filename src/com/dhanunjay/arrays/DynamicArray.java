package com.dhanunjay.arrays;

public class DynamicArray<T> {
    private Object[] array;
    private int end = -1, capacity = 2;

    public DynamicArray(){
        array = new Object[capacity];
    }

    public DynamicArray(int size){
        if(size < 0) throw new ArrayStoreException();
        array = new Object[size];
        capacity = size;
    }

    public void add(T data){
        if(end == capacity - 1){
            resize();
        }
        array[++end] = data;
    }

    public void add(int index, T data){
        if(index < 0 || index > end + 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(end == capacity - 1){
            resize();
        }
        for(int i = end + 1; i > index; i--){
            this.array[i] = this.array[i - 1];
        }
        array[index] = data;
        end++;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        if(index < 0 || index > end){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public void remove(int index){
        if(index < 0 || index > end){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i = index; i < end; i++){
            array[i] = array[i + 1];
        }
        array[end] = null;
        end--;
    }

    public void resize(){
        Object[] newArray = new Object[2 * capacity];
        System.arraycopy(array, 0, newArray, 0, end + 1);
        array = newArray;
        capacity = 2 * capacity;
    }

    public boolean isEmpty(){
        return end == -1;
    }

    public int size(){
        return end + 1;
    }

    public String toString(){
        if(isEmpty()) return "[]";
        StringBuffer sb = new StringBuffer();
        sb.append('[');
        for(int i = 0; i < end; i++){
            sb.append(array[i] + ", ");
        }
        sb.append(array[end]);
        sb.append(']');
        return sb.toString();
    }
}
