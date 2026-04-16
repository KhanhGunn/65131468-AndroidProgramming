package gun.edu.baithuchanh5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast; // Thêm để hiện thông báo lỗi
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Khai báo biến toàn cục
    EditText edtA, edtB, edtKQ;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 1. Tìm điều khiển (Ánh xạ ID từ XML)
        timDieuKhien();

        // 2. Thiết lập Bộ lắng nghe ẩn danh cho từng nút bấm [00:04:53]

        // Nút Cộng
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thucHienPhepToan('+');
            }
        });

        // Nút Trừ
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thucHienPhepToan('-');
            }
        });

        // Nút Nhân
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thucHienPhepToan('*');
            }
        });

        // Nút Chia
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thucHienPhepToan('/');
            }
        });
    }

    // Hàm kết nối Java với giao diện XML
    void timDieuKhien() {
        edtA = findViewById(R.id.edta);
        edtB = findViewById(R.id.editTextNumber);
        edtKQ = findViewById(R.id.edtKQ);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
    }

    // Hàm xử lý logic cho cả 4 phép tính [00:11:47]
    void thucHienPhepToan(char dau) {
        // Lấy dữ liệu từ EditText
        String chuoiA = edtA.getText().toString();
        String chuoiB = edtB.getText().toString();

        // Kiểm tra nếu người dùng chưa nhập số
        if (chuoiA.isEmpty() || chuoiB.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đủ 2 số!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Chuyển sang số thực Float để tính toán
        float a = Float.parseFloat(chuoiA);
        float b = Float.parseFloat(chuoiB);
        float ketQua = 0;

        // Xử lý từng phép toán
        switch (dau) {
            case '+': ketQua = a + b; break;
            case '-': ketQua = a - b; break;
            case '*': ketQua = a * b; break;
            case '/':
                if (b != 0) {
                    ketQua = a / b;
                } else {
                    edtKQ.setText("Lỗi: Chia cho 0");
                    return;
                }
                break;
        }

        // Hiển thị kết quả lên màn hình [00:14:59]
        edtKQ.setText(String.valueOf(ketQua));
    }
}