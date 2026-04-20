package gun.edu.thigk2nguyenquockhanh;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FiguresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figures);

        ListView lvFigures = findViewById(R.id.lvFigures);

        ArrayList<HistoricalFigure> figureList = new ArrayList<>();
        figureList.add(new HistoricalFigure("Hồ Chí Minh", "Nghệ An", android.R.drawable.ic_menu_myplaces));
        figureList.add(new HistoricalFigure("Võ Nguyên Giáp", "Quảng Bình", android.R.drawable.ic_menu_compass));
        figureList.add(new HistoricalFigure("Trần Hưng Đạo", "Nam Định", android.R.drawable.ic_menu_directions));
        figureList.add(new HistoricalFigure("Nguyễn Huệ", "Bình Định", android.R.drawable.ic_menu_send));
        figureList.add(new HistoricalFigure("Phan Bội Châu", "Nghệ An", android.R.drawable.ic_menu_view));

        FigureAdapter adapter = new FigureAdapter(this, R.layout.item_figure, figureList);
        lvFigures.setAdapter(adapter);
    }
}