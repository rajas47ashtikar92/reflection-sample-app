package developer.r47.module2api;

import developer.r47.integrationmodule.Module2Api;

public class Module2Functionality implements Module2Api {

    public Module2Functionality(String message) {
        System.out.println("This will just print the message");
    }

    Module2Functionality() {
    }

    @Override
    public void getModule2Functionality() {
        System.out.println("Module 2 functionality will be returned from here");
    }
}
