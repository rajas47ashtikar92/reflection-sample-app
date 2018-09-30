package developer.r47.reflection_sample_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import developer.r47.integrationmodule.IntegrationModuleFunctionality;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntegrationModuleFunctionality integrationModuleFunctionality = new IntegrationModuleFunctionality();
        integrationModuleFunctionality.getIntegrationModuleInstance();
    }
}
