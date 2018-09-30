package developer.r47.module1api;

import developer.r47.integrationmodule.Module1Api;

public class Module1FactoryClass {
    String className = "Module1FactoryClass";
    public int randomInt = 999;
    protected boolean isProtected = true;

    public static Module1Api getModule1Functionality() {
        return new Module1Functionality();
    }

    private int getRandomInt() {
        return randomInt;
    }

    protected boolean getProtectedBoolean() {
        return isProtected;
    }
}
