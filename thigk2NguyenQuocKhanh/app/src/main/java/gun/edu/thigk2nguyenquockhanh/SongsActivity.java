package gun.edu.thigk2nguyenquockhanh;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ListView lvSongs = findViewById(R.id.lvSongs);
        Button btnBack = findViewById(R.id.btnBackSongs);

        ArrayList<String> songList = new ArrayList<>();
        songList.add("Tiến quân ca");
        songList.add("Trường Sơn Đông Trường Sơn Tây");
        songList.add("Hò kéo pháo");
        songList.add("Giải phóng Miền Nam");
        songList.add("Nguyễn Quốc Khánh"); // Tên sinh viên
        songList.add("Cô gái Sài Gòn đi tải đạn");
        songList.add("Tiến về Sài Gòn");
        songList.add("Bác đang cùng chúng cháu hành quân");
        songList.add("Hành khúc ngày và đêm");
        songList.add("Lên đàng");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songList);
        lvSongs.setAdapter(adapter);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}