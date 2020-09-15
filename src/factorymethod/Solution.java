
package factorymethod;

import static factorymethod.FactoryProducer.HumanFactoryType.MALE;
import factorymethod.female.FemaleFactory;
import factorymethod.male.MaleFactory;

public class Solution {

    public static void main(String[] args) {
        MaleFactory maleFactory = new MaleFactory();

        System.out.println(maleFactory.getPerson(99));
        System.out.println(maleFactory.getPerson(4));
        System.out.println(maleFactory.getPerson(15));

        FemaleFactory femaleFactory = new FemaleFactory();

        System.out.println(femaleFactory.getPerson(99));
        System.out.println(femaleFactory.getPerson(4));
        System.out.println(femaleFactory.getPerson(15));
        
        System.out.println();
        System.out.println("----- Abstract factory -----");
        
        System.out.println(FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE).getPerson(15));
        System.out.println(FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.FEMALE).getPerson(5));
        System.out.println(FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE).getPerson(27));
        System.out.println(FactoryProducer.getFactory(MALE).getPerson(17));
    }
    
}
