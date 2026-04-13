package gun.edu.ontaplistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        // BƯỚC 1: Chuẩn bị nguồn dữ liệu (Data Source)
        // Sử dụng ArrayList để dễ dàng thêm/xóa phần tử
        ArrayList<String> dsTenTinhThanh = new ArrayList<>();

        // Thêm dữ liệu trực tiếp (Hardcode)
        dsTenTinhThanh.add("Hà Nội");
        dsTenTinhThanh.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanh.add("Đồng Nai");
        dsTenTinhThanh.add("Bình Thuận");
        dsTenTinhThanh.add("Ninh Thuận");
        dsTenTinhThanh.add("Nha Trang");
        dsTenTinhThanh.add("Khánh Hòa");

        // BƯỚC 2: Tạo bộ tiếp hợp (Adapter)
        // Kết nối nguồn dữ liệu với giao diện hiển thị
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<>(
                this,                               // Ngữ cảnh (Context)
                android.R.layout.simple_list_item_1, // Bố cục mặc định của Android
                dsTenTinhThanh                      // Nguồn dữ liệu
        );

        // BƯỚC 3: Gắn Adapter vào ListView để hiển thị
        // 3.1 Tìm ListView từ giao diện XML
        ListView lvTT = findViewById(R.id.lvDanhSachTT);

        // 3.2 Gán Adapter cho ListView
        lvTT.setAdapter(adapterTinhThanh);
    }

}
