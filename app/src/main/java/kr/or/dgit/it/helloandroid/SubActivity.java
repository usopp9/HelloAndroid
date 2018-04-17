package kr.or.dgit.it.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(R.string.subActivity);

        TextView tv = new TextView(SubActivity.this);
        tv.setText("SubActivity 화면");
        setContentView(tv);
    }
}
