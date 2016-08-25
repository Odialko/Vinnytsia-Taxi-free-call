package com.example.odialko.taxi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeMyBtn();
    }

    private void initializeMyBtn() {
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
        btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btn10 = (Button)findViewById(R.id.btn10);
        btn10.setOnClickListener(this);
        btn11 = (Button)findViewById(R.id.btn11);
        btn11.setOnClickListener(this);
        btn12 = (Button)findViewById(R.id.btn12);
        btn12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btn1:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555006"));
                startActivity(intent);
                break;
            case R.id.btn2:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555058"));
                startActivity(intent);
                break;
            case R.id.btn3:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555054"));
                startActivity(intent);
                break;
            case R.id.btn4:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555055"));
                startActivity(intent);
                break;
            case R.id.btn5:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555444"));
                startActivity(intent);
                break;
            case R.id.btn6:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555222"));
                startActivity(intent);
                break;
            case R.id.btn7:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555069"));
                startActivity(intent);
                break;
            case R.id.btn8:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555077"));
                startActivity(intent);
                break;
            case R.id.btn9:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555400"));
                startActivity(intent);
                break;
            case R.id.btn10:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555550"));
                startActivity(intent);
                break;
            case R.id.btn11:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432555555"));
                startActivity(intent);
                break;
            case R.id.btn12:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+380432655777"));
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
