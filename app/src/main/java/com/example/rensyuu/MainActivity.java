package com.example.rensyuu;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    int Class1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタン
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // Hello World!って書いてるテキスト
        TextView textView = findViewById(R.id.textView1);
        //入力値
        int iInputnum;
        int iInputnum2;
        String string2 ="";

        //　入力値
        EditText editText = findViewById(R.id.editText1);
        SpannableStringBuilder sb = (SpannableStringBuilder)editText.getText();
        String string1 = sb.toString();
        iInputnum = Integer.parseInt(string1);

        string2 = Tasu3(iInputnum, 2);

        // string1をテキストを設定して表示
        textView.setText(string2);
    }

    int Tasu1(int iHikisuu1){
        int iRet1 = 0;

        iRet1 = iHikisuu1 + 1;


        return iRet1;

    }

    int Tasu2(int iHikisuu1, int iHikisuu2){
        int iRet1 = 0;

        iRet1 = iHikisuu1 + iHikisuu2;


        return iRet1;

    }

    String Tasu3(int iHikisuu1, int iHikisuu2){
        String strRet1 = "";

        strRet1 = "" + iHikisuu1 + iHikisuu2;


        return strRet1;

    }

    int Tasu4(int iHikisuu1){
        iClass1 += iHikisuu1;


    }


}