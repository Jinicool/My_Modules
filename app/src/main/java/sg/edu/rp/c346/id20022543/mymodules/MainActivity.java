package sg.edu.rp.c346.id20022543.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewC346);
        textView2 = findViewById(R.id.textViewC349);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("AcademicY",2020);
                intent.putExtra("Sem",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W66M");

                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ModuleDetailActivity.class);
                intent.putExtra("ModuleCode","C349");
                intent.putExtra("ModuleName","iPad Programming");
                intent.putExtra("AcademicY",2020);
                intent.putExtra("Sem",1);
                intent.putExtra("ModuleCredit",4);
                intent.putExtra("Venue","W66M");
                startActivity(intent);
            }
        });



    }
}