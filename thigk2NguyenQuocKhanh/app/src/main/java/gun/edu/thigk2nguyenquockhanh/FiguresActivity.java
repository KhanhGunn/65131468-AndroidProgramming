package gun.edu.thigk2nguyenquockhanh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FiguresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figures);

        ListView lvFigures = findViewById(R.id.lvFigures);
        Button btnBack = findViewById(R.id.btnBackFigures);

        ArrayList<HistoricalFigure> figureList = new ArrayList<>();
        // Sử dụng các ảnh đã có trong thư mục drawable của bạn
        figureList.add(new HistoricalFigure("Hồ Chí Minh", "Nghệ An", R.drawable.hcm));
        figureList.add(new HistoricalFigure("Võ Nguyên Giáp", "Quảng Bình", R.drawable.vng));
        figureList.add(new HistoricalFigure("Trần Hưng Đạo", "Nam Định", R.drawable.thd));
        figureList.add(new HistoricalFigure("Nguyễn Huệ", "Bình Định", R.drawable.nh));
        figureList.add(new HistoricalFigure("Phan Bội Châu", "Nghệ An", R.drawable.pbc));

        FigureAdapter adapter = new FigureAdapter(this, R.layout.item_figure, figureList);
        lvFigures.setAdapter(adapter);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
