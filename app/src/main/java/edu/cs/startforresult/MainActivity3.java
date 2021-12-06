package edu.cs.startforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {


        EditText edtMsg;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            edtMsg=findViewById(R.id.edtMsg);
        }

        public void btnDoneOnClick(View view) {

            Intent data =new Intent();
            data.setData(Uri.parse(edtMsg.getText().toString()));
            setResult(RESULT_OK, data);
            finish();

        }
    }
