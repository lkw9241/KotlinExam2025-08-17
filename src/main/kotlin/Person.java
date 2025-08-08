
public class Person{
    String name;
    int age;
    int num1;
    int num2;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    Person(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    void greet(){
        System.out.println("my name is %s and my age is %d".formatted( name, age));

    }

    int calculate(){
        System.out.println("addNumber:%d".formatted(num1+num2));
       return num1 + num2;
    }


}
