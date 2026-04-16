package gun.edu.thuchanhbai6;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    } // Kết thúc hàm onCreate tại đây

    // Đưa hàm xuLyCong ra ngoài hàm onCreate [00:09:17]
    public void xuLyCong(View v) {
        // Bước 1: Tìm và tham chiếu đến các điều khiển trên giao diện [00:10:36]
        EditText edtA = findViewById(R.id.edtA);
        EditText edtB = findViewById(R.id.edtB);
        TextView tvKQ = findViewById(R.id.tvKQ);

        // Bước 2: Lấy dữ liệu dạng chuỗi [00:15:25]
        String strA = edtA.getText().toString();
        String strB = edtB.getText().toString();

        // Bước 3: Chuyển dữ liệu sang số [00:17:55]
        // Lưu ý: Nếu để trống ô nhập sẽ bị lỗi Crash, nên nhập số trước khi bấm
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        // Bước 4: Thực hiện tính toán [00:19:38]
        int tong = soA + soB;

        // Bước 5: Hiển thị kết quả [00:20:22]
        tvKQ.setText(String.valueOf(tong));
    }
}