package developer.r47.integrationmodule;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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

            //to get a specific method at the runtime pass the name of the method
            Method method = cls.getDeclaredMethod("getModule1Functionality");

            //since the method in question is static the object on which it needs to be called is null
            //else you can pass `clsObject` from above as the parameter to the method below

            /*the invoke(Object, obj, Object... args) method takes the object on which the method needs to be
             * invoked as a parameter, and the arguments that are required by the method you are trying to invoke
             * as the second argument*/

            /*
             * It throws `NoSuchMethodException` which you will have to handle*/
            Object object = method.invoke(null);

            //take action as the module you were looking for exists
        } catch (ClassNotFoundException e) {
            //add your fallback mechanism here
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            //add your fallback mechanism here
            e.printStackTrace();
        } catch (InstantiationException e) {
            //add your fallback mechanism here
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private void checkModule2Availability() {
        //you can add code here to practice the reflection for module 2
    }
}
