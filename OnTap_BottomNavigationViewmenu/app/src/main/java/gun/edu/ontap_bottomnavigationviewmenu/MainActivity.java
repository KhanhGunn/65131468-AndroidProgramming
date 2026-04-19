package gun.edu.ontap_bottomnavigationviewmenu;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);
        navView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            int id = item.getItemId();

            if (id == R.id.home) selectedFragment = new HomeFragment();
            else if (id == R.id.cau1) selectedFragment = new Cau1Fragment();
            else if (id == R.id.cau2) selectedFragment = new Cau2Fragment();
            else if (id == R.id.cau3) selectedFragment = new Cau3Fragment();
            else if (id == R.id.cau4) selectedFragment = new Cau4Fragment();

            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fagmentspace, selectedFragment)
                        .commit();
            }
            return true;
        });
    }
}