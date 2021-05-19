package sg.edu.rp.c346.id20022543.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textViewC346);

        Intent intent = getIntent();
        String moduleCode = intent.getStringExtra("ModuleCode");
        String moduleName = intent.getStringExtra("ModuleName");
        tvAnswer.setText("This text is " + moduleCode + moduleName);

    }
}