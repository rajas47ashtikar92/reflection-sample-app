package developer.r47.integrationmodule;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class IntegrationModuleFunctionality {
    public void getIntegrationModuleInstance() {
        checkModule1Availability();
    }

    private void checkModule1Availability() {
        try {
            Class cls = Class.forName("developer.r47.module1api.Module1FactoryClass");

            //this will get the public constructors for the class
            Constructor[] publicConstructors = cls.getConstructors();

            //this will get all the declared constructors for the class
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();

            //this will return only the public methods
            Method[] methods = cls.getMethods();
            //this will return all the methods declared in the class
            Method[] declaredMethods = cls.getDeclaredMethods();

            //this will get all the public fields for the class
            Field[] publicFields = cls.getFields();
            //this will get all the declared fields for the class
            Field[] declaredFields = cls.getDeclaredFields();

            Object clsObject = cls.newInstance();
        } catch (ClassNotFoundException e) {
            //add your fallback mechanism here
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            //add your fallback mechanism here
            e.printStackTrace();
        } catch (InstantiationException e) {
            //add your fallback mechanism here
            e.printStackTrace();
        }
    }

    private void checkModule2Availability() {
        //you can add code here to practice the reflection for module 2
    }
}
