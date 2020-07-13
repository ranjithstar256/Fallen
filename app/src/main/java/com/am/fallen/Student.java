package com.am.fallen;

public class Student {

    public String add(){
        System.out.print("this is add method");
        return "this is what i returned";
    }


    public void cat(String s){
        System.out.print("this is cat method "+s);
    }

    public static void main(String [] args){
        System.out.print("hello world!!");

        // Classname obj = new Classname();
        Student acb = new Student();
      String d =  acb.add();
        System.out.print(d);

        acb.cat("i drink milk");
    }
}
