package kr.hs.emirim.s2019s11.mirimactivitytest1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnGoBack = findViewById(R.id.btn_goback);
        btnGoBack.setOnClickListener(btnGoBackListener);
    }

    View.OnClickListener btnGoBackListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}