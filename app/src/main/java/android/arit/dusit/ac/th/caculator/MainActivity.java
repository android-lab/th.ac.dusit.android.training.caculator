package android.arit.dusit.ac.th.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public Button btn;
    public TextView textView;
    public EditText str1;
    public EditText str2;
    public Double number1;
    public Double number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str1 = (EditText) findViewById(R.id.editText);
        str2 = (EditText) findViewById(R.id.editText2);
        btn = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String n1 = str1.getText().toString();
                String n2 = str2.getText().toString();
                number1 = Double.parseDouble(n1);
                number2 = Double.parseDouble(n2);
                Double ans = number1 + number2;
                textView.setText(ans.toString());

            }
        });




    }
}
