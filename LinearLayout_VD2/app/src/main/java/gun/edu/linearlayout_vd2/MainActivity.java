package gun.edu.linearlayout_vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Bước 1: Khai báo các đối tượng sẽ làm việc xuyên suốt các hàm [00:18:45]
    EditText edtA, edtB, edtKQ;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Overrid
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Gọi hàm tìm điều khiển ngay khi màn hình được nạp [00:17:07]
        timDieuKhien();
    }

    // Hàm dùng để kết nối giữa Java và các ID trong XML [00:17:14]
    void timDieuKhien() {
        edtA = findViewById(R.id.edta);
        edtB = findViewById(R.id.editTextNumber);
        edtKQ = findViewById(R.id.edtKQ);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
    }

    // Xử lý phép CỘNG [00:15:05]
    public void XuLyCong(View v) {
        // Lấy dữ liệu và chuyển sang số thực Float để tính được số thập phân [00:10:18]
        float a = Float.parseFloat(edtA.getText().toString());
        float b = Float.parseFloat(edtB.getText().toString());
        float kq = a + b;
        // Hiển thị kết quả lên màn hình [00:14:59]
        edtKQ.setText(String.valueOf(kq));
    }

    // Xử lý phép TRỪ [00:27:02]
    public void XuLyTru(View v) {
        float a = Float.parseFloat(edtA.getText().toString());
        float b = Float.parseFloat(edtB.getText().toString());
        float kq = a - b;
        edtKQ.setText(String.valueOf(kq));
    }

    // Xử lý phép NHÂN [00:27:26]
    public void XuLyNhan(View v) {
        float a = Float.parseFloat(edtA.getText().toString());
        float b = Float.parseFloat(edtB.getText().toString());
        float kq = a * b;
        edtKQ.setText(String.valueOf(kq));
    }

    // Xử lý phép CHIA [00:27:42]
    public void XuLyChia(View v) {
        float a = Float.parseFloat(edtA.getText().toString());
        float b = Float.parseFloat(edtB.getText().toString());
        // Lưu ý: Chưa kiểm tra điều kiện chia cho số 0
        float kq = a / b;
        edtKQ.setText(String.valueOf(kq));
    }
}