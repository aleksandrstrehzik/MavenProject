package org.example.lesson3;

public class Student {
    Type type;

    public void setType(Type type) {
        this.type = type;
    }
    public void go(){
        type.type();
    }
}
