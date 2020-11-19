package kr.hs.emirim.s2019s11.mirimactivitytest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg = findViewById(R.id.rg);
    RadioButton radio2 = findViewById(R.id.radio_second);
    RadioButton radio3 = findViewById(R.id.radio_third);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNew = findViewById(R.id.btn_new_activity);
        btnNew.setOnClickListener(btnNewListener);
    }

    View.OnClickListener btnNewListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (rg.getCheckedRadioButtonId()) {
                case R.id.radio_second:
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                    break;
                case R.id.radio_third:
                    Intent intent2 = new Intent(getApplicationContext(), ThirdActivity.class);
                    startActivity(intent2);
                    break;
            }
        }
    };
}