package gun.edu.ontapmenu;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<MonAn> listMonAn;
    ListView lvMonAn;
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 1. Ánh xạ
        lvMonAn = findViewById(R.id.lvMonAn);

        // 2. Tạo dữ liệu
        listMonAn = new ArrayList<>();
        listMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Mô tả cơm tấm", R.drawable.cp));
        listMonAn.add(new MonAn("Cơm gà xối mỡ", 38000, "Mô tả cơm gà", R.drawable.xm));
        listMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Mô tả cơm tấm", R.drawable.cp));
        listMonAn.add(new MonAn("Cơm gà xối mỡ", 38000, "Mô tả cơm gà", R.drawable.xm));
        listMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Mô tả cơm tấm", R.drawable.cp));
        listMonAn.add(new MonAn("Cơm gà xối mỡ", 38000, "Mô tả cơm gà", R.drawable.xm));
        listMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Mô tả cơm tấm", R.drawable.cp));
        listMonAn.add(new MonAn("Cơm gà xối mỡ", 38000, "Mô tả cơm gà", R.drawable.xm));
        listMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Mô tả cơm tấm", R.drawable.cp));
        listMonAn.add(new MonAn("Cơm gà xối mỡ", 38000, "Mô tả cơm gà", R.drawable.xm));

        // 3. Đổ dữ liệu vào Adapter
        adapter = new MonAnAdapter(this, listMonAn);
        lvMonAn.setAdapter(adapter);

        // 4. Bắt sự kiện click
        lvMonAn.setOnItemClickListener((parent, view, position, id) -> {
            MonAn selected = listMonAn.get(position);
            Toast.makeText(this, "Bạn chọn: " + selected.getTenMonAn(), Toast.LENGTH_SHORT).show();
        });
    }
}