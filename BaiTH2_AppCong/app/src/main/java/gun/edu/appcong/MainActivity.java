package gun.edu.appcong;

import android.os.Bundle;
// Thêm các dòng import còn thiếu dưới đây:
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Hàm xử lý sự kiện khi nhấn nút "Tính tổng"
    public void xuLyCong(View view) {
        // Bước 1: Tìm và tham chiếu đến các điều khiển
        EditText edtA = findViewById(R.id.edta);
        EditText edtB = findViewById(R.id.editTextNumber);
        EditText edtKQ = findViewById(R.id.edtKQ);

        // Bước 2: Lấy dữ liệu người dùng nhập vào
        String strA = edtA.getText().toString();
        String strB = edtB.getText().toString();

        // Bước 3: Chuyển dữ liệu từ dạng chuỗi sang số nguyên
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        // Bước 4: Thực hiện phép tính cộng
        int tong = soA + soB;

        // Bước 5: Hiển thị kết quả
        String strTong = String.valueOf(tong);
        edtKQ.setText(String.valueOf(tong));
    }
}