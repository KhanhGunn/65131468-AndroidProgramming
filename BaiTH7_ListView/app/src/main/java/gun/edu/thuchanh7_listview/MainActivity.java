package gun.edu.thuchanh7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
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
    ArrayList<String> dsTenTinhThanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



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

        lvTT.setOnItemClickListener(BoLangNghevaXL);
    }

    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String tenTinh = dsTenTinhThanh.get(position);
            Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + tenTinh, Toast.LENGTH_SHORT).show();
        }
    };


}