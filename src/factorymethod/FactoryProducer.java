
package factorymethod;

import factorymethod.female.FemaleFactory;
import factorymethod.male.MaleFactory;

public class FactoryProducer {
    public static enum HumanFactoryType{
        MALE,
        FEMALE
    }
    
    public static AbstractFactory getFactory(HumanFactoryType humanType){
        if (humanType == HumanFactoryType.MALE) {
            return new MaleFactory();
        }
        return new FemaleFactory();
    }
}
