package factorymethod.male;

import factorymethod.AbstractFactory;
import factorymethod.Human;

public class MaleFactory implements AbstractFactory{
    
    //принимает один параметр int age (возраст) и возвращает нужный объект одного из классов, реализующих интерфейс Human.
    @Override
    public Human getPerson(int age){
        if(age < KidBoy.MAX_AGE){
            return new KidBoy();
        } else if (age < TeenBoy.MAX_AGE){
            return new TeenBoy();
        } 
        return new Man();
    }
}
