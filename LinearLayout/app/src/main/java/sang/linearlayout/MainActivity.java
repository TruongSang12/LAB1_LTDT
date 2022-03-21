package sang.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSoA, editSoB;
    TextView textviewKetqua;
    Button Cong, Tru, Nhan, Chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }
    void TimWidget()
    {
        editSoA = (EditText) findViewById(R.id.edSoA);
        editSoB = (EditText) findViewById(R.id.edSoB);
        textviewKetqua = (TextView) findViewById(R.id.tvKQ);
        Cong = (Button) findViewById(R.id.btnCong);
        Tru = (Button) findViewById(R.id.btnTru);
        Nhan = (Button) findViewById(R.id.btnNhan);
        Chia = (Button) findViewById(R.id.btnChia);
    }
    public void XuLyCong(View v)
    {
        //Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính tổng
        int kq = a+b;
        //Chuyển tổng thành chuỗi
        String KQ = String.valueOf(kq);
        //Xuất kết quả
        textviewKetqua.setText(KQ);
    }
    public void XuLyTru(View v)
    {
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int kq = a-b;
        String KQ = String.valueOf(kq);
        textviewKetqua.setText(KQ);
    }
    public void XuLyNhan(View v)
    {
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int kq = a*b;
        String KQ = String.valueOf(kq);
        textviewKetqua.setText(KQ);
    }
    public void XuLyChia(View v)
    {
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int kq = a/b;
        String KQ = String.valueOf(kq);
        textviewKetqua.setText(KQ);
    }

}