package gun.edu.onlaikienthuc;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // BƯỚC 1: Chuẩn bị nguồn dữ liệu (Data Source) 
        ArrayList<String> dsTenTinhThanh = new ArrayList<>();
        dsTenTinhThanh.add("Tiến Về Sài Gòn");
        dsTenTinhThanh.add("Giải Phóng Miền Nam");
        dsTenTinhThanh.add("Đất nước trọn niềm vui");
        dsTenTinhThanh.add("Bài ca thống nhất");
        dsTenTinhThanh.add("Mùa xuân trên thành phố HCM");
        dsTenTinhThanh.add("Nha Trang");
        dsTenTinhThanh.add("Khánh Hòa");

        // BƯỚC 2: Tạo bộ tiếp hợp (Adapter) 
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, 
                dsTenTinhThanh
        );

        // BƯỚC 3: Gắn Adapter vào ListView 
        ListView lvTT = findViewById(R.id.lvDanhSachTT);
        lvTT.setAdapter(adapterTinhThanh);
    }
}