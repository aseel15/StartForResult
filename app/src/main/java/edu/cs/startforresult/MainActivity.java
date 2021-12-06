package edu.cs.startforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    int req_Code=1;
    int req_Code2=2;
    TextView txtMsg;
    TextView txtMsg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg=findViewById(R.id.txtMsg);
        txtMsg2=findViewById(R.id.txtMsg2);
    }
    public void btnGoOnClick(View view) {
        startActivityForResult(new Intent(this, MainActivity2.class), req_Code);
    }


    public void onActivityResult(int reqCode, int resultCode, Intent data){
        if(reqCode==req_Code){
            if(resultCode==RESULT_OK){

               // Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT);
                txtMsg.setText(data.getData().toString());
            }
        }
        if(reqCode==req_Code2){
            if(resultCode==RESULT_OK){

                // Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT);
                txtMsg2.setText(data.getData().toString());
            }
        }

    }

    public void btnGoOnClick2(View view) {
        startActivityForResult(new Intent(this, MainActivity3.class), req_Code2);
    }
}