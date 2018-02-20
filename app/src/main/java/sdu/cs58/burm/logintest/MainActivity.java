package sdu.cs58.burm.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1.ประกาศตัวแปรเป็นjava
    TextView nameTextView;
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.ผูกตัวแปรบนjavaกับelementบนui
        nameTextView = findViewById(R.id.txvName);

        //รับค่า namestring จากหน้า login
        getNameString = getIntent().getStringExtra("nameString");
        nameTextView.setText("ยินดีต้อนรับ "+getNameString+" เข้าสู่ระบบ");
    }   //end onCreate

}   //end Class
