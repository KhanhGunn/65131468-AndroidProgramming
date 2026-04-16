package gun.edu.onlaikienthuc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        // Ánh xạ các nút bấm
        Button btnChucNang2 = findViewById(R.id.button);
        Button btnChucNang3 = findViewById(R.id.button2);
        Button btnChucNang4 = findViewById(R.id.button3);
        Button btnAboutMe = findViewById(R.id.button4);

        // Xử lý sự kiện click cho Chức năng 2
        btnChucNang2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });

        // Xử lý sự kiện click cho Chức năng 3
        btnChucNang3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent);
        });

        // Xử lý sự kiện click cho Chức năng 4
        btnChucNang4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(intent);
        });

        // Xử lý sự kiện click cho About me
        btnAboutMe.setOnClickListener(v -> {
            // Bạn có thể thêm Activity AboutMe ở đây
            // Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            // startActivity(intent);
        });
    }
}