package sang.sayhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Ham_Xin_Chao(View v)
    {
        Toast.makeText(MainActivity.this,"Xin chào, Tôi là Trương Xuân Sang", Toast.LENGTH_LONG).show();
    }
}