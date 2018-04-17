package kr.or.dgit.it.codeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("xml로 작성한 액티비티");
        setContentView(R.layout.activity_layout);
    }

    public void mRightBtnClick(View view) {
        if(view.getId()==R.id.leftBtn){
            Toast.makeText(this, "leftBtn", Toast.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.rightBtn){
            finish();
        }
    }
}
