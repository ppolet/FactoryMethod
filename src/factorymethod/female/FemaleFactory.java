package factorymethod.female;

import factorymethod.AbstractFactory;
import factorymethod.Human;

public class FemaleFactory implements AbstractFactory{
    
    //принимает один параметр int age (возраст) и возвращает нужный объект одного из классов, реализующих интерфейс Human.
    @Override
    public Human getPerson(int age){
        if(age < KidGirl.MAX_AGE){
            return new KidGirl();
        } else if (age < TeenGirl.MAX_AGE){
            return new TeenGirl();
        } 
        return new Woman();
    }
}
