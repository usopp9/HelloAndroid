package kr.or.dgit.it.codeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("코드로 작성한 액티비티");
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        Button leftBtn = new Button(this);
        leftBtn.setText("Left");
        rootLayout.addView(leftBtn);

        Button rightBtn = new Button(this);
        rightBtn.setText("Right");
        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LayoutActivity.class));
            }
        });

        rootLayout.addView(rightBtn);
        setContentView(rootLayout);
    }
}
