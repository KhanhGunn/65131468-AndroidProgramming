package gun.edu.baith8_tuychinhlv;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // 1. Khai báo đúng kiểu dữ liệu ArrayList cho Món Ăn
    ListView lvMenu;
    ArrayList<MonAn> listMonAn;
    MonAnAdapter adapter;

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

        // 2. Ánh xạ ListView
        lvMenu = findViewById(R.id.lvDSMonAn);

        // 3. Khởi tạo danh sách dữ liệu
        listMonAn = new ArrayList<>();
        listMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Cơm tấm sườn nướng than hồng",R.drawable.cp));
        listMonAn.add(new MonAn("Cơm gà xối mỡ", 38000, "Gà giòn rụm kèm cơm chiên", R.drawable.st));
        listMonAn.add(new MonAn("Bún chả Hà Nội", 35000, "Bún chả chuẩn vị truyền thống", R.drawable.xm));

        // 4. Gắn Adapter
        adapter = new MonAnAdapter(this, listMonAn);
        lvMenu.setAdapter(adapter);

        // 5. Xử lý sự kiện Click
        lvMenu.setOnItemClickListener((parent, view, position, id) -> {
            // Lấy đúng đối tượng MonAn từ danh sách
            MonAn selected = listMonAn.get(position);
            Toast.makeText(this, "Bạn đã chọn: " + selected.getTenMonAn(), Toast.LENGTH_SHORT).show();
        });
    }
}