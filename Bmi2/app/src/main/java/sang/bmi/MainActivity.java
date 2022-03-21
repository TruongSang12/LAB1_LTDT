package sang.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editWeight, editHeight;
    TextView textviewKQ;
    Button Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void TimWidget()
    {
        editWeight = (EditText) findViewById(R.id.edWeight);
        editHeight = (EditText) findViewById(R.id.edHeight);
        Result = (Button) findViewById(R.id.btnKQ);
        textviewKQ = (EditText) findViewById(R.id.edResult);
    }
    public void Tinh_BMI(View v)
    {
        String Weight = editWeight.getText().toString();
        String Height = editHeight.getText().toString();
        float W = Float.parseFloat(Weight);
        float H = Float.parseFloat(Height)/100;
        float BMI = W/(H*H);
        String KQ = String.valueOf(BMI);
        textviewKQ.setText(KQ);
        if (BMI < 18.5)
            Toast.makeText(MainActivity.this,"UnderWeight",Toast.LENGTH_LONG).show();
        else
        if (BMI >= 18.5 && BMI <= 24.9)
            Toast.makeText(MainActivity.this,"Normal",Toast.LENGTH_LONG).show();
        else
        if (BMI >= 25 && BMI <= 29.9)
            Toast.makeText(MainActivity.this,"OverWeight",Toast.LENGTH_LONG).show();
        else
        if (BMI >= 30 && BMI <= 39.9)
            Toast.makeText(MainActivity.this,"Obese",Toast.LENGTH_LONG).show();
        else
        if (BMI >= 40)
            Toast.makeText(MainActivity.this,"Morbidly Obese",Toast.LENGTH_LONG).show();
    }
}