package gun.edu.ontaplistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        // BẮT ĐẦU: Lắng nghe sự kiện Click trên Item [00:05:46]
        lvTT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position: chính là vị trí của phần tử vừa được nhấn [00:08:03]

                // Cách 1: Hiện vị trí phần tử (Ví dụ của tác giả [00:13:04])
                // Toast.makeText(MainActivity.this, "Bạn vừa chọn phần tử số: " + position, Toast.LENGTH_SHORT).show();

                // Cách 2: Hiện tên giá trị (Ví dụ của tác giả [00:14:08])
                String tenTinh = dsTenTinhThanh.get(position); // Lấy giá trị tại vị trí đó
                Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + tenTinh, Toast.LENGTH_SHORT).show();
            }


        });
    }
}