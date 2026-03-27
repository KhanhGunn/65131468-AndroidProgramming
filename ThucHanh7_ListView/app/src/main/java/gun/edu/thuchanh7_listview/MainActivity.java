package gun.edu.thuchanh7_listview;

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


        ArrayList<String> dsTenTinhThanh;
        dsTenTinhThanh = new ArrayList<>();

        // Thêm dữ liệu trực tiếp (Hardcode)
        dsTenTinhThanh.add("Hà Nội");
        dsTenTinhThanh.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanh.add("Đồng Nai");
        dsTenTinhThanh.add("Bình Thuận");
        dsTenTinhThanh.add("Ninh Thuận");
        dsTenTinhThanh.add("Nha Trang");
        dsTenTinhThanh.add("Khánh Hòa");

        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanh
        );


        ListView lvTT = findViewById(R.id.lvDanhsachTT);


        lvTT.setAdapter(adapterTinhThanh);
    }
}