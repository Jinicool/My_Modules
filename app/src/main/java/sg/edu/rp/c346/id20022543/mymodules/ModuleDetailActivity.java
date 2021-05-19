package sg.edu.rp.c346.id20022543.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        output = findViewById(R.id.output);

        Intent receiveIntent = getIntent();
        String value = receiveIntent.getStringExtra("ModuleCode");
        String value1 = receiveIntent.getStringExtra("ModuleName");
        Integer value2 = receiveIntent.getIntExtra("AcademicY",2020);
        Integer value3 = receiveIntent.getIntExtra("Sem",1);
        Integer value4 = receiveIntent.getIntExtra("ModuleCredit",0);
        String value5 = receiveIntent.getStringExtra("Venue");
        output.setText("Module Code: " + value + "\nModule Name: " + value1 +"\nAcademic Year: "  + value2 +"\nSemester: "   + value3 +"\nModule Credit: "   + value4 +"\nVenue: "   + value5);


    }
}