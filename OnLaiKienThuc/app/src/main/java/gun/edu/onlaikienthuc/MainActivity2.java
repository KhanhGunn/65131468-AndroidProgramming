package gun.edu.onlaikienthuc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Ánh xạ các thành phần
        EditText editThang = findViewById(R.id.editTextText);
        EditText editNam = findViewById(R.id.editTextText2);
        Button btnKiemTra = findViewById(R.id.button5);
        TextView txtKetQua = findViewById(R.id.textView4);
        Button btnQuayLai = findViewById(R.id.button6);

        // Xử lý sự kiện click Kiểm tra
        btnKiemTra.setOnClickListener(v -> {
            String thang = editThang.getText().toString().trim();
            String nam = editNam.getText().toString().trim();

            if (thang.isEmpty() || nam.isEmpty()) {
                txtKetQua.setText("Vui lòng nhập đầy đủ tháng và năm!");
                return;
            }

            // Kiểm tra kết quả (Chiến dịch Hồ Chí Minh toàn thắng: 4/1975)
            if (thang.equals("4") && nam.equals("1975")) {
                txtKetQua.setText("Chính xác! Chiến dịch Hồ Chí Minh toàn thắng vào tháng 4 năm 1975.");
                txtKetQua.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            } else {
                txtKetQua.setText("Sai rồi! Hãy thử lại nhé.");
                txtKetQua.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });

        // Xử lý sự kiện click Quay lại trang chủ
        btnQuayLai.setOnClickListener(v -> {
            // Đóng Activity này để quay lại Activity trước đó (MainActivity)
            finish();
        });
    }
}