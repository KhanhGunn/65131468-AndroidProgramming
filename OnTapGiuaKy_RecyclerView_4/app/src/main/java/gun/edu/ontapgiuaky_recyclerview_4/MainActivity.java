package gun.edu.ontapgiuaky_recyclerview_4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landscapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandscape;

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

        // Chuẩn bị dữ liệu
        recyclerViewData = get_Data_For_RecycleView();

        // Tìm điều khiển và thiết lập LayoutManager
        recyclerViewLandscape = findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandscape.setLayoutManager(layoutLinear);

        // Gắn Adapter
        landscapeAdapter = new LandScapeAdapter(this, recyclerViewData);
        recyclerViewLandscape.setAdapter(landscapeAdapter);
    }

    public ArrayList<LandScape> get_Data_For_RecycleView() {
        ArrayList<LandScape> list = new ArrayList<>();
        list.add(new LandScape("img", "Cột cờ Hà Nội"));
        list.add(new LandScape("img_1", "Tháp Rùa"));
        list.add(new LandScape("img_2", "Chùa Một Cột"));
        list.add(new LandScape("img", "Phố Cổ"));
        return list;
    }
}
